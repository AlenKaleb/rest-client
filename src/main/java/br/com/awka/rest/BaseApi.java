package br.com.awka.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

public class BaseApi {

    @Context
    protected HttpServletRequest httpRequest;

    public HttpServletRequest getHttpRequest() {
        return httpRequest;
    }

}
