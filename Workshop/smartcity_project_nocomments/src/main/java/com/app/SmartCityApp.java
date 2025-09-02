package com.smartcity.app;

import com.smartcity.model.*;
import com.smartcity.service.*;
import com.smartcity.utils.GeoUtils;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCityApp {
    public static void main(String[] args) {
        List<TransportService> services = new ArrayList<>();
        services.add(new BusService("Bus-101", 2.5));
        services.add(new BusService("Bus-102", 3.0));
        services.add(new MetroService("Metro-A", 1.5));
        services.add(new TaxiService("Taxi-X", 5.0));
        services.add(new AmbulanceService("Amb-1"));

        List<Trip> trips = Arrays.asList(
            new Trip("Alice", "Route-1", 2.5, LocalDateTime.now().minusHours(2)),
            new Trip("Bob", "Route-1", 3.0, LocalDateTime.now().minusHours(1)),
            new Trip("Charlie", "Route-2", 1.5, LocalDateTime.now().minusMinutes(30)),
            new Trip("Daisy", "Route-3", 5.0, LocalDateTime.now().minusMinutes(10)),
            new Trip("Eve", "Route-1", 2.5, LocalDateTime.now().minusMinutes(5))
        );

        System.out.println("--- Available services (sorted by fare) ---");
        services.stream()
                .filter(s -> !(s instanceof EmergencyService))
                .sorted(Comparator.comparingDouble(TransportService::getBaseFare))
                .forEach(TransportService::printServiceDetails);

        Optional<TransportService> chosen = services.stream()
                .filter(s -> !(s instanceof EmergencyService))
                .min(Comparator.comparingDouble(TransportService::getBaseFare));

        System.out.println();
        chosen.ifPresent(s -> System.out.println("Booking confirmed with: " + s.getServiceName()));

        System.out.println("\n--- Dashboard: Active Services ---");
        services.forEach(TransportService::printServiceDetails);

        System.out.println("\n--- Revenue Summary by Route ---");
        Map<String, Double> revenueByRoute = trips.stream()
                .collect(Collectors.groupingBy(
                        Trip::getRoute,
                        Collectors.summingDouble(Trip::getFare)
                ));
        revenueByRoute.forEach((route, total) ->
                System.out.println(route + " -> total revenue: " + total));

        System.out.println("\n--- Fare Statistics ---");
        DoubleSummaryStatistics stats = trips.stream()
                .collect(Collectors.summarizingDouble(Trip::getFare));
        System.out.println(stats);

        System.out.println("\n--- Peak vs Non-Peak Partition ---");
        Map<Boolean, List<Trip>> partition = trips.stream()
                .collect(Collectors.partitioningBy(t -> t.getTime().getHour() >= 18));
        System.out.println("Peak trips: " + partition.get(true).size());
        System.out.println("Non-peak trips: " + partition.get(false).size());

        System.out.println("\n--- Emergency Services Priority ---");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> {
                    System.out.println("PRIORITIZE: " + s.getServiceName());
                    s.printServiceDetails();
                });

        double dist = GeoUtils.calculateDistance(12.9716,77.5946,12.2958,76.6394);
        System.out.println("\nDistance example (km): " + dist);
    }
}
