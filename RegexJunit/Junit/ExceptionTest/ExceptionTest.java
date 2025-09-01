package RegexJunit.Junit.ExceptionTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {
    @Test void testDivideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}

