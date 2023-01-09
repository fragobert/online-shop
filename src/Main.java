
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.register("test","testname", "testpasswort");
        login.register("hannes@hannes.hannes","hannes pfattner", "hannespasswort");
        login.printUsers();

        if(login.login("hannes@hannes.hannes", "hannespasswort") != null) {
            System.out.println("Login erfolgreich");
        } else {
            System.out.println("Login fehlgeschlagen");
        }
    }
}