/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author anuragparla
 */
public class PersonFactoryProvider {
    public static PersonFactory getFactory(String choice) {
        if ("Person".equalsIgnoreCase(choice)) {
            return new PersonFactory();
        }
        else {
            return null;
        }
    }
    
}
