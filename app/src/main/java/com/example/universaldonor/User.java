package com.example.universaldonor;

public class User {

    private String userName;
    private String userId;
    private String bloodGroup;
    private String points;
    private String numDonations;
    private long level;
    private String address;
    private double latitude;
    private double longitude;
    private long mobileNumber;

    public User(){

    }

    public User(String userName, String userId, String bloodGroup, String points, String numDonations, long level, String address, double latitude, double longitude, long mobileNumber) {
        this.userName = userName;
        this.userId = userId;
        this.bloodGroup = bloodGroup;
        this.points = points;
        this.numDonations = numDonations;
        this.level = level;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPoints() {
        return points;
    }

    public String getNumDonations() {
        return numDonations;
    }

    public long getLevel() {
        return level;
    }

    public String getAddress() {
        return address;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
}
