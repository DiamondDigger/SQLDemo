package sql_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchangeDB {
    public static final String DB_URL = "jdbc:h2:D:\\home_Projects\\udemy\\practice-java-building-projects\\DataBase\\JDBC_H2\\db\\StockExchange";
    public static final String DB_DRIVER = "org.h2.Driver";

    public static void main(String[] args){
        try {
            Class.forName(DB_DRIVER);
            Connection connection =  DriverManager.getConnection(DB_URL);
            System.out.println("Successfully connected to DataBase! Congratulations!");

            connection.close();
            System.out.println("Interrupt dataBase connection!");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("JDBC driver is not find!");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("SQL error!");
        }
    }


}
