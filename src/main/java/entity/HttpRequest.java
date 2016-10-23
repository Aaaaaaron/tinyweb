package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Melody on 2016/10/19.
 */
public class HttpRequest {
    private Map< String, String > headers;
    private String body;
    private String path;

    public Map< String, String > getHeaders () {
        return headers;
    }

    public String getBody () {
        return body;
    }

    public String getPath () {
        return path;
    }

    public static class Builder {
        private Map< String, String > headers;
        private String body;
        private String path;

        private Builder () {
            headers = new HashMap< String, String >();
        }

        public Builder addHeader ( String name, String value ) {
            headers.put( name, value );
            return this;
        }

        public Builder body ( String body ) {
            this.body = body;
            return this;
        }

        public Builder path ( String path ) {
            this.path = path;
            return this;
        }

        public static Builder newBuilder () {
            return new Builder();
        }

        public static Builder builderForm ( HttpRequest httpRequest ) {
            Builder builder = new Builder();
            builder.path = httpRequest.getPath();
            builder.body = httpRequest.getBody();
            Map< String, String > headers = httpRequest.getHeaders();
            for ( String headerName : headers.keySet() )
                builder.addHeader( headerName, headers.get( headerName ) );
            return builder;
        }
    }

}
