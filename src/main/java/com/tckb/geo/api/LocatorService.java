/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.geo.api;

import com.tckb.geo.stubs.Cluster;
import com.tckb.geo.stubs.Device;
import com.tckb.geo.stubs.Location;
import java.util.List;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 *
 * @author tckb <chandra.tungathurthi@rwth-aachen.de>
 */
public interface LocatorService {

    @GET("/getAllClusters")
    public List<Cluster> getAllClusters();

    @GET("/getAllClusters")
    public List<Cluster> getAllClusters(@Query("ref") String refLoc);

    @GET("/getAllDevices")
    public List<Device> getAllDevice();

    @GET("/getClusterThreshold")
    public double getClusterThreshold();

    @GET("/setClusterThreshold/{thresh}")
    public void setClusterThrehold(@Path("thresh") double threhold);

    @GET("/getCluster")
    public Cluster getCluster(@Query("id") String clusterID) ;

    @GET("/getCluster")
    public List<Cluster> getClusters(@Query("ref") String refLoc);

    @GET("/getCluster")
    public List<Cluster> getClusters(@Query("ref") String refLoc, @Query("rad") double radius);
    
    @POST("/registerDevice")
    public Response registerDevice(@Body Device device);
    
    @POST("/getLocationString")
    public String getLocationString(@Body Location l);

}
