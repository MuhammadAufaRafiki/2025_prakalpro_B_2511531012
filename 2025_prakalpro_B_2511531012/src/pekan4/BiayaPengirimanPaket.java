package pekan4;

import java.util.Scanner;

public class BiayaPengirimanPaket {

	public static void main(String[] args) {
		String nama;
		double berat, biayaDasar, biayaJarak, biayaLayanan, biayaJenis, diskon, subtotal, totalSebelumDiskon, totalBayar;
		int jarak,layanan,jenis;
		String namaLayanan = "", namaPaket = "";
		
		Scanner input = new Scanner(System.in);
        System.out.print("Nama Pengirim: ");
        nama = input.nextLine();
        System.out.print("Berat Paket (kg): ");
        berat = input.nextDouble();
        System.out.print("Jarak Pengiriman (km): ");
        jarak = input.nextInt();
        System.out.print("Jenis Layanan (1=Reguler, 2=Express, 3=Same Day): ");
        layanan = input.nextInt();
        System.out.print("Jenis Paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik): ");
        jenis = input.nextInt();
        input.close();


     // Biaya dasar berdasarkan berat
        if (berat <= 0) {
            System.out.println("Input tidak valid! Berat paket harus lebih dari 0 kg.");
            return;
        } else if (berat <= 1) {
            biayaDasar = 10000;
        } else if (berat <= 3) {
            biayaDasar = 15000;
        } else if (berat <= 5) {
            biayaDasar = 22500;  
        } else {
            biayaDasar = 25000;
        }
        // Biaya jarak
        if (jarak <= 0) {
            System.out.println("Input tidak valid! jarak paket harus lebih dari 0 km.");
            return;
        } else if (jarak <= 10) {
            biayaJarak = 5000;
        } else if (jarak <= 20) {
            biayaJarak = 10000;
        } else {
            biayaJarak = 15000;
        }

        subtotal = biayaDasar + biayaJarak;

        // Biaya layanan
        if (layanan == 1) { // Reguler
            biayaLayanan = 0.2 * subtotal;
            namaLayanan = "Reguler";
        } else if (layanan == 2) { // Express
            biayaLayanan = 0.5 * subtotal;
            namaLayanan = "Express";
        } else if (layanan == 3) { // Same Day
            biayaLayanan = 1.0 * subtotal;
            namaLayanan = "Same Day";
        } else {
            System.out.println("Jenis layanan tidak valid!");
            return;
        }

        // Biaya jenis paket
        if (jenis == 1) { 
            biayaJenis = 5000;
            namaPaket = "Dokumen";
        } else if (jenis == 2) { 
            biayaJenis = 10000;
            namaPaket = "Barang Biasa";
        } else if (jenis == 3) {
            biayaJenis = 15000;
            namaPaket = "Barang Elektronik";
        } else {
            System.out.println("Jenis paket tidak valid!");
            return;
        }

        totalSebelumDiskon = subtotal + biayaLayanan + biayaJenis;

        // Diskon
        if (totalSebelumDiskon > 100000) {
            diskon = 0.1 * totalSebelumDiskon;
        } else {
            diskon = 0;
        }
        
        // Total Bayar
        totalBayar = totalSebelumDiskon - diskon;
        
        
        System.out.println("===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pengirim        : " + nama);
        System.out.println("Berat Paket          : " + berat + " kg");
        System.out.println("Jarak Pengiriman     : " + jarak + " km");
        System.out.println("Jenis Layanan        : " + namaLayanan);
        System.out.println("Jenis Paket          : " + namaPaket);
        System.out.println("--------------------------------------");
        System.out.printf("Biaya Dasar          : Rp %.0f%n", biayaDasar);
        System.out.printf("Biaya Jarak          : Rp %.0f%n", biayaJarak);
        System.out.printf("Subtotal             : Rp %.0f%n", subtotal);
        if (layanan == 1) {
            System.out.printf("Biaya Layanan (20%%)  : Rp %.0f%n", biayaLayanan);
        } else if (layanan == 2) {
            System.out.printf("Biaya Layanan (50%%)  : Rp %.0f%n", biayaLayanan);
        } else if (layanan == 3) {
            System.out.printf("Biaya Layanan (100%%) : Rp %.0f%n", biayaLayanan);
        }
        System.out.printf("Biaya Jenis Paket    : Rp %.0f%n", biayaJenis);
        System.out.printf("Total Sebelum Disc.  : Rp %.0f%n", totalSebelumDiskon);
        System.out.printf("Diskon               : Rp %.0f%n", diskon);
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL BIAYA          : Rp %.0f%n", totalBayar);

        input.close();

	}

}
