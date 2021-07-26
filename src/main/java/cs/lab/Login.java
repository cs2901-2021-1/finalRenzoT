package cs.lab;

import java.util.logging.Logger;

public class Login {
    String username;
    String password;

    static final Logger logger = Logger.getLogger(Login.class.getName());

    Login(){
        //Default constructor
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        setPassword();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        StringBuilder passAux = new StringBuilder(this.username);
        this.password = passAux.reverse().toString();
    }

    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }

}
