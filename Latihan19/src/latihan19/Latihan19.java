/*
Nama : Evan Eka Laksana
 * Kelas : PBO1
 * NIM : 222050008
 * Deskripsi Program : Program ini berisi program untuk menampilkan Saldo Tabungan
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan19;

/**
 *
 * @author Lenovo
 */
public class Latihan19 {

        public static void main(String[] args) {
         double saldoAwal = 2500000;
        double bungaBulan = 15;
        int lamaBulan = 6;

        // Hitung bunga per bulan
        double bungaPerBulan = saldoAwal * bungaBulan / 100;

        // Hitung saldo akhir setiap bulan
        double saldoAkhir = saldoAwal;
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAkhir += bungaPerBulan;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAkhir);
        }
    }
}
    
    

