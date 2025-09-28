package pekan4;

import java.util.Scanner;

public class NamaBulan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Masukkan angka bulan (1-12):");
		int bulan = scanner.nextInt();
		switch (bulan) {
			case 1:
				System.out.println("januari");
				break;
			case 2:
				System.out.println("februari");
				break;
			case 3:
				System.out.println("maret");
				break;
			case 4:
				System.out.println("april");
				break;
			case 5:
				System.out.println("mei");
				break;
			case 6:
				System.out.println("juni");
				break;
			case 7:
				System.out.println("juli");
				break;
			case 8:
				System.out.println("agustus");
				break;
			case 9:
				System.out.println("september");
				break;
			case 10:
				System.out.println("oktober");
				break;
			case 11:
				System.out.println("november");
				break;
			case 12:
				System.out.println("desember");
				break;
		}
		scanner.close();

	}

}
