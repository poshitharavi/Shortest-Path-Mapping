/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBConnection;
import DB.DBTransaction;
import Model.City;
import Model.Distance;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.DistanceSQL;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DistanceController {
    
    public static void addNewDistance(City firstCity, City secCity, Integer distance){
        
        if(!firstCity.equals(null) || !secCity.equals(null)|| !distance.toString().equals("")){
            try {
                Distance dis = new Distance(firstCity.getCityID(), secCity.getCityID(), distance);
                Connection con = DBConnection.getDBConnection().getConenction();
                DBTransaction.modifyData(DistanceSQL.addNewDistanceSql(dis), con);
                
            } catch (Exception ex) {
                Logger.getLogger(DistanceController.class.getName()).log(Level.SEVERE, null, ex);
               
            } 
        }
    
    }
    
    public static Boolean getSelectedDistanceDetails(City firstCity, City secCity, Integer distance){
        
        try {
            Distance dis = new Distance(firstCity.getCityID(), secCity.getCityID(), distance);
            Connection con = DBConnection.getDBConnection().getConenction();
            ResultSet rs = DBTransaction.retriveData(DistanceSQL.getSelectedDistanceSql(dis), con);
            if(rs.next()){
                return false;
            }else{
                return true;
            }
            
            } catch (Exception ex) {
            Logger.getLogger(DistanceController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
    }
}
