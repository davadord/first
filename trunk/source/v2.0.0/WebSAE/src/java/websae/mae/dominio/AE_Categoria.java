// 
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : WebSAE
//  @ File Name : AE_Categoria.java
//  @ Date : 23/04/2009
//  @ Author : Guillermo Pizarro
//
//

package websae.mae.dominio;

import java.math.BigDecimal;
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

public class AE_Categoria {

    // <editor-fold defaultstate="collapsed" desc="Objetos Dependientes">
	public List< AE_Subcategoria > ref_subcategoria;
	public List< AE_Categoria_Evento > ref_categoria_evento;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Atributos">
	private BigDecimal ca_id_categoria;
	private String ca_nombre;
	private String ca_estado;
    // </editor-fold>

    public AE_Categoria() {
    }

    // <editor-fold defaultstate="collapsed" desc="Setters & Getters">
    public String getCa_estado() {
        return ca_estado;
    }

    public void setCa_estado(String ca_estado) {
        this.ca_estado = ca_estado;
    }

    public BigDecimal getCa_id_categoria() {
        return ca_id_categoria;
    }

    public void setCa_id_categoria(BigDecimal ca_id_categoria) {
        this.ca_id_categoria = ca_id_categoria;
    }

    public String getCa_nombre() {
        return ca_nombre;
    }

    public void setCa_nombre(String ca_nombre) {
        this.ca_nombre = ca_nombre;
    }

    public List<AE_Categoria_Evento> getRef_categoria_evento() {
        return ref_categoria_evento;
    }

    public void setRef_categoria_evento(List<AE_Categoria_Evento> ref_categoria_evento) {
        this.ref_categoria_evento = ref_categoria_evento;
    }

    public List<AE_Subcategoria> getRef_subcategoria() {
        return ref_subcategoria;
    }

    public void setRef_subcategoria(List<AE_Subcategoria> ref_subcategoria) {
        this.ref_subcategoria = ref_subcategoria;
    }
    // </editor-fold>
    
    public void cr_AE_Categoria(Table objeto) {
        this.ca_id_categoria = new BigDecimal( (Long) objeto.get("ca_id_categoria") );
        this.ca_nombre = (String) objeto.get("ca_nombre");
        this.ca_estado = (String) objeto.get("ca_estado");
    }
    
	public void fin_AE_Categoria() {
	}

    public static AE_Categoria buscar_categoria(String id_categoria) {
        AE_Categoria categoria = new AE_Categoria();
        
        Datos datos = new Datos("WebSAE");
        String sql = "SELECT * FROM ae_categoria WHERE ca_id_categoria = "+id_categoria+" order by ca_nombre;";
        Registro registros = datos.consulta( sql );
        for (int i=0; i<registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            categoria.cr_AE_Categoria( objeto );
        }
        return categoria;
    }
    
    public static List<AE_Categoria> categorias() {
        List< AE_Categoria > categorias = new LinkedList< AE_Categoria >();

        Datos datos = new Datos("WebSAE");
        Registro registros = datos.consulta("SELECT * FROM ae_categoria ORDER BY ca_nombre;");
        for (int i=0; i<registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Categoria categoria = new AE_Categoria();
            categoria.cr_AE_Categoria( objeto );
            categorias.add(categoria);
        }
        return categorias;
    }
    
    public static List<AE_Categoria> mostrar_categorias() {
        List< AE_Categoria > categorias = new LinkedList< AE_Categoria >();

        Datos datos = new Datos("WebSAE");
        Registro registros = datos.consulta("SELECT * FROM ae_categoria WHERE ca_estado = '"+Estado.VIGENTE+"' ORDER BY ca_nombre;");
        for (int i=0; i<registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Categoria categoria = new AE_Categoria();
            categoria.cr_AE_Categoria( objeto );
            categorias.add(categoria);
        }
        return categorias;
    }

    public static List<AE_Categoria> mostrar_categorias_por_evento(String id_evento) {
        List< AE_Categoria > categorias = new LinkedList< AE_Categoria >();

        Datos datos = new Datos("WebSAE");
        String sql = "SELECT DISTINCT ca.ca_id_categoria, ca.ca_nombre, ca.ca_estado " +
                     "FROM ae_categoria_evento ce, ae_categoria ca " +
                     "WHERE ce.ref_evento = " + id_evento+" AND ce.ref_categoria = ca.ca_id_categoria ORDER BY ca.ca_nombre;";
        Registro registros = datos.consulta( sql );
        for (int i=0; i<registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Categoria categoria = new AE_Categoria();
            categoria.cr_AE_Categoria( objeto );
            categorias.add(categoria);
        }
        return categorias;
    }

    public static JSONObject toJSON(List< AE_Categoria > categorias) {
        JSONObject json = new JSONObject();
        try {
            JSONArray jsonItems = new JSONArray();
            for (Iterator<AE_Categoria> it = categorias.iterator(); it.hasNext();) {
                AE_Categoria categoria = it.next();
                jsonItems.put( toJSONObject( categoria ) );
            }
            json.put("identifier", "id_categoria");
            json.put("label", "nombre");
            json.put("items", jsonItems);
        } catch (JSONException ex) {
            Logger.getLogger(AE_Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }

    public static JSONObject toJSONObject(AE_Categoria categoria) {
        JSONObject json = new JSONObject();
        try {
            json.put("id_categoria", categoria.getCa_id_categoria() );
            json.put("nombre", categoria.getCa_nombre() );
            json.put("estado", categoria.getCa_estado() );
        } catch (Exception ex) {
            Logger.getLogger(AE_Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}