package cs.lab;

public class Vaccinated {
    String name;
    String lastname;
    int age;
    String status;

    public Vaccinated(String name, String lastname, int age, String status) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
