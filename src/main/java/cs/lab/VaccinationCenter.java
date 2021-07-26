package cs.lab;

import java.util.ArrayList;

public class VaccinationCenter {
    int id;
    ArrayList<Vaccinated> vaccinatedList = new ArrayList<>();
    int parcialVaccinated = 0;
    int completedVaccinated = 0;
    String status;

    public VaccinationCenter() {
        //Default constructor
    }


    public VaccinationCenter(int id) {
        this.id = id;
        Vaccinated v1 = new Vaccinated("Paco","Lope",87,"parcial");
        Vaccinated v2 = new Vaccinated("Jose","Roti",56,"Completed");
        vaccinatedList.add(v1);
        vaccinatedList.add(v2);
        this.status = "down";
    }

    public int getID() {
        return id;
    }

    public int getParcialVaccinated() {
        return parcialVaccinated;
    }

    public void setParcialVaccinated() {
        for (Vaccinated vaccinated : vaccinatedList) {
            if (vaccinated.getStatus().equals("parcial"))
                parcialVaccinated++;
        }
    }

    public int getCompletedVaccinated() {
        return completedVaccinated;
    }

    public void setCompletedVaccinated() {
        for (Vaccinated vaccinated : vaccinatedList) {
            if (vaccinated.getStatus().equals("completed"))
                completedVaccinated++;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
