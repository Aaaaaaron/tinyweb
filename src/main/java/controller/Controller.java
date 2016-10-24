package controller;

import entity.HttpRequest;
import entity.HttpResponse;

/**
 * Created by Melody on 2016/10/20.
 */
public interface Controller {
    public HttpResponse handleRequest ( HttpRequest httpRequest );
}
