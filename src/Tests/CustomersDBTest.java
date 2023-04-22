package Tests;

import Database.Databases.CustomersDB;
import Database.Interfaces.IDatabaseConnector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomersDBTest {
    IDatabaseConnector Database;
    @BeforeEach
    void setDatabase(){
        Database = new CustomersDB();
    }

    @Test
    void nullConnection(){
        assertThrows(RuntimeException.class, () -> Database.getDatabaseConnection());
    }
}