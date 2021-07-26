package cs.lab;

import java.util.List;

public class VaccinationCenter {
    Integer ID;
    List<Vaccinated> vaccinatedList;
    Integer parcialVaccinated;
    Integer completedVaccinated;
    String status;

    public VaccinationCenter() {
        //Default constructor
    }


    public VaccinationCenter(Integer ID) {
        this.ID = ID;
        Vaccinated v1 = new Vaccinated("Paco","Lope",87,"parcial");
        Vaccinated v2 = new Vaccinated("Jose","Roti",56,"Completed");
        vaccinatedList.add(v1);
        vaccinatedList.add(v2);
    }

    public Integer getID() {
        return ID;
    }

    public List<Vaccinated> getVaccinatedList() {
        return vaccinatedList;
    }

    public void setVaccinatedList(List<Vaccinated> vaccinatedList) {
        this.vaccinatedList = vaccinatedList;
    }

    public Integer getParcialVaccinated() {
        return parcialVaccinated;
    }

    public void setParcialVaccinated() {
        for (Vaccinated vaccinated : vaccinatedList) {
            if (vaccinated.getStatus().equals("parcial"))
                parcialVaccinated++;
        }
    }

    public Integer getCompletedVaccinated() {
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

    }
}
