package transformation;

	import java.io.Serializable;
	import java.util.Date;

	public class Compte {
		private int code;
		private double solde;

		private Date dateCreation;
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public double getSolde() {
			return solde;
		}
		public void setSolde(double solde) {
			this.solde = solde;
		}
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		public Compte(int code, double solde, Date dateCreation) {
			super();
			this.code = code;
			this.solde = solde;
			this.dateCreation = dateCreation;
		}
		public Compte() {
			super();
		}
	
		
		public static void main(String[] args) {
			System.out.println("votre code est:");
			System.out.println("votre solde est:");
			System.out.println("votre date de creation  est: ");
			

		}


	}


