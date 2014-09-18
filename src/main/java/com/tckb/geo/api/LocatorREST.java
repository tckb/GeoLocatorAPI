/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.geo.api;

import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;


/**
 *
 * @author tckb <chandra.tungathurthi@rwth-aachen.de>
 */
public class LocatorREST {

    private static String endPoint = "http://webapps-tckb.rhcloud.com/GeoLocator/service/geo";
    private static LocatorService remoteService;
    private static LogLevel level = LogLevel.NONE;
    

    public static LocatorService getAPI() {
        remoteService = new RestAdapter.Builder()
                .setEndpoint(endPoint)
                .setErrorHandler(new LocatorRESTErrorHandler())
                .setLogLevel(level)
                .build()
                .create(LocatorService.class);
        return remoteService;
    }

    public static void setEndPoint(String url) {
        endPoint = url;
    }

    public static void setVerboseLevel(LogLevel l) {
        level = l;
    }

}
