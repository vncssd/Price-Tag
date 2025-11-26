package src.db;

import src.exceptions.DBException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;
    private static PreparedStatement stmt = null;

    public static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        }

        catch (IOException e){
            System.out.print("ERROR! " + e.getMessage());
        }
        return null;
    }

    public static Connection getConnection(){
        if(conn==null){
            try{
                Properties props = loadProperties();
                if (props == null) throw new DBException("properties = null");
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
    }

    public static void closeStatement(){
        if(stmt != null){
            try{
                stmt.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
    }


}
