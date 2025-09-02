package com.smartcity.service;

public class AmbulanceService implements TransportService, EmergencyService {
    private final String name;
    private final double baseFare = 0.0;

    public AmbulanceService(String name) {
        this.name = name;
    }

    @Override
    public String getServiceName() { return name; }

    @Override
    public double getBaseFare() { return baseFare; }

    @Override
    public void startService() { System.out.println(name + " responding to emergency."); }

    @Override
    public void stopService() { System.out.println(name + " available."); }

    @Override
    public void printServiceDetails() {
        System.out.println("[EMERGENCY] Service: " + getServiceName());
    }
}
