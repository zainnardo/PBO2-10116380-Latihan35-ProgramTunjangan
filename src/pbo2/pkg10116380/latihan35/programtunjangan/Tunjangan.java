/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan35.programtunjangan;

/**
 *
 * @author Epsilon
 */
public class Tunjangan {
    public double tunjangan;
    public double totGaji;
    
    public void Tunjangan(Double gaPok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok\t: Rp. " + gaPok);

        tunjangan = (status.equals("Menikah")) ? 0.35 * gaPok : 0;
        System.out.println("Tunjangan\t: Rp. " + tunjangan);
        
        totGaji = gaPok + tunjangan;
        System.out.println("Total Gaji\t: Rp. " + totGaji);
    }
    
}
