/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alert;

import java.util.Vector;


public class AlertRecords {
    private Vector<Alert> alerts = new Vector<>();
    
    private static final AlertRecords alertRecords = new AlertRecords();
    private AlertRecords(){
        
    }
    
    public static AlertRecords getInstance(){
        return alertRecords;
    }
    
    public Vector<Alert> getAlerts(){
        return alerts;
    }
    
    public void clearRecords()
    {
         alerts = new Vector<>();
    }
    
}
