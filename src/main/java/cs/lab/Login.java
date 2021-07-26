package cs.lab;

public class Login {
    String username;
    String password;

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
