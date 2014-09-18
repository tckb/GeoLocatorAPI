/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.geo.api.samples;

import com.tckb.geo.api.LocatorREST;
import com.tckb.geo.api.LocatorService;
import com.tckb.geo.stubs.Cluster;
import com.tckb.geo.stubs.Location;
import java.util.List;
import retrofit.RestAdapter.LogLevel;

/**
 *
 * @author tckb <chandra.tungathurthi@rwth-aachen.de>
 */
public class GetAllClusters {

    // Setup the api parameters
    static {
        LocatorREST.setEndPoint("http://webapps-tckb.rhcloud.com/GeoLocator/service/geo/");
        // Show all the debug messages
        LocatorREST.setVerboseLevel(LogLevel.FULL);
    }

    // Get the API 
    static LocatorService service = LocatorREST.getAPI();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get all the clusters
        List<Cluster> allCluster = service.getAllClusters();
        for (Cluster c : allCluster) {
            System.out.println("-------------------");
            System.out.println("Cluster ID: " + c.getID());
            System.out.println("Location:[ " + c.getLocation().getLatitude() + ":" + c.getLocation().getLongitude() + "]");
            System.out.println("Distance from ref: " + c.getDistanceFromRef());
            System.out.println("-------------------");
        }

        System.out.println("*********");
        
        // Setup a reference location
        Location refLoc = new Location();
        refLoc.setLatitude(54.76);
        refLoc.setLongitude(-34.44);
        // Get all the clusters with respect to the reference location
        List<Cluster> allClusterWithRef = service.getAllClusters(refLoc.getLatitude() + ";" + refLoc.getLongitude());

        for (Cluster c : allClusterWithRef) {
            System.out.println("-------------------");
            System.out.println("Cluster ID: " + c.getID());
            System.out.println("Location:[ " + c.getLocation().getLatitude() + ":" + c.getLocation().getLongitude() + "]");
            System.out.println("Distance from ref: " + c.getDistanceFromRef());
            System.out.println("-------------------");
        }
    }

}
