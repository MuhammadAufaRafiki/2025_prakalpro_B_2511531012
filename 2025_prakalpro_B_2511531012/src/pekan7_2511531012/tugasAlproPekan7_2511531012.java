package pekan7_2511531012;
import java.util.Scanner;
public class tugasAlproPekan7_2511531012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Akun akun = new Akun();
        
        System.out.println("===== REGISTRASI AKUN BARU =====");
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        akun.setUsername(username);
        
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();
        akun.setPassword(password);

        System.out.print("Masukkan Email: ");
        String email = input.nextLine();
        akun.setEmail(email);

        System.out.print("Masukkan PIN (6 digit): ");
        int pin = Integer.parseInt(input.nextLine());
        akun.setPinAngka(pin);
        
        System.out.println();
        
        if (!akun.isPasswordValid()) {
            System.out.println("--- REGISTRASI GAGAL ---");
            System.out.println("Password Anda \"" + akun.getPassword() + "\" terlalu pendek.");
            System.out.println("Validasi gagal: Password harus 8 karakter atau lebih.");
            System.out.println("Silakan coba lagi.");

        } else if (!akun.isEmailValid()) {
            System.out.println("--- REGISTRASI GAGAL ---");
            System.out.println("Email Anda \"" + akun.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            System.out.println("Silakan coba lagi.");
            
        } else {
            System.out.println("--- REGISTRASI BERHASIL ---");
            System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.");
            System.out.println();
            System.out.println("--- Detail Akun ---");
            System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
            System.out.println("Email (Uppercase) 	: " + akun.getEmail().toUpperCase());
            System.out.println("ID Pengguna (Gabungan): " + akun.getUsername() + akun.getPinAngka());
            System.out.println();
            System.out.println("--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
            System.out.println("PIN (int) + 10 = " + (akun.getPinAngka() + 10));
            System.out.println("PIN (String) + \"10\" = " + String.valueOf(akun.getPinAngka()) + "10");
        }
        input.close();

	}

}