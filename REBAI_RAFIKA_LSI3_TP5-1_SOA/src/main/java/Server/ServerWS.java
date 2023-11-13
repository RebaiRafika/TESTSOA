package Server;

import jakarta.xml.ws.Endpoint;
import Service.BanqueService;
public class ServerWS {

        public static void main(String[] args) {
            BanqueService bs =new BanqueService();
            String url= "http://localhost:8084/";
            Endpoint.publish(url,bs);
            System.out.println("Web service deployé sur "+url);
        }
    }

