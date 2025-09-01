package RegexJunit.Junit.DataBaseConnection;

// DatabaseConnection.java
public class DatabaseConnection {
    public boolean connected = false;
    public void connect() { connected = true; }
    public void disconnect() { connected = false; }
}
