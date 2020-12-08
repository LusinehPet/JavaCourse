package com.company.Homework11.Problem2;

public class Company {

    private String name;
    private String address;
    private int employees;
    private double latitude;
    private double longitude;
    private String url;

    public Company(String name, String address, int employees, double latitude, double longitude, String url) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.latitude = latitude;
        this.longitude = longitude;
        this.url = url;
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

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employees=" + employees +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", url='" + url + '\'' +
                '}';
    }
}
