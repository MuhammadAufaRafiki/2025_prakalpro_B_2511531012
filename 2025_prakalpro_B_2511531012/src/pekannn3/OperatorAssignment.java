package pekannn3;

import java.util.Scanner;

public class OperatorAssignment {

	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keybord = new Scanner (System.in);
		System.out.print("Input angka-1:");
		A1 = keybord.nextInt();
		System.out.print("Input anhka-2:");
		A2 = keybord.nextInt();
		keybord.close();
		System.out.println("Assignment penambahan");
	    A1+= A2; // penambahan, sekarang A1=15 
		System.out.println("penambahan = " + A1);
		System.out.println("Assignment Pengurangan");
		A1 -= A2; // pengurangan, sekarang A1= 10
		System.out.println("pengurangan = " + A1);
		System.out.println("Assignment perkalian");
		A1 *= A2; // perkalian, sekarang A1= 50
		System.out.println("Hasil = " + A1);
		System.out.println("Assignment hasil bagi");
		A1 /= A2; // hasil bagi, sekarang A1=10
		System.out.println("hasil bagi = " + A1);
		System.out.println("Assignment sisa bagi");
		A1 %= A2; // sisa bagi, sekarang A1=0
		System.out.println("sisa bagi = " + A1);

	}

}
