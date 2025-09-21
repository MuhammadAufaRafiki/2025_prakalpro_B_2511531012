package pekannn3;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keybord = new Scanner (System.in);
		System.out.print("Input angka-1:");
		A1 = keybord.nextInt();
		System.out.print("Input anhka-2:");
		A2 = keybord.nextInt();
		keybord.close();
		System.out.println("operator Penjumlahan");
		hasil = A1 + A2; // penjumlahan 
		System.out.println("Hasil = " + hasil);
		System.out.println("operator Pengurangan");
		hasil = A1 - A2; // pengurangan
		System.out.println("Hasil = " + hasil);
		System.out.println("operator perkalian");
		hasil = A1 * A2; // perkalian
		System.out.println("Hasil = " + hasil);
		System.out.println("operator hasil bagi");
		hasil = A1 / A2; // hasil bagi
		System.out.println("Hasil = " + hasil);
		System.out.println("operator sisa bagi");
		hasil = A1 % A2; // sisa bagi
		System.out.println("Hasil = " + hasil);

	}

}
