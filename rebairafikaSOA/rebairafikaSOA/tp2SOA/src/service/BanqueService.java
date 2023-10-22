package service;
import java.util.ArrayList;
import java.util.List;
public class BanqueService {
	public double conversion(double montant){
		return(montant * 10.6);
		}
	public Compte getCompte() {
		return null;

	
		
	}
		 public List<Compte> getComptes (){
			 
			 List<Compte> l = new ArrayList<Compte>();
			
			 l.add(new Compte("1", Math.random()*55555, "new Date()"));
				l.add(new Compte("2", Math.random()*55555, "new Date()"));
				l.add(new Compte("3", Math.random()*55555, "new Date()"));
				return l;
		
	}
		 
		
	public static void main(String[] args) {
		BanqueService BNSE= new BanqueService();                        
		        double montantConverti = BNSE.conversion(100.0);
		        System.out.println("Montant converti : " + montantConverti);

		    	Compte Compte= new Compte("12345",	19876.0 ,"2023-10-16");
		    	System.out.println("Code du compte : " + Compte.getCode());
	            System.out.println("Solde du compte : " + Compte.getSolde());
	            System.out.println("Date de création du compte : " + Compte.getDatecreation());
	        
    
		    }}

	
		
		


	
	

