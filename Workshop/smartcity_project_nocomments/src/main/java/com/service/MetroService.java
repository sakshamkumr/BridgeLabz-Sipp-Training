package com.smartcity.service;

public class MetroService implements TransportService {
    private final String name;
    private final double baseFare;

    public MetroService(String name, double baseFare) {
        this.name = name;
        this.baseFare = baseFare;
    }

    @Override
    public String getServiceName() { return name; }

    @Override
    public double getBaseFare() { return baseFare; }

    @Override
    public void startService() { System.out.println(name + " departs."); }

    @Override
    public void stopService() { System.out.println(name + " halted."); }
}
