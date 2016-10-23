package filter;

import entity.HttpRequest;

/**
 * Created by Melody on 2016/10/23.
 */
public class LoggingFilter implements Filter {
    public HttpRequest doFilter ( HttpRequest request ) {
        System.out.println( "In Logging Filter - request for path: " +
                request.getBody() );
        return request;
    }
}
