package controller;

import entity.HttpRequest;
import entity.HttpResponse;
import exception.ControllerException;
import view.View;

import java.util.List;
import java.util.Map;

public abstract class TemplateController implements Controller {
    private View view;

    public TemplateController ( View view ) {
        this.view = view;
    }

    protected abstract Map< String, List< String > > doRequest ( HttpRequest httpRequest);

    public HttpResponse handleRequest ( HttpRequest request ) {
        Integer responseCode = 200;
        String responseBody = "";

        try {
            Map model = doRequest( request );
            responseBody = view.render( model );
        } catch ( ControllerException e ) {
            responseCode = 500;
            responseBody = "Exception while rendering";
        }
        catch ( Exception e ) {
            responseCode = 500;
        }

        return HttpResponse.Builder.newBuilder()
                .body( responseBody )
                .responseCode( responseCode )
                .build();
    }
}
