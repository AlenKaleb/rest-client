package br.com.awka.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

public class BaseRest {

    @Context
    protected HttpServletRequest httpServletRequest;

    public HttpServletRequest getHttpServletRequest() {
        return httpServletRequest;
    }
}
