package Database.Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDatabaseConnector {
    Connection getDatabaseConnection() throws SQLException;
}
