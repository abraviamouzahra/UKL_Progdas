/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalmudah;

import java.util.Scanner;
public class Uklsoalmudah {

    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int p;
        System.out.println("selamat datang di sistem pendeteksi bilangan prima");
        System.out.print("masukkan bilangan : ");
        p = masukkan.nextInt();
        if (p <= 1) {
            System.out.println(p + " bukan bilangan prima");
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                System.out.println(p + " bukan bilangan prima");
            }
        }
        System.out.println(p + " adalah bilangan prima"); 
    }
}
