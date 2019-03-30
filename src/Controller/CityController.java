/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBConnection;
import DB.DBTransaction;
import Model.City;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.CitySql;

/**
 *
 * @author Poshitha_Ravindu
 */
public class CityController {
    
    public static Boolean addNewCity(String cityName){
        
        try {
            Connection con = DBConnection.getDBConnection().getConenction();
            DBTransaction.modifyData(CitySql.addNewCitySQL(cityName), con);
        } catch (Exception ex) {
            Logger.getLogger(CityController.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        return true;
    } 
    
    public static Boolean searchExistingCity(String cityName){
        try {
            Connection con = DBConnection.getDBConnection().getConenction();
           ResultSet rs = DBTransaction.retriveData(CitySql.getExistingCitySql(cityName), con);
            if(rs.next()){
                return false;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CityController.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        return true;
        
    }
    
    /**
     *
     * @return
     */
    public static ArrayList<City> getAllCities(){
        
        ArrayList<City> cityList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection().getConenction();
            ResultSet rs = DBTransaction.retriveData(CitySql.getAllCitiesSql(), con);
            
            while(rs.next()){
                City city = new City(); 
                city.setCityID(rs.getInt("idcity"));
                city.setCityName(rs.getString("city_name"));
                cityList.add(city);
            }
        } catch (Exception ex) {
            Logger.getLogger(CityController.class.getName()).log(Level.SEVERE, null, ex);
            cityList = null;
        } 
        
        return cityList;
    }
}
