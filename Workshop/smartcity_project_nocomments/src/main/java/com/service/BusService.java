package com.smartcity.service;

public class BusService implements TransportService {
    private final String name;
    private final double baseFare;

    public BusService(String name, double baseFare) {
        this.name = name;
        this.baseFare = baseFare;
    }

    @Override
    public String getServiceName() { return name; }

    @Override
    public double getBaseFare() { return baseFare; }

    @Override
    public void startService() { System.out.println(name + " started."); }

    @Override
    public void stopService() { System.out.println(name + " stopped."); }
}
