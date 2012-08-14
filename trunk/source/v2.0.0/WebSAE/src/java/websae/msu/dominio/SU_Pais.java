//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : WebSAE
//  @ File Name : SU_Pais.java
//  @ Date : 28/03/2009
//  @ Author : Guillermo Pizarro
//  @ Version : v1.0.0
//
//

package websae.msu.dominio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mad.eventos.Datos;
import mad.objetos.Registro;
import mad.objetos.Table;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import websae.informacion.Estado;

public class SU_Pais {

    public List< SU_Ciudad > ref_ciudad;

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private String pa_id_pais;
    private String pa_nombre;
    private String pa_continente;
    private String pa_region;
    private String pa_estado;
    // </editor-fold>

    public SU_Pais() {
        this.ref_ciudad = new LinkedList<SU_Ciudad>();
    }

    // <editor-fold defaultstate="collapsed" desc="Setters & Getters">
    public String getPa_estado() {
        return pa_estado;
    }

    public void setPa_estado(String pa_estado) {
        this.pa_estado = pa_estado;
    }

    public String getPa_continente() {
        return pa_continente;
    }

    public void setPa_continente(String pa_continente) {
        this.pa_continente = pa_continente;
    }

    public String getPa_id_pais() {
        return pa_id_pais;
    }

    public void setPa_id_pais(String pa_id_pais) {
        this.pa_id_pais = pa_id_pais;
    }

    public String getPa_nombre() {
        return pa_nombre;
    }

    public void setPa_nombre(String pa_nombre) {
        this.pa_nombre = pa_nombre;
    }

    public String getPa_region() {
        return pa_region;
    }

    public void setPa_region(String pa_region) {
        this.pa_region = pa_region;
    }

    public List<SU_Ciudad> getRef_ciudad() {
        return ref_ciudad;
    }

    public void setRef_ciudad(List<SU_Ciudad> ref_ciudad) {
        this.ref_ciudad = ref_ciudad;
    }
    // </editor-fold>

	public void cr_SU_Pais(Table objeto) {
        this.pa_id_pais = (String) objeto.get("pa_id_pais");
        this.pa_nombre = (String) objeto.get("pa_nombre");
        this.pa_continente = (String) objeto.get("pa_continente");
        this.pa_estado = (String) objeto.get("pa_estado");
	}

	public void fin_SU_Pais() {
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(SU_Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

    public static SU_Pais buscar_pais(String id_pais) {
        SU_Pais pais = new SU_Pais();

        Datos datos = new Datos("WebSAE");
        Registro registros = datos.consulta("SELECT * FROM su_pais WHERE pa_id_pais = '"+id_pais+"' ORDER BY pa_nombre;");
        for (int i=0; i<registros.size(); i++)
            pais.cr_SU_Pais( (Table) registros.get(i) );

        return pais;
    }

    public static List< SU_Pais > mostrar_paises() {
        List< SU_Pais > paises = new LinkedList< SU_Pais >();

        Datos datos = new Datos("WebSAE");
        String sql = "SELECT * FROM su_pais WHERE pa_estado = '" + Estado.VIGENTE + "' ORDER BY pa_nombre;";
        Registro registros = datos.consulta( sql );
        for (int i=0; i<registros.size(); i++) {
            SU_Pais pais = new SU_Pais();
            pais.cr_SU_Pais( (Table) registros.get(i) );
            paises.add( pais );
        }
        return paises;
    }

    public static JSONObject toJSON(List< SU_Pais > paises) {
        JSONObject json = new JSONObject();
        try {
            JSONArray jsonItems = new JSONArray();
            for (Iterator<SU_Pais> it = paises.iterator(); it.hasNext();) {
                SU_Pais pais = it.next();
                jsonItems.put( toJSONObject( pais ) );
            }
            json.put("identifier", "id_pais");
            json.put("label", "nombre");
            json.put("items", jsonItems);
        } catch (JSONException ex) {
            Logger.getLogger(SU_Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }

    public static JSONObject toJSONObject(SU_Pais pais) {
        JSONObject json = new JSONObject();
        try {
            json.put("id_pais", pais.getPa_id_pais() );
            json.put("nombre", pais.getPa_nombre() );
            json.put("region", pais.getPa_region() );
            json.put("continente", pais.getPa_continente() );
            json.put("estado", pais.getPa_estado() );
        } catch (Exception ex) {
            Logger.getLogger(SU_Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}