/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uklsoalsulit;

import java.util.Scanner;

public class Uklsoalsulit {

    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.println("mari menghitung rata-rata kehadiran siswa");

        int a;
        int total = 0;
        int rata2;

        System.out.print("jumlah siswa : ");
        a = masukkan.nextInt();

        int[] hadir = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("masukkan jumlah hadir siswa ke-" + (i + 1) + " : ");
            hadir[i] = masukkan.nextInt();
            total += hadir[i];
        }

        System.out.println("");

        System.out.println("rekap kehadiran siswa selama 1 bulan (jumlah hari kerja : 24 hari");
        for (int i = 0; i < a; i++) {
            System.out.println("siswa ke-" + (i + 1) + " : " + hadir[i] + " hari hadir");
        }

        rata2 = total / a;
        System.out.println("rata rata kehadiran siswa " + rata2 + " hari");

        System.out.println("");

        System.out.println("kesimpulan");
        System.out.println("siswa dengan kehadiran di atas rata-rata:");
        for (int i = 0; i < a; i++) {
            if (hadir[i] > rata2) {
                System.out.println("siswa ke-" + (i + 1) + " dengan " + hadir[i] + " hari hadir.");
            }
        }

        System.out.println("");

        System.out.println("siswa dengan kehadiran di bawah rata-rata:");
        for (int i = 0; i < a; i++) {
            if (hadir[i] < rata2) {
                System.out.println("siswa ke-" + (i + 1) + " dengan " + hadir[i] + " hari hadir.");
            }
        }
    }
}
