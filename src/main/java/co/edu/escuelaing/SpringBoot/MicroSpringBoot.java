package co.edu.escuelaing.SpringBoot;

import co.edu.escuelaing.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MicroSpringBoot {
    public static void main(String[] args) {
        try {
            MicroSpring mcSpring = new MicroSpring();
            mcSpring.mapServices(args[0]);
            HttpServer server = new HttpServer(mcSpring);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}