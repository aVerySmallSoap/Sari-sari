package Database.Databases;

import Database.Interfaces.IDatabaseConnector;
import Database.fallbackDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class CustomersDB implements IDatabaseConnector {
    @Override
    public Connection getDatabaseConnection() {
        try{
            return DriverManager.getConnection("");
        }catch (SQLException ex){
            System.out.println("Error code:"+ex.getSQLState());
            System.out.println("Connecting to a fallback...");
            return fallbackDB.createConnection();
        }
    }
}
