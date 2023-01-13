import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.Console;

public class Login {
    Scanner scanner = new Scanner(System.in);
    Console console = System.console();
    private HashMap<String, User> users = new HashMap<String, User>();

    public Login() {
    }

    public User login() {
        System.out.println("Geben sie ihre Email ein: ");
        String username = scanner.nextLine();
        String password = passwordEntry();

        if (users.containsKey(username)) {
            System.out.println(users.get(username).getName());
            if (users.get(username).getPassword().equals(password)) {
                System.out.println("Login erfolgreich");
                return users.get(username);
            }
        }
        System.out.println("Login fehlgeschlagen");
        return null;
    }

    public User register() {
        System.out.println("Geben sie ihre Email ein: ");
        String username = scanner.nextLine();
        String password = passwordEntry();
        System.out.println("Geben sie ihren Namen ein: ");
        String name = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Registrierung fehlgeschlagen");
            return null;
        } else {
            User newUser = new User(username, name, password);
            users.put(username, newUser);
            System.out.println("Registrierung erfolgreich");
            return newUser;
        }
    }

    public void printUsers() {
        users.forEach((key, value) -> {
            System.out.print("E-mail: " + key + " Name: " + value.getName() + " \n");
        });
    }

    public String passwordEntry() {
        Console cons;
        char[] passwd = null;
        if ((cons = System.console()) != null &&
                (passwd = cons.readPassword("[%s]", "Password:")) != null) {
            java.util.Arrays.fill(passwd, ' ');
        } else {
            System.out.println("Konsole wird nicht unterstützt");
            System.exit(0);
        }

        return new String(passwd);

    }


}
