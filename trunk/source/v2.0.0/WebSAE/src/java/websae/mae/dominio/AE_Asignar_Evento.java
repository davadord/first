//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : WebSAE
//  @ File Name : AE_Asignar_Evento.java
//  @ Date : 23/04/2009
//  @ Author : Guillermo Pizarro
//
//

package websae.mae.dominio;

import java.math.BigDecimal;
import java.util.List;

public class AE_Asignar_Evento {

    // <editor-fold defaultstate="collapsed" desc="Objetos dependientes">
	private AE_Evento ref_evento;
	private List< AE_Evento > ref_subevento;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Atributos">
	private BigDecimal ae_id_asignar_evento;
	private String ae_estado;
    // </editor-fold>

    public AE_Asignar_Evento() {
    }

    // <editor-fold defaultstate="collapsed" desc="Setters & Getters">
    public String getAe_estado() {
        return ae_estado;
    }

    public void setAe_estado(String ae_estado) {
        this.ae_estado = ae_estado;
    }

    public BigDecimal getAe_id_asignar_evento() {
        return ae_id_asignar_evento;
    }

    public void setAe_id_asignar_evento(BigDecimal ae_id_asignar_evento) {
        this.ae_id_asignar_evento = ae_id_asignar_evento;
    }

    public AE_Evento getRef_evento() {
        return ref_evento;
    }

    public void setRef_evento(AE_Evento ref_evento) {
        this.ref_evento = ref_evento;
    }

    public List< AE_Evento > getRef_subevento() {
        return this.ref_subevento;
    }

    public void setRef_subevento(List< AE_Evento > ref_subevento) {
        this.ref_subevento = ref_subevento;
    }
    // </editor-fold>
    
	public void cr_AE_Asignar_Evento() {
	}
	
	public void fin_AE_Asignar_Evento() {
	}
}