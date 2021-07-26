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
        Assert.assertEquals("RT120",login.getUsername());
        Assert.assertEquals("021TR",login.getPassword());
    }

};