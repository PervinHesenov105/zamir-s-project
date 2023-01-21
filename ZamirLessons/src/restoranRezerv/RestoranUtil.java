/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoranRezerv;

import java.util.Scanner;

public class RestoranUtil {

    public static int qonaqSayi() {
        Scanner rezerv = new Scanner(System.in);
        System.out.println("Neche nefer uchun rezerv edirsiniz?");
        int Say = rezerv.nextInt();
        return Say;
    }

    public static int hansiGun() {
        Scanner rezerv = new Scanner(System.in);
        System.out.println("Heftenin nechenci gunu uchun rezerv edirsiniz?");
        int HefteninGunu = rezerv.nextInt();
        return HefteninGunu;
    }

    public static double yemekMebleg() {
        Scanner rezerv = new Scanner(System.in);
        System.out.println("Hansi metbexden sifarish edeceksiniz? \n 1.Milli \n 2.Turk \n 3.Avropa \n 4.Qarisiq");
        int Menyu = rezerv.nextInt();
        double MenyuQiymeti = 0;
        if (Menyu == 1) {
            MenyuQiymeti = 20.0;
        } else if (Menyu == 2) {
            MenyuQiymeti = 25.0;
        } else if (Menyu == 3) {
            MenyuQiymeti = 30.0;
        } else if (Menyu == 4) {
            MenyuQiymeti = 35.0;
        }
        return MenyuQiymeti;
    }

    public static double ichkiMebleg() {
        Scanner rezerv = new Scanner(System.in);
        System.out.println("Ichecek ne sifarish edeceksiniz?");
        String Ichki = rezerv.nextLine();

        double IchkiQiymeti = 0;
        if (Ichki.equalsIgnoreCase("Adi su")) {
            IchkiQiymeti = 0.0;
        } else if (Ichki.equalsIgnoreCase("Qazli su")) {
            IchkiQiymeti = 2.0;
        } else if (Ichki.equalsIgnoreCase("Meyve suyu")) {
            IchkiQiymeti = 3.0;
        } else if (Ichki.equalsIgnoreCase("Hamisindan")) {
            IchkiQiymeti = 2.5;
        }
        return IchkiQiymeti;
    }

    public static double totalMebleg(int Say, double MenyuQiymeti, double IchkiQiymeti) {
        double totalMebleg = (Say * (MenyuQiymeti + IchkiQiymeti)) * 1.18;
        return totalMebleg;
    }

    public static void cekYazdir(int say, int gun, double totalMebleg) {
        if (say < 5 && gun < 6) {
            System.out.println("Yeriniz rezerv edildi. Odeyeceyiniz mebleg: " + totalMebleg);
        } else if (say < 5 && gun >= 6) {
            System.out.println("Yeriniz rezerv edildi. Odeyeceyiniz mebleg: " + totalMebleg * 1.25);
        } else if (say >= 5 && gun < 6) {
            System.out.println("Yeriniz rezerv edildi. Odeyeceyiniz mebleg: " + totalMebleg * 0.9);
        } else if (say >= 5 && gun >= 6) {
            System.out.println("Yeriniz rezerv edildi. Odeyeceyiniz mebleg: " + (totalMebleg * 0.9) * 1.25);
        }
    }

    public static void masaHesabla() {
        int say = qonaqSayi();
        int gun = hansiGun();
        double yemekPulu = yemekMebleg();
        System.out.println("yemek pulu: " + yemekPulu);
        double ichkiPulu = ichkiMebleg();
        System.out.println("icki pulu: " + ichkiPulu);
        double totalMebleg = totalMebleg(say, yemekPulu, ichkiPulu);
        System.out.println("total: " + totalMebleg);
        cekYazdir(say, gun, totalMebleg);
    }
}
