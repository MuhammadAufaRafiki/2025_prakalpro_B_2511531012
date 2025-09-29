package pekannn3;

import java.util.Scanner;

public class tugasOperatorVolumeTabung {

	public static void main(String[] args) {
		int r;
		int t;
		double pi = 3.14;
		double v;
		Scanner keybord = new Scanner (System.in);
		System.out.print("Input jari-jari tabung :");
		r = keybord.nextInt();
		System.out.print("Input tinggi tabung:");
		t = keybord.nextInt();
		keybord.close();
		System.out.println("operator volume");
		v= pi*r*r*t;
		System.out.println("volume Tabung = " + v);

	}

}
