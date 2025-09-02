package com.smartcity.service;

public interface TransportService {
    String getServiceName();
    double getBaseFare();
    void startService();
    void stopService();

    default void printServiceDetails() {
        System.out.println("Service: " + getServiceName() + ", Base Fare: " + getBaseFare());
    }
}
