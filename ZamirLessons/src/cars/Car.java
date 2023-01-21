/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cars;

/**
 *
 * @author Perfect
 */
public abstract class Car {
    
    String marka;
    String model;
    int qiymet;
    
    
    public abstract void start();
    
    public void stop(){
        System.out.println("masin tormuzlandi");
        start();
    }
    
}
