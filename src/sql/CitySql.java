/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author Poshitha_Ravindu
 */
public class CitySql {
    
    public static String addNewCitySQL(String cityName){
        
        String sql = "INSERT INTO `pdsa_assigment`.`city` (`city_name`) VALUES ('"+cityName+"'); ";
        return sql;
    }
    
    public static String getExistingCitySql(String cityName){
        String sql = "SELECT city_name FROM pdsa_assigment.city where city_name = '"+cityName+"'";
        return sql;
    }
    
    public static String getAllCitiesSql(){
        String sql = "SELECT * FROM pdsa_assigment.city";
        return sql;
    }
    
    public static String getAllCitiesExistsSql(){
        String sql = "SELECT *\n" +
                        "FROM   city \n" +
                        "WHERE  EXISTS (SELECT city_form_id \n" +
                        "FROM   distance \n" +
                        "WHERE  city.idcity = distance.city_form_id or  city.idcity = distance.city_to_id) order by city.city_name";
        return sql;
    }
    
    
}
