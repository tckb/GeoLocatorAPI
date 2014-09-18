/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.geo.api.samples;

import com.tckb.geo.api.LocatorREST;
import com.tckb.geo.api.LocatorService;
import com.tckb.geo.stubs.Device;
import com.tckb.geo.stubs.Location;
import retrofit.client.Response;

/**
 *
 * @author tckb <chandra.tungathurthi@rwth-aachen.de>
 */
public class CreateDevice {

    // set up the api
    static LocatorService service = LocatorREST.getAPI();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create  device
        Device d = new Device();
        d.setDevID("dev-1");
        d.setName("RESTApiSampledev-1");
        d.setClustID("cluster1");
        d.setWeight(1.0);
        // Setup location of the device
        Location devLoc = new Location();
        devLoc.setLatitude(54.76);
        devLoc.setLongitude(-34.44);
        // set device location
        d.setLocation(devLoc);

        // Now register the device with the server
        Response r = service.registerDevice(d);

        // Check if device is successfully registered
        if (r.getStatus() == 200) {
            System.out.println("Device registered successfully!");
        } else {
            System.out.println("Device register failed! ");
        }

    }

}
