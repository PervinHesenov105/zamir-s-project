/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zamirlessons;

import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class Util {
    public static void faranheyt() {
        Scanner temperatur = new Scanner(System.in);
        System.out.println("Temperaturun derecesi:");
        int temp = temperatur.nextInt();
        temperatur = new Scanner(System.in);
        System.out.println("Olchu vahidi:");
        String ForC = temperatur.nextLine();
        double cf = 23.0 / (5.0 / 9.0) + 32;

        if (ForC.equalsIgnoreCase("F") && temp < cf) {
            System.out.println("Kondisioneri 23C-ye qeder artir");
        } else if (ForC.equalsIgnoreCase("F") && temp > cf) {
            System.out.println("Kondisioneri 23C-ye qeder azalt");
        } else if (ForC.equalsIgnoreCase("C") && temp < 23) {
            System.out.println("Kondisioneri 23C-ye qeder artır");
        } else if (ForC.equalsIgnoreCase("C") && temp > 23) {
            System.out.println("Kondisioneri 23C-ye qeder azalt");
        } else {
            System.out.println("Otaq temperaturu quvvededir");
        }
    }
    
    
    public static int eli(int a , int b){
        
        return a+b;
    }
}

