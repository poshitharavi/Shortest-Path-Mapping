/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import Model.Distance;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DistanceSQL {
 
    public static String addNewDistanceSql(Distance dis){
        
        String sql = "INSERT INTO `pdsa_assigment`.`distance` (`distance`, `city_form_id`, `city_to_id`) VALUES ('"+dis.getDistance()+"', '"+dis.getFirstCityId()+"', '"+dis.getSecCityId()+"');";
        return sql;
    }
    
    public static String getSelectedDistanceSql(Distance dis){
        
        String sql ="SELECT iddistance, distance, city_form_id, city_to_id FROM pdsa_assigment.distance WHERE city_form_id = "+dis.getFirstCityId()+" AND city_to_id="+dis.getSecCityId();
        return sql;
    }
    
    public static String getAllDistance(){
        
        String sql = "SELECT iddistance, distance, city_form_id, city_to_id , cf.city_name AS city_from_name , ct.city_name AS city_to_name "
                + "FROM pdsa_assigment.distance d "
                + "INNER JOIN pdsa_assigment.city cf ON city_form_id = cf.idcity "
                + "INNER JOIN pdsa_assigment.city ct ON city_to_id = ct.idcity ;";
        
        return sql;
    }
}
