/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DBConnection {
    
    private static DBConnection dbconnection;
    private java.sql.Connection con;

    public DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/pdsa_assigment","root","1234");
    }
    
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        
        if(dbconnection==null){
            dbconnection = new DBConnection();
            System.out.println("Connection Established with databse");
        }
        return dbconnection;
    }
    
    public Connection getConenction(){
     return con;
    }
    
}
