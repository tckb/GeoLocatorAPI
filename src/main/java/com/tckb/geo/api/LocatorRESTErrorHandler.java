/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.geo.api;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 *
 * @author tckb <chandra.tungathurthi@rwth-aachen.de>
 */
public class LocatorRESTErrorHandler implements ErrorHandler {

    @Override
    public Throwable handleError(RetrofitError re) {

        Response r = re.getResponse();
        if (r != null && r.getStatus() == 404) {
            return new ResourceNotFound(re.getUrl());
        }
        return re;

    }

    public static class ResourceNotFound extends Exception {

        public ResourceNotFound(String string) {
            
        }
    }

    
    
    
}
