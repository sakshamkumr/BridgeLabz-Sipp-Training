package RegexJunit.Junit.DataBaseConnection;

// DatabaseConnectionTest.java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach void teardown() {
        db.disconnect();
    }

    @Test void testConnection() {
        assertTrue(db.connected);
    }

    @Test void testDisconnection() {
        db.disconnect();
        assertFalse(db.connected);
    }
}
