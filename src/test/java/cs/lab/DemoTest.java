package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

class DemoTest {
    static final Logger logger = Logger.getLogger(Demo.class.getName());

    @Test
    public void maxLimit() throws IOException{
        Login login = new Login();
        login.setUsername("RT120");
        Assert.assertEquals(login.getUsername(),"RT120");
        Assert.assertEquals(login.getPassword(),"021TR");
    }

    @Test
    public void checkStatusVaccinated() throws IOException{
        Vaccinated v1 = new Vaccinated("Paco","Lope",56,"parcial");
        Assert.assertEquals(v1.getStatus(),"parcial");
    }

    @Test
    public void checkVaccinationCenter() throws IOException{
        VaccinationCenter vc = new VaccinationCenter(10);
        Assert.assertEquals(vc.getID(), 10);
        vc.setCompletedVaccinated();
        vc.setParcialVaccinated();
        Assert.assertEquals(vc.getCompletedVaccinated(),0);
        Assert.assertEquals(vc.getParcialVaccinated(),1);
        Assert.assertEquals(vc.getStatus(),"down");
        vc.setStatus("alta");
        Assert.assertEquals(vc.getStatus(),"alta");


    }

};