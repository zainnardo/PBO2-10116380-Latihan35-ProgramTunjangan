/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan35.programtunjangan;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang perhitungan Gaji tunjangan karyawan 
 * dengan OO
 */
public class PBO210116380Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gaPok;
        String status;

        Scanner in = new Scanner(System.in);
        Tunjangan tun = new Tunjangan();
        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: " + "Rp.");
        gaPok = in.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = in.next();
        System.out.println("");

        tun.Tunjangan(gaPok, status);
        System.out.println("(Developed by : Zain Achmad Rizqullah)");

    }
    
}
