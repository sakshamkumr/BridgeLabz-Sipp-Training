package com.smartcity.model;

import java.time.LocalDateTime;

public class Trip {
    private String passenger;
    private String route;
    private double fare;
    private LocalDateTime time;

    public Trip(String passenger, String route, double fare, LocalDateTime time) {
        this.passenger = passenger;
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    public String getPassenger() { return passenger; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalDateTime getTime() { return time; }
}
