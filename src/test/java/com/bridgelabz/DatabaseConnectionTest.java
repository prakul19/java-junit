package com.bridgelabz;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
    private DatabaseConnection databaseConnection;
    @BeforeEach
    void setup() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @AfterEach
    void disconnect() {
        databaseConnection.disconnect();
    }

    @Test
    public void shouldConnectToDatabase() {
        Assertions.assertTrue(databaseConnection.isConnected());
    }

    @Test
    public void shouldDisconnectFromDatabase() {
        databaseConnection.disconnect();
        Assertions.assertFalse(databaseConnection.isConnected());
    }
}
