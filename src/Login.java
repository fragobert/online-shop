import java.util.HashMap;

public class Login {
    private HashMap<String, User> users = new HashMap<String, User>();

    public Login() {
    }

    public User login(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println(users.get(username).getName());
            if (users.get(username).equals(password)) {
                return users.get(username);
            }
        }
        return null;
    }

    public boolean register(String username, String name, String password) {
        if (users.containsKey(username)) {
            return false;
        } else {
            User newUser = new User(username, name, password);
            users.put(username, newUser);

            return true;
        }
    }

    public void printUsers() {
        users.forEach((key, value) -> {
            System.out.print("E-mail: " + key + " Name: " + value.getName() + " \n");
        });
    }

}
