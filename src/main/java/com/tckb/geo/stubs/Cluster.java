
package com.tckb.geo.stubs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Cluster {

    private String ID;
    private Double distanceFromRef;
    private Location_ location;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 
     * @param ID
     *     The ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 
     * @return
     *     The distanceFromRef
     */
    public Double getDistanceFromRef() {
        return distanceFromRef;
    }

    /**
     * 
     * @param distanceFromRef
     *     The distanceFromRef
     */
    public void setDistanceFromRef(Double distanceFromRef) {
        this.distanceFromRef = distanceFromRef;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location_ getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location_ location) {
        this.location = location;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
