/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccine;

import Person.Student;
import java.util.ArrayList;
import java.util.HashMap;


public class ImmunizationRecords {
    Student student;
    ArrayList<Vaccine> immunizationRecords = new ArrayList<>();

    public ImmunizationRecords() {
        
        
        
    }
     
    private HashMap<String, Integer>  immunizationRequirements;
    
    public void addVaccine(String vaccineName, Dose dose)
    {

        boolean vaccineExists = false;
        int maxDose = immunizationRequirements.get(vaccineName);
        Vaccine newVaccine = new Vaccine(vaccineName, vaccineName, maxDose);
        for(Vaccine vaccine : student.getVaccineList())
        {
            if(vaccine.getVaccineName().equals(vaccineName))
            {
                newVaccine = vaccine;
                vaccineExists = true;
                break;
            }
        }
        newVaccine.addDose(dose);
        newVaccine.setLatestImmunizationDate(dose.getDate());
        if(!vaccineExists)
            student.addVaccine(newVaccine);
        
    }
}
