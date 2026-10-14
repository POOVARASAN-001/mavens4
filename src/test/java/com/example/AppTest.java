package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testStandardLeapYear() {
        App app = new App();
        assertTrue(app.isLeapYear(2024));
    }

    @Test
    public void testCenturyLeapYear() {
        App app = new App();
        assertTrue(app.isLeapYear(2000));
    }

    @Test
    public void testNonLeapYear() {
        App app = new App();
        assertFalse(app.isLeapYear(2023));
    }
}
