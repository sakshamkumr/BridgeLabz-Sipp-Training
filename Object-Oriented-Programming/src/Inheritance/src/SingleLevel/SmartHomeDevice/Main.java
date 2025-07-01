package SingleLevel.SmartHomeDevice;

public class Main {
    public static void main(String[] args) {
        Thermostat myThermostat = new Thermostat("THERMO123", true, 22.5);
        myThermostat.displayStatus();
    }
}
