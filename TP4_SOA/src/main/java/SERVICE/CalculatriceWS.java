package SERVICE;

@WebService
    public class CalculatriceWS {
        @WebMethod
        public double somme(@WebParam double a, @WebParam double b) {
            return a+b;
        }
    }



