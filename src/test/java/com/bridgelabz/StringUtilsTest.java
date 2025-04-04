package com.bridgelabz;

import org.junit.jupiter.api.*;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setup() {
        stringUtils = new StringUtils();
    }

    @Test
    public void shouldReturnReversedString() {
        Assertions.assertEquals("cba", stringUtils.reverse("abc"));
        Assertions.assertEquals("racecar", stringUtils.reverse("racecar"));
        Assertions.assertEquals("", stringUtils.reverse(""));
        Assertions.assertNull(stringUtils.reverse(null));
    }

    @Test
    public void shouldCheckIfStringIsPalindrome() {
        Assertions.assertTrue(stringUtils.isPalindrome("racecar"));
        Assertions.assertTrue(stringUtils.isPalindrome("Mam"));
        Assertions.assertFalse(stringUtils.isPalindrome("hello"));
        Assertions.assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    public void shouldConvertStringToUpperCase() {
        Assertions.assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        Assertions.assertEquals("JAVA", stringUtils.toUpperCase("Java"));
        Assertions.assertEquals("", stringUtils.toUpperCase(""));
        Assertions.assertNull(stringUtils.toUpperCase(null));
    }
}
