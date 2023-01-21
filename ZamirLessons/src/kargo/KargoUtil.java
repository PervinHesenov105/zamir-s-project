/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kargo;

import java.util.Scanner;

/**
 *
 * @author Perfect
 */
public class KargoUtil {

    public static int sifarisSayi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bu bizden necenci sifarisinizdir?");
        int say = sc.nextInt();
        return say;
    }

    public static double mesafeOdenisi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Catdirilacaq mesafeni daxil edin: ");
        double km = sc.nextDouble();
        double mesafeOdenis = 0;
        if (km > 2) {
            mesafeOdenis = km * 0.4;
        }
        return mesafeOdenis;

    }

    public static double cekiOdenisi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mehsulun cekisini daxil edin: ");
        double kq = sc.nextDouble();
        double cekiOdenis = 0;
        if (kq > 0 && kq < 0.5) {
            cekiOdenis = kq * 0.5;
        } else if (kq >= 0.5 && kq < 1) {
            cekiOdenis = kq * 0.7;
        } else if (kq >= 1 && kq < 5) {
            cekiOdenis = kq * 1.5;
        } else if (kq >= 5 && kq < 10) {
            cekiOdenis = kq * 2.2;
        } else if (kq >= 10 && kq <= 20) {
            cekiOdenis = kq * 3;
        }
        return 0;
    }

    public static double mebleg(double cekiOdenis, double mesafeOdenis) {
        double mebleg = (cekiOdenis + mesafeOdenis) + (cekiOdenis + mesafeOdenis) * 0.18;

        return mebleg;
    }

    public static void cekYazdir(int say, double mebleg) {
        if (say > 3) {
            System.out.println("sizin odeyeceyiniz mebleg: " + (mebleg - mebleg * 0.2));
        } else {
            System.out.println("sizin odeyeceyiniz mebleg: " + (mebleg));
        }
    }

    public static void kargoHesabla() {
        int say = sifarisSayi();
        double ceki = cekiOdenisi();
        double mesafe = mesafeOdenisi();
        double mebleg = mebleg(ceki, mesafe);
        cekYazdir(say, mebleg);
    }
}
