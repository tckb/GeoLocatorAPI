
package com.tckb.geo.stubs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Device {

    private String clustID;
    private String creationTime;
    private String devID;
    private Location location;
    private String name;
    private Double weight;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The clustID
     */
    public String getClustID() {
        return clustID;
    }

    /**
     * 
     * @param clustID
     *     The clustID
     */
    public void setClustID(String clustID) {
        this.clustID = clustID;
    }

    /**
     * 
     * @return
     *     The creationTime
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * 
     * @param creationTime
     *     The creationTime
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 
     * @return
     *     The devID
     */
    public String getDevID() {
        return devID;
    }

    /**
     * 
     * @param devID
     *     The devID
     */
    public void setDevID(String devID) {
        this.devID = devID;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
