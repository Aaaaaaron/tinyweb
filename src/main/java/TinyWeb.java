import controller.Controller;
import entity.HttpRequest;
import entity.HttpResponse;
import filter.Filter;

import java.util.List;
import java.util.Map;

/**
 * Created by Melody on 2016/10/21.
 */
public class TinyWeb {
    private Map< String, Controller > controllers;
    private List< Filter > filters;

    public TinyWeb ( Map< String, Controller > controllers, List< Filter > filters ) {
        this.controllers = controllers;
        this.filters = filters;
    }

    public HttpResponse handRequest ( HttpRequest httpRequest ) {
        HttpRequest currentRequest = httpRequest;
        for ( Filter filter : filters ) {
            currentRequest = filter.doFilter( currentRequest );
        }

        Controller controller = controllers.get( currentRequest.getPath() );
            if ( null == controller )
                return null;
            return controller.handleReauest( currentRequest );
    }
}
