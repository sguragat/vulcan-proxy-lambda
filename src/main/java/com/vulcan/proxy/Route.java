package com.vulcan.proxy;

/**
 * Created by sg on 28/07/2018.
 */
@FunctionalInterface
public interface Route {

    Response handleRequest(Request request, Context context);
}
