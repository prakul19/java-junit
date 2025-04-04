package com.bridgelabz;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    private final Performance performance = new Performance();
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void shouldFailIfLongRunningTaskExceedsTimeLimit() throws InterruptedException {
        Assertions.assertEquals("task Completed", performance.longRunningTask());
    }
}
