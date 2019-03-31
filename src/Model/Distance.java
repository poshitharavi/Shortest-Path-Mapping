/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Poshitha_Ravindu
 */
public class Distance implements Serializable{
    
    int firstCityId;
    int secCityId;
    Integer distance;

    public Distance(int firstCityId, int secCityId, Integer distance) {
        this.firstCityId = firstCityId;
        this.secCityId = secCityId;
        this.distance = distance;
    }
    
    

    public int getFirstCityId() {
        return firstCityId;
    }

    public void setFirstCityId(int firstCityId) {
        this.firstCityId = firstCityId;
    }

    public int getSecCityId() {
        return secCityId;
    }

    public void setSecCityId(int secCityId) {
        this.secCityId = secCityId;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    
    
}
