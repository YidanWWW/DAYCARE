/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import vaccine.Vaccine;


public class VaccineFactory {

    public Vaccine create(String csvData) {
        return new Vaccine(csvData);
    }
    
   public Vaccine create(String vaccineName, 
                          String vaccineDescription,int maxDoses) {
        return new Vaccine (vaccineName,vaccineDescription,maxDoses);
    }

    
}
