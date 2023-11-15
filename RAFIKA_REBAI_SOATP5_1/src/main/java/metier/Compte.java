package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Compte  {

        int code;
        Double solde;
        @XmlTransient
        Date DateCreation;



        public Compte(int code, double d, Date dateCreation) {
            super();
            this.code = code;
            this.solde = d;
            DateCreation = dateCreation;
        }
        public Compte() {

        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public Double getSolde() {
            return solde;
        }

        public void setSolde(float solde) {
            this.solde = (double) solde;
        }

        public Date getDateCreation() {
            return DateCreation;
        }

        public void setDateCreation(Date dateCreation) {
            DateCreation = dateCreation;
        }





    }
