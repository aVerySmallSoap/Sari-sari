package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fallbackDB {
    //Creates a fallback database in-case of a connection query fails.

    public static Connection createConnection(){
        try{
            return DriverManager.getConnection("");
        }catch (SQLException ex){
            System.out.println("Fallback could not be found");
            throw new RuntimeException(ex);
        }
    }
}
