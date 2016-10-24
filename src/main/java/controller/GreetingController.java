package controller;

import entity.HttpRequest;
import entity.HttpResponse;
import view.View;

import java.util.*;

/**
 * Created by Melody on 2016/10/21.
 */
public class GreetingController extends TemplateController {
    private Random random;

    public GreetingController ( View view ) {
        super( view );
        random = new Random();
    }

    @Override
    protected Map< String, List< String > > doRequest ( HttpRequest httpRequest ) {
        Map< String, List< String > > helloModle = new HashMap< String, List< String > >();
        helloModle.put( "greetings", generateGreetings( httpRequest.getBody() ) );
        return helloModle;
    }

    private List< String > generateGreetings ( String namesCommaSeperated ) {
        String[] names = namesCommaSeperated.split( "," );
        List< String > greetings = new ArrayList< String >();
        for ( String name : names ) {
            greetings.add( makeGreeting( name ) );
        }
        return greetings;
    }

    private String makeGreeting ( String name ) {
        String[] greetings = {
                "hello" , "Greetings" , "Salutations" , "Hola"
        };
        String greetingPrefix = greetings[ random.nextInt( 4 ) ];
        return String.format( "%s, %s", greetingPrefix, name );
    }
}
