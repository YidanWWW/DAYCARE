/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;


public class VaccineFactoryProvider {
    public static VaccineFactory getFactory(String choice) {
        if ("Vaccine".equalsIgnoreCase(choice)) {
            return new VaccineFactory();
        }
        else {
            return null;
        }
    }
}
