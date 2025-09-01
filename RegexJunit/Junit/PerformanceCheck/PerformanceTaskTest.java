package RegexJunit.Junit.PerformanceCheck;

// PerformanceTaskTest.java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceTaskTest {
    PerformanceTask task = new PerformanceTask();

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        task.longRunningTask(); // This will fail due to timeout
    }
}
