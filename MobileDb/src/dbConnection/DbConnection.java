package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
	public static Connection connect(String location) {
	    String dbPrefix = "jdbc:sqlite:";
	    Connection connection;
	    try {
	        connection = DriverManager.getConnection(dbPrefix + location);
	        System.out.println("Connected to database");
	    } catch (SQLException exception) {
	    	Logger.getAnonymousLogger().log(Level.SEVERE,
	                LocalDateTime.now() + ": Could not connect to SQLite DB at " +
	                        location);
	        return null;
	    }
	    return connection;
	}
}
