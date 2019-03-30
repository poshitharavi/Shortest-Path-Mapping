/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DBTransaction {
    
   public static ResultSet retriveData(String sqlString , Connection con) throws Exception {
		ResultSet resultSet = null;
		System.out.println(sqlString);
		Statement stat = con.createStatement();
		resultSet = stat.executeQuery(sqlString);
		
		return resultSet;
	}
	
	public static void modifyData(String sqlString , Connection con) throws Exception {
		System.out.println(sqlString);
		Statement stat = con.createStatement();
		stat.executeUpdate(sqlString);
		stat.close();
	}
	
}
