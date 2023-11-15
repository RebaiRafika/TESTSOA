package Server;


import Service.BanqueService;

import javax.xml.ws.Endpoint;


    public class ServeurJWS {
        public static void main(String[] args) {
            String url= "http://localhost:8083/";
            Endpoint.publish(url, new BanqueService());
            System.out.println("Web service deployé sur "+url);
        }
    }

