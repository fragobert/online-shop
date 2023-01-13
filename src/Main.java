
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.register();

        if (login.login() != null) {
            System.out.println("Login erfolgreich");
        } else {
            System.out.println("Login fehlgeschlagen");
        }
    }
}