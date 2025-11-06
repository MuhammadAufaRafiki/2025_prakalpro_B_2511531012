package pekan6_2511531012;
import java.util.Random;
import java.util.Scanner;
public class TugasPekan6_2511531012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int percobaan = 0;
        int dadu1, dadu2, sum;
        String jawaban = "Ya"; 
        boolean sudahMenang = false;

        while (jawaban.equalsIgnoreCase("Ya")) {
            percobaan++;
            dadu1 = rand.nextInt(6) + 1;
            dadu2 = rand.nextInt(6) + 1;
            sum = dadu1 + dadu2;
            System.out.println(dadu1 + " + " + dadu2 + " = " + sum);

            if (sum == 7) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                jawaban = "tidak";
                sudahMenang = true;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak)? ");
                jawaban = input.next();
            }
        }
        if (!sudahMenang) {
            System.out.println("Anda gagal menang");
        }
        input.close();
	}
}
