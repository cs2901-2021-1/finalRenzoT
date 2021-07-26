package cs.lab;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;



public class Demo {

    static final Logger logger = Logger.getLogger(Demo.class.getName());

    public static void main(String[] args) throws IOException{

        Login log = new Login();
        String username;
        String password;

        Scanner myScan = new Scanner(System.in);

        do {
            logger.info("Ingrese su nombre de usuario: ");
            username = myScan.nextLine();
            log.setUsername(username);
            logger.info("Ingrese su contrasena: ");
            password = myScan.nextLine();
            logger.info("¡Contrasena Incorrecta!");
        } while (!log.verifyPassword(password));

        logger.info("Hello World");
    }
}