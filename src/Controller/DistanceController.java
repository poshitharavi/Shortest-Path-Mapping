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
import java.util.ArrayList;
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
    
    public static ArrayList<Distance> getAllDistances(){
        
        ArrayList<Distance> distanceList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection().getConenction();
            ResultSet rs = DBTransaction.retriveData(DistanceSQL.getAllDistance(), con);
            
            while(rs.next()){
                Distance dis = new Distance(rs.getInt("city_form_id"), rs.getInt("city_to_id"), rs.getInt("distance"));
                dis.setFistCityName(rs.getString("city_from_name"));
                dis.setSecCityName(rs.getString("city_to_name"));
                distanceList.add(dis);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DistanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return distanceList;
    }
}
