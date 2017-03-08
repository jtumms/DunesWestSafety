package com.tummsmedia.duneswestsafety;

/**
 * Created by john.tumminelli on 3/7/17.
 */

public class Marker {
    String name;
    String address;
    double lat;
    double lng;
    String type;

    public Marker() {
    }

    public Marker(String name, String address, double lat, double lng, String type) {
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
