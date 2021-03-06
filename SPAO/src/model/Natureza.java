package model;
// Generated 18/06/2013 01:20:37 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Natureza generated by hbm2java
 */
public class Natureza  implements java.io.Serializable {


     private String codigoNatureza;
     private String natureza;
     private Set ocorrenciases = new HashSet(0);
     private Set metases = new HashSet(0);

    public Natureza() {
    }

	
    public Natureza(String codigoNatureza, String natureza) {
        this.codigoNatureza = codigoNatureza;
        this.natureza = natureza;
    }
    public Natureza(String codigoNatureza, String natureza, Set ocorrenciases, Set metases) {
       this.codigoNatureza = codigoNatureza;
       this.natureza = natureza;
       this.ocorrenciases = ocorrenciases;
       this.metases = metases;
    }
   
    public String getCodigoNatureza() {
        return this.codigoNatureza;
    }
    
    public void setCodigoNatureza(String codigoNatureza) {
        this.codigoNatureza = codigoNatureza;
    }
    public String getNatureza() {
        return this.natureza;
    }
    
    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }
    public Set getOcorrenciases() {
        return this.ocorrenciases;
    }
    
    public void setOcorrenciases(Set ocorrenciases) {
        this.ocorrenciases = ocorrenciases;
    }
    public Set getMetases() {
        return this.metases;
    }
    
    public void setMetases(Set metases) {
        this.metases = metases;
    }




}


