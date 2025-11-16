package pekan7_2511531012;

public class Akun {
	private String username;
    private String password;
    private String email;
    private int pinAngka;
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public int getPinAngka() {
        return pinAngka;
    }
    public boolean isPasswordValid() {
        return this.password.length() >= 8;
    }
    public boolean isEmailValid() {
        return this.email.contains("@") && this.email.contains(".");
    }

}