package service;
public class Compte {
String Code;
double Solde;
String Datecreation;

public Compte(String Code ,double Solde, String date) {
	super();
   this.Code= Code;
   this.Solde= Solde;
   this.Datecreation=date;
   }
	    public Compte() {
	// TODO Auto-generated constructor stub
}
		public String getCode() {
	        return Code;
	    }

	    public void setCode(String code) {
	        this.Code = code;
	    }

	    public  double getSolde() {
	        return Solde;
	    }

	    public void setSolde(double solde) {
	        this.Solde = solde;
	    }

	    public String getDatecreation() {
	        return Datecreation;
	    }

	    public void setDatecreation(String Datecreation) {
	        this.Datecreation = Datecreation;
	    }
	    public static void main(String[] args) {
	    	Compte Compte= new Compte("12345",	19876.0 ,"2023-10-16");
	    	System.out.println("Code du compte : " + Compte.getCode());
            System.out.println("Solde du compte : " + Compte.getSolde());
            System.out.println("Date de création du compte : " + Compte.getDatecreation());
        }
	    	
	    	
	}


