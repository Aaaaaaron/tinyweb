package filter;

import entity.HttpRequest;

public interface Filter {
    public HttpRequest doFilter ( HttpRequest request );
}
