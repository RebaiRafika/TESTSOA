package SERVEUR;
import java.util.logging.ConsoleHandler;
import SERVICE.CalculatriceWS;

public class Server {
    public static void main(String[] args) {
        String url= "http://localhost:8084/";
        System.out.println("Web service deployé sur "+url);
    }
}