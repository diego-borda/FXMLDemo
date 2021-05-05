/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.core;

/**
 *
 * @author Sistemas-02
 */
public class MonedasConversion {
    public float Cord_Dolar(float cord){
     return (float) (cord*0.028);       
    }
    
    public float Cord_Euro( float cord){
     return (float) (cord*0.024);       
    }
    
    public float Dolar_Cord( float dolar){
     return (float) (dolar*35.17);       
    }
    
    public float Dolar_Euro( float dolar){
     return (float) (dolar*0.83);       
    }
    
    public float Euro_Cord( float euro){
     return (float) (euro*42.20);       
    }
    
    public float Euro_Dolar(float euro){
     return (float) (euro*1.20);       
    }
}
