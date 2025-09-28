package tugasAlproPekan2;

import java.util.Scanner;

public class upahKaryawan {

	public static void main(String[] args) {
		// === Deklarasi variabel ===
        String nama;
        char golongan;
        int jamKerja;
        int upahPerJam = 0;
        int upahPokok;
        int jamLembur;
        int upahLembur;
        int totalUpah;

        // === Input data ===
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Karyawan : ");
        nama = input.nextLine();

        System.out.print("Masukkan Golongan (A/B/C/D): ");
        golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan Jumlah Jam Kerja : ");
        jamKerja = input.nextInt();

        // === Tentukan upah per jam berdasarkan golongan ===
        if (golongan == 'A') {
            upahPerJam = 1000;
        } else if (golongan == 'B') {
            upahPerJam = 2000;
        } else if (golongan == 'C') {
            upahPerJam = 3000;
        } else if (golongan == 'D') {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return; // keluar dari program
        }

        // === Hitung upah pokok ===
        upahPokok = jamKerja * upahPerJam;

        // === Hitung lembur jika ada ===
        if (jamKerja > 60) {
            jamLembur = jamKerja - 60;
            upahLembur = jamLembur * 5000;
            totalUpah = upahPokok + upahLembur;
        } else {
            totalUpah = upahPokok;
        }

        // === Output hasil ===
        System.out.println("\n=== Hasil Perhitungan Upah Mingguan ===");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Jam Kerja     : " + jamKerja);
        System.out.println("Total Upah    : Rp " + totalUpah);

        input.close();

	}

}
