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
        Device device = new Device();
        device.setDevID("dev-1");
        device.setName("RESTApiSampledev-1");
        device.setClusterID("cluster1");

        //TODO: Intended for future suignal accuracy feature implementation
        device.setWeight(1.0);
        // Setup location of the device
        Location location = new Location();
        location.setLatitude(54.76);
        location.setLongitude(-34.44);
        // set device location
        device.setLocation(location);

        // Now register the device with the server
        Response response = service.registerDevice(device);

        // Check if device is successfully registered
        if (response.getStatus() == 200) {
            System.out.println("Device registered successfully!");
        } else {
            System.out.println("Device register failed! ");
        }

    }

}
