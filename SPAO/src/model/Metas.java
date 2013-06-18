package model;
// Generated 18/06/2013 01:20:37 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Metas generated by hbm2java
 */
public class Metas  implements java.io.Serializable {


     private String codMeta;
     private Natureza natureza;
     private short qtdIncidenciasPermitidas;
     private short nivelAlerta;
     private Date dataHoraInicio;
     private Date dataHoraTermino;
     private Boolean removido;

    public Metas() {
    }

	
    public Metas(String codMeta, Natureza natureza, short qtdIncidenciasPermitidas, short nivelAlerta, Date dataHoraInicio, Date dataHoraTermino) {
        this.codMeta = codMeta;
        this.natureza = natureza;
        this.qtdIncidenciasPermitidas = qtdIncidenciasPermitidas;
        this.nivelAlerta = nivelAlerta;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraTermino = dataHoraTermino;
    }
    public Metas(String codMeta, Natureza natureza, short qtdIncidenciasPermitidas, short nivelAlerta, Date dataHoraInicio, Date dataHoraTermino, Boolean removido) {
       this.codMeta = codMeta;
       this.natureza = natureza;
       this.qtdIncidenciasPermitidas = qtdIncidenciasPermitidas;
       this.nivelAlerta = nivelAlerta;
       this.dataHoraInicio = dataHoraInicio;
       this.dataHoraTermino = dataHoraTermino;
       this.removido = removido;
    }
   
    public String getCodMeta() {
        return this.codMeta;
    }
    
    public void setCodMeta(String codMeta) {
        this.codMeta = codMeta;
    }
    public Natureza getNatureza() {
        return this.natureza;
    }
    
    public void setNatureza(Natureza natureza) {
        this.natureza = natureza;
    }
    public short getQtdIncidenciasPermitidas() {
        return this.qtdIncidenciasPermitidas;
    }
    
    public void setQtdIncidenciasPermitidas(short qtdIncidenciasPermitidas) {
        this.qtdIncidenciasPermitidas = qtdIncidenciasPermitidas;
    }
    public short getNivelAlerta() {
        return this.nivelAlerta;
    }
    
    public void setNivelAlerta(short nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }
    public Date getDataHoraInicio() {
        return this.dataHoraInicio;
    }
    
    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }
    public Date getDataHoraTermino() {
        return this.dataHoraTermino;
    }
    
    public void setDataHoraTermino(Date dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }
    public Boolean getRemovido() {
        return this.removido;
    }
    
    public void setRemovido(Boolean removido) {
        this.removido = removido;
    }




}

