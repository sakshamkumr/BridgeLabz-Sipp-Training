package RegexJunit.Junit.StringUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtil utils = new StringUtil();

    @Test void testReverse() { assertEquals("cba", utils.reverse("abc")); }
    @Test void testPalindromeTrue() { assertTrue(utils.isPalindrome("madam")); }
    @Test void testPalindromeFalse() { assertFalse(utils.isPalindrome("hello")); }
    @Test void testToUpperCase() { assertEquals("HELLO", utils.toUpperCase("hello")); }
}
