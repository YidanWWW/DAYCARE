/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

//import java.time.LocalDate;
import Person.Person;
import java.util.Date;
import vaccine.Vaccine;

/**
 *
 * @author anuragparla
 */
public interface DayCareModelInterface {
    Person createPersonViaCsv(String csvData);
    Person createStudentViaForm(String firstName, String lastName,int age, 
                              double gpa,String fatherName, String motherName,
                              String address,String phoneNumber, Date walkInDate);
    Person createTeacherViaForm(String firstName, String lastName, int age, 
                              int credits, Date reviewDate);
    Vaccine addImmunizationRecordViaForm( String vaccineName, 
                               String vaccineDescription,int maxDoses);
    
    Vaccine addImmunizationRecordViaCsv(String csvData);
    
    
    
    
    
    
    
}
