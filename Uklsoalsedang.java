/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoalsedang;


public class Uklsoalsedang {

    public static void main(String[] args) {
        System.out.println("halo, selamat datang di tabunganmu!");
        int a = 100000;
        int total = 0;
        for (int i = 1; i <13; i++){
            System.out.println("tabungan bulan ke-"+i+" : Rp."+a);
            total += a;
            a += 50000;
        }
        System.out.println("total tabungan selama 12 bulan adalah Rp."+total);
    }
}

