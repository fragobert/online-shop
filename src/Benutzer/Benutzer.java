package Benutzer;

public abstract class Benutzer {
    private String name, password, email;

    public Benutzer(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

}
