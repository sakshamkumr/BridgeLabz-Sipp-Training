package com.smartcity.service;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double baseFare, double distanceKm);

    static FareCalculator defaultCalculator() {
        return (base, km) -> base + km * 0.5;
    }
}
