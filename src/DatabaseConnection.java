/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=LMS;encrypt=true;trustServerCertificate=true";
    private static final String USER = "admins";
    private static final String PASSWORD = "a@123456";
//Abstract Method to hide DB connection detials
    public static Connection getConnection()  {
        try{
           return DriverManager.getConnection(URL, USER, PASSWORD); 
        }catch (SQLException e){
            throw new RuntimeException("DataBase connection faild!",e);
        }
        
    }
}


