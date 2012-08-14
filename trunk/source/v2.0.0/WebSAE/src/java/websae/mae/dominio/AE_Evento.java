//
// 
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : WebSAE
//  @ File Name : AE_Evento.java
//  @ Date : 23/04/2009
//  @ Author : Guillermo Pizarro
//
//
package websae.mae.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import websae.informacion.Lenguaje;
import websae.informacion.Constante;
import websae.mce.dominio.CE_Articulo;
import websae.mce.dominio.CE_Convocatoria;
import websae.msu.dominio.SU_Ciudad;

public class AE_Evento {

    // <editor-fold defaultstate="collapsed" desc="Objetos Maestros">
    public AE_Tipo_Evento ref_tipo_evento;
    public SU_Ciudad ref_ciudad;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Objetos Dependientes">
    public AE_Asignar_Evento ref_evento;
    public List<AE_Asignar_Evento> ref_subevento;
    public List<AE_Faq> ref_faq;
    public List<AE_Organizador> ref_organizador;
    public List<AE_Fecha_Evento> ref_fecha_evento;
    public List<AE_Subcategoria_Evento> ref_subcategoria_evento;
    public List<AE_Categoria_Evento> ref_categoria_evento;
    public List<AE_Material> ref_material;
    public List<AE_Evento_Opcion> ref_evento_opcion;
    public List<AE_Auspicio> ref_auspicio;
    public List<CE_Articulo> ref_articulo;
    public List<AE_Conferencista_Evento> ref_conferencista_evento;
    public List<AE_Registro> ref_registro;
    public CE_Convocatoria ref_convocatoria;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private BigDecimal ev_id_evento;
    private String[] ev_nombre;
    private String ev_lugar;
    private String[] ev_objetivo;
    private String[] ev_descripcion;
    private String[] ev_dirigido;
    private Date ev_fecha_inicio;
    private Date ev_fecha_fin;
    private String[] ev_slogan;
    private String ev_imagen;
    private Integer ev_cupo_maximo;
    private Integer ev_cupo_disponible;
    private String ev_email;
    private String ev_agenda_general;
    private String ev_estado;
    private String[] ev_descripcion_registro;
    private String ev_estado_registro;
    // </editor-fold>

    public AE_Evento() {
        this.ev_nombre = new String[Lenguaje.TOTAL];
        this.ev_objetivo = new String[Lenguaje.TOTAL];
        this.ev_descripcion = new String[Lenguaje.TOTAL];
        this.ev_dirigido = new String[Lenguaje.TOTAL];
        this.ev_slogan = new String[Lenguaje.TOTAL];
        this.ev_descripcion_registro = new String[Lenguaje.TOTAL];

        this.ref_tipo_evento = new AE_Tipo_Evento();
        this.ref_ciudad = new SU_Ciudad();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Setters & Getters">
    public String getEv_descripcion(String lang) {
        return ev_descripcion[Lenguaje.parse(lang)];
    }

    public void setEv_descripcion(String ev_descripcion, String lang) {
        this.ev_descripcion[Lenguaje.parse(lang)] = ev_descripcion;
    }

    public String getEv_agenda_general() {
        return ev_agenda_general;
    }

    public void setEv_agenda_general(String ev_agenda_general) {
        this.ev_agenda_general = ev_agenda_general;
    }

    public String[] getEv_descripcion() {
        return ev_descripcion;
    }

    public void setEv_descripcion(String[] ev_descripcion) {
        this.ev_descripcion = ev_descripcion;
    }

    public String[] getEv_descripcion_registro() {
        return ev_descripcion_registro;
    }

    public void setEv_descripcion_registro(String[] ev_descripcion_registro) {
        this.ev_descripcion_registro = ev_descripcion_registro;
    }

    public String[] getEv_dirigido() {
        return ev_dirigido;
    }

    public void setEv_dirigido(String[] ev_dirigido) {
        this.ev_dirigido = ev_dirigido;
    }

    public String getEv_email() {
        return ev_email;
    }

    public void setEv_email(String ev_email) {
        this.ev_email = ev_email;
    }

    public String[] getEv_nombre() {
        return ev_nombre;
    }

    public void setEv_nombre(String[] ev_nombre) {
        this.ev_nombre = ev_nombre;
    }

    public String[] getEv_objetivo() {
        return ev_objetivo;
    }

    public void setEv_objetivo(String[] ev_objetivo) {
        this.ev_objetivo = ev_objetivo;
    }

    public String[] getEv_slogan() {
        return ev_slogan;
    }

    public void setEv_slogan(String[] ev_slogan) {
        this.ev_slogan = ev_slogan;
    }

    public List<CE_Articulo> getRef_articulo() {
        return ref_articulo;
    }

    public void setRef_articulo(List<CE_Articulo> ref_articulo) {
        this.ref_articulo = ref_articulo;
    }

    public SU_Ciudad getRef_ciudad() {
        return ref_ciudad;
    }

    public void setRef_ciudad(SU_Ciudad ref_ciudad) {
        this.ref_ciudad = ref_ciudad;
    }

    public String getEv_descripcion_registro(String lang) {
        return ev_descripcion_registro[Lenguaje.parse(lang)];
    }

    public void setEv_descripcion_registro(String ev_descripcion_registro, String lang) {
        this.ev_descripcion_registro[Lenguaje.parse(lang)] = ev_descripcion_registro;
    }

    public String getEv_dirigido(String lang) {
        return ev_dirigido[Lenguaje.parse(lang)];
    }

    public void setEv_dirigido(String ev_dirigido, String lang) {
        this.ev_dirigido[Lenguaje.parse(lang)] = ev_dirigido;
    }

    public String getEv_estado() {
        return ev_estado;
    }

    public void setEv_estado(String ev_estado) {
        this.ev_estado = ev_estado;
    }

    public String getEv_estado_registro() {
        return ev_estado_registro;
    }

    public void setEv_estado_registro(String ev_estado_registro) {
        this.ev_estado_registro = ev_estado_registro;
    }

    public Date getEv_fecha_fin() {
        return ev_fecha_fin;
    }

    public void setEv_fecha_fin(Date ev_fecha_fin) {
        this.ev_fecha_fin = ev_fecha_fin;
    }

    public void setEv_fecha_fin(String ev_fecha_fin) {
        if (ev_fecha_fin != null) {
            DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                this.ev_fecha_fin = (Date) fecha.parse(ev_fecha_fin);
            } catch (ParseException ex) {
                this.ev_fecha_fin = null;
                Logger.getLogger(AE_Evento.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.ev_fecha_fin = null;
        }
    }

    public Date getEv_fecha_inicio() {
        return ev_fecha_inicio;
    }

    public void setEv_fecha_inicio(Date ev_fecha_inicio) {
        this.ev_fecha_inicio = ev_fecha_inicio;
    }

    public BigDecimal getEv_id_evento() {
        return ev_id_evento;
    }

    public void setEv_fecha_inicio(String ev_fecha_inicio) {
        if (ev_fecha_inicio != null) {
            DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                this.ev_fecha_inicio = (Date) fecha.parse(ev_fecha_inicio);
            } catch (ParseException ex) {
                this.ev_fecha_inicio = null;
                Logger.getLogger(AE_Evento.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.ev_fecha_inicio = null;
        }
    }

    public void setEv_id_evento(BigDecimal ev_id_evento) {
        this.ev_id_evento = ev_id_evento;
    }

    public String getEv_imagen() {
        return ev_imagen;
    }

    public void setEv_imagen(String ev_imagen) {
        this.ev_imagen = ev_imagen;
    }

    public String getEv_lugar() {
        return ev_lugar;
    }

    public void setEv_lugar(String ev_lugar) {
        this.ev_lugar = ev_lugar;
    }

    public String getEv_nombre(String lang) {
        return ev_nombre[Lenguaje.parse(lang)];
    }

    public void setEv_nombre(String ev_nombre, String lang) {
        this.ev_nombre[Lenguaje.parse(lang)] = ev_nombre;
    }

    public String getEv_objetivo(String lang) {
        return ev_objetivo[Lenguaje.parse(lang)];
    }

    public void setEv_objetivo(String ev_objetivo, String lang) {
        this.ev_objetivo[Lenguaje.parse(lang)] = ev_objetivo;
    }

    public String getEv_slogan(String lang) {
        return ev_slogan[Lenguaje.parse(lang)];
    }

    public void setEv_slogan(String ev_slogan, String lang) {
        this.ev_slogan[Lenguaje.parse(lang)] = ev_slogan;
    }

    public List<AE_Auspicio> getRef_auspicio() {
        return ref_auspicio;
    }

    public void setRef_auspicio(List<AE_Auspicio> ref_auspicio) {
        this.ref_auspicio = ref_auspicio;
    }

    public List<AE_Categoria_Evento> getRef_categoria_evento() {
        return ref_categoria_evento;
    }

    public void setRef_categoria_evento(List<AE_Categoria_Evento> ref_categoria_evento) {
        this.ref_categoria_evento = ref_categoria_evento;
    }

    public List<AE_Conferencista_Evento> getRef_conferencista_evento() {
        return ref_conferencista_evento;
    }

    public void setRef_conferencista_evento(List<AE_Conferencista_Evento> ref_conferencista_evento) {
        this.ref_conferencista_evento = ref_conferencista_evento;
    }

    public CE_Convocatoria getRef_convocatoria() {
        return ref_convocatoria;
    }

    public void setRef_convocatoria(CE_Convocatoria ref_convocatoria) {
        this.ref_convocatoria = ref_convocatoria;
    }

    public AE_Asignar_Evento getRef_evento() {
        return ref_evento;
    }

    public void setRef_evento(AE_Asignar_Evento ref_evento) {
        this.ref_evento = ref_evento;
    }

    public List<CE_Articulo> getRef_evento_articulo() {
        return ref_articulo;
    }

    public void setRef_evento_articulo(List<CE_Articulo> ref_articulo) {
        this.ref_articulo = ref_articulo;
    }

    public List<AE_Evento_Opcion> getRef_evento_opcion() {
        return ref_evento_opcion;
    }

    public void setRef_evento_opcion(List<AE_Evento_Opcion> ref_evento_opcion) {
        this.ref_evento_opcion = ref_evento_opcion;
    }

    public List<AE_Faq> getRef_faq() {
        return ref_faq;
    }

    public void setRef_faq(List<AE_Faq> ref_faq) {
        this.ref_faq = ref_faq;
    }

    public List<AE_Fecha_Evento> getRef_fecha_evento() {
        return ref_fecha_evento;
    }

    public void setRef_fecha_evento(List<AE_Fecha_Evento> ref_fecha_evento) {
        this.ref_fecha_evento = ref_fecha_evento;
    }

    public List<AE_Material> getRef_material() {
        return ref_material;
    }

    public void setRef_material(List<AE_Material> ref_material) {
        this.ref_material = ref_material;
    }

    public List<AE_Organizador> getRef_organizador() {
        return ref_organizador;
    }

    public void setRef_organizador(List<AE_Organizador> ref_organizador) {
        this.ref_organizador = ref_organizador;
    }

    public List<AE_Registro> getRef_registro() {
        return ref_registro;
    }

    public void setRef_registro(List<AE_Registro> ref_registro) {
        this.ref_registro = ref_registro;
    }

    public List<AE_Subcategoria_Evento> getRef_subcategoria_evento() {
        return ref_subcategoria_evento;
    }

    public void setRef_subcategoria_evento(List<AE_Subcategoria_Evento> ref_subcategoria_evento) {
        this.ref_subcategoria_evento = ref_subcategoria_evento;
    }

    public List<AE_Asignar_Evento> getRef_subevento() {
        return ref_subevento;
    }

    public void setRef_subevento(List<AE_Asignar_Evento> ref_subevento) {
        this.ref_subevento = ref_subevento;
    }

    public AE_Tipo_Evento getRef_tipo_evento() {
        return ref_tipo_evento;
    }

    public void setRef_tipo_evento(AE_Tipo_Evento ref_tipo_evento) {
        this.ref_tipo_evento = ref_tipo_evento;
    }

    public Integer getEv_cupo_disponible() {
        return ev_cupo_disponible;
    }

    public void setEv_cupo_disponible(Integer ev_cupo_disponible) {
        this.ev_cupo_disponible = ev_cupo_disponible;
    }

    public Integer getEv_cupo_maximo() {
        return ev_cupo_maximo;
    }

    public void setEv_cupo_maximo(Integer ev_cupo_maximo) {
        this.ev_cupo_maximo = ev_cupo_maximo;
    }
    // </editor-fold>

    public void cr_AE_Evento(Table objeto) {
        this.setEv_id_evento(new BigDecimal((Long) objeto.get("ev_id_evento")));
        this.setEv_nombre((String) objeto.get("ev_nombre_" + Lenguaje.LANG_ES), Lenguaje.LANG_ES);
        this.setEv_nombre((String) objeto.get("ev_nombre_" + Lenguaje.LANG_EN), Lenguaje.LANG_EN);
        this.setEv_nombre((String) objeto.get("ev_nombre_" + Lenguaje.LANG_PT), Lenguaje.LANG_PT);
        this.setEv_lugar((String) objeto.get("ev_lugar"));
        this.setEv_objetivo((String) objeto.get("ev_objetivo_" + Lenguaje.LANG_ES), Lenguaje.LANG_ES);
        this.setEv_objetivo((String) objeto.get("ev_objetivo_" + Lenguaje.LANG_EN), Lenguaje.LANG_EN);
        this.setEv_objetivo((String) objeto.get("ev_objetivo_" + Lenguaje.LANG_PT), Lenguaje.LANG_PT);
        this.setEv_descripcion((String) objeto.get("ev_descripcion_" + Lenguaje.LANG_ES), Lenguaje.LANG_ES);
        this.setEv_descripcion((String) objeto.get("ev_descripcion_" + Lenguaje.LANG_EN), Lenguaje.LANG_EN);
        this.setEv_descripcion((String) objeto.get("ev_descripcion_" + Lenguaje.LANG_PT), Lenguaje.LANG_PT);
        this.setEv_dirigido((String) objeto.get("ev_dirigido_" + Lenguaje.LANG_ES), Lenguaje.LANG_ES);
        this.setEv_dirigido((String) objeto.get("ev_dirigido_" + Lenguaje.LANG_EN), Lenguaje.LANG_EN);
        this.setEv_dirigido((String) objeto.get("ev_dirigido_" + Lenguaje.LANG_PT), Lenguaje.LANG_PT);
        this.setEv_fecha_inicio((java.sql.Date) objeto.get("ev_fecha_inicio"));
        this.setEv_fecha_fin((java.sql.Date) objeto.get("ev_fecha_fin"));
        this.setEv_slogan((String) objeto.get("ev_slogan_" + Lenguaje.LANG_ES), Lenguaje.LANG_ES);
        this.setEv_slogan((String) objeto.get("ev_slogan_" + Lenguaje.LANG_EN), Lenguaje.LANG_EN);
        this.setEv_slogan((String) objeto.get("ev_slogan_" + Lenguaje.LANG_PT), Lenguaje.LANG_PT);
        this.setEv_imagen((String) objeto.get("ev_imagen"));
        this.setEv_cupo_maximo((Integer) objeto.get("ev_cupo_maximo"));
        this.setEv_cupo_disponible((Integer) objeto.get("ev_cupo_disponible"));
        this.setEv_email((String) objeto.get("ev_email"));
        this.setEv_agenda_general((String) objeto.get("ev_agenda_general"));
        this.setEv_estado((String) objeto.get("ev_estado"));
        this.setEv_descripcion_registro((String) objeto.get("ev_descripcion_registro_" + Lenguaje.LANG_ES), Lenguaje.LANG_ES);
        this.setEv_descripcion_registro((String) objeto.get("ev_descripcion_registro_" + Lenguaje.LANG_EN), Lenguaje.LANG_EN);
        this.setEv_descripcion_registro((String) objeto.get("ev_descripcion_registro_" + Lenguaje.LANG_PT), Lenguaje.LANG_PT);
        this.setEv_estado_registro((String) objeto.get("ev_estado_registro"));

        this.ref_tipo_evento.setTe_id_tipo_evento(new BigDecimal((Long) objeto.get("ref_tipo_evento")));
        if (objeto.get("ref_ciudad") != null) {
            this.ref_ciudad.setCi_id_ciudad(new BigDecimal((Long) objeto.get("ref_ciudad")));
        }
    }

    public void cr_AE_Evento(Table objeto, String lang) {
        this.setEv_id_evento(new BigDecimal((Long) objeto.get("ev_id_evento")));
        this.setEv_nombre((String) objeto.get("ev_nombre_" + lang), lang);
        this.setEv_lugar((String) objeto.get("ev_lugar"));
        this.setEv_objetivo((String) objeto.get("ev_objetivo_" + lang), lang);
        this.setEv_descripcion((String) objeto.get("ev_descripcion_" + lang), lang);
        this.setEv_dirigido((String) objeto.get("ev_dirigido_" + lang), lang);
        this.setEv_fecha_inicio((java.sql.Date) objeto.get("ev_fecha_inicio"));
        this.setEv_fecha_fin((java.sql.Date) objeto.get("ev_fecha_fin"));
        this.setEv_slogan((String) objeto.get("ev_slogan_" + lang), lang);
        this.setEv_imagen((String) objeto.get("ev_imagen"));
        this.setEv_cupo_maximo((Integer) objeto.get("ev_cupo_maximo"));
        this.setEv_cupo_disponible((Integer) objeto.get("ev_cupo_disponible"));
        this.setEv_email((String) objeto.get("ev_email"));
        this.setEv_agenda_general((String) objeto.get("ev_agenda_general"));
        this.setEv_estado((String) objeto.get("ev_estado"));
        this.setEv_descripcion_registro((String) objeto.get("ev_descripcion_registro_" + lang), lang);
        this.setEv_estado_registro((String) objeto.get("ev_estado_registro"));

        this.ref_tipo_evento.setTe_id_tipo_evento(new BigDecimal((Long) objeto.get("ref_tipo_evento")));
        if (objeto.get("ref_ciudad") != null) {
            this.ref_ciudad.setCi_id_ciudad(new BigDecimal((Long) objeto.get("ref_ciudad")));
        }
    }

    public static AE_Evento buscar_evento(String id_evento, String lang) {
        AE_Evento evento = new AE_Evento();

        Datos datos = new Datos("WebSAE");
        Registro registros = datos.consulta("SELECT * FROM ae_evento WHERE ev_id_evento = " + id_evento + ";");
        for (int i = 0; i < registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            evento.cr_AE_Evento(objeto, lang);
        }
        return evento;
    }

    public static AE_Evento buscar_evento(String id_evento) {
        AE_Evento evento = new AE_Evento();

        Datos datos = new Datos("WebSAE");
        Registro registros = datos.consulta("SELECT * FROM ae_evento WHERE ev_id_evento = " + id_evento + ";");
        for (int i = 0; i < registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            evento.cr_AE_Evento(objeto);
        }
        return evento;
    }

    public static List<AE_Evento> eventos(String lang) {
        List<AE_Evento> eventos = new LinkedList<AE_Evento>();

        Datos datos = new Datos("WebSAE");
        Registro registros = datos.consulta("SELECT * FROM ae_evento WHERE ev_estado IS NOT NULL AND ev_id_evento NOT IN (SELECT ref_subevento FROM ae_asignar_evento) ORDER BY ev_fecha_inicio desc;");
        for (int i = 0; i < registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Evento evento = new AE_Evento();
            evento.cr_AE_Evento(objeto, lang);
            eventos.add(evento);
        }
        return eventos;
    }

    public static List<AE_Evento> subeventos(String id_evento, String lang) {
        List<AE_Evento> eventos = new LinkedList<AE_Evento>();
        
        Datos datos = new Datos("WebSAE");
        String sql = "SELECT * FROM ae_evento ev, ae_asignar_evento ae WHERE ev.ev_id_evento = ae.ref_subevento AND ae.ref_evento = " + id_evento + " ORDER BY ev_fecha_inicio;";
        Registro registros = datos.consulta(sql);
        for (int i = 0; i < registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Evento evento = new AE_Evento();
            evento.cr_AE_Evento(objeto, lang);
            eventos.add(evento);
        }
        return eventos;
    }

    public static List<AE_Evento> mostrar_eventos_pasados(String lang) {
        List<AE_Evento> eventos = new LinkedList<AE_Evento>();

        Datos datos = new Datos("WebSAE");
        String sql = "SELECT * FROM ae_evento WHERE ev_estado = '" + Estado.REALIZADO + "' AND ev_id_evento NOT IN (SELECT ref_subevento FROM ae_asignar_evento) ORDER BY ev_fecha_inicio;";
        Registro registros = datos.consulta(sql);
        for (int i = 0; i < registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Evento evento = new AE_Evento();
            evento.cr_AE_Evento(objeto, lang);
            eventos.add(evento);
        }
        return eventos;
    }

    public static List<AE_Evento> mostrar_eventos_por_realizar(String lang) {
        List<AE_Evento> eventos = new LinkedList<AE_Evento>();

        Datos datos = new Datos("WebSAE");
        String sql = "SELECT * FROM ae_evento WHERE ev_estado = '" + Estado.VIGENTE + "' AND ev_id_evento NOT IN (SELECT ref_subevento FROM ae_asignar_evento) ORDER BY ev_fecha_inicio DESC;";
        Registro registros = datos.consulta(sql);
        for (int i = 0; i < registros.size(); i++) {
            Table objeto = (Table) registros.get(i);
            AE_Evento evento = new AE_Evento();
            evento.cr_AE_Evento(objeto, lang);
            eventos.add(evento);
        }
        return eventos;
    }
    
    public static JSONObject toJSON(List<AE_Evento> eventos, String lang) {
        JSONObject json = new JSONObject();
        try {
            JSONArray jsonItems = new JSONArray();
            for (Iterator<AE_Evento> it = eventos.iterator(); it.hasNext();) {
                AE_Evento evento = it.next();
                jsonItems.put(toJSONObject(evento, lang));
            }
            json.put("identifier", "id_evento");
            json.put("label", "nombre");
            json.put("items", jsonItems);
        } catch (JSONException ex) {
            Logger.getLogger(AE_Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }

    public static String comprobar_permiso(AE_Evento evento) {
        try {
            DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha_actual = (Date) fecha.parse(String.format("%1$tY-%1$tm-%1$td", Calendar.getInstance()));
            if ((evento.getEv_estado().compareTo(Estado.VIGENTE) == 0 && evento.getEv_fecha_inicio().compareTo(fecha_actual) <= 0) || (evento.getEv_estado().compareTo(Estado.PENDIENTE) == 0 && evento.getEv_fecha_fin().compareTo(fecha_actual) <= 0) || evento.getEv_estado().compareTo(Estado.REALIZADO) == 0 || (evento.getEv_estado().compareTo(Estado.ELIMINADO) == 0 && evento.getEv_fecha_fin().compareTo(fecha_actual) <= 0)) {
                return Constante.LECTURA;
            } else {
                return Constante.ESCRITURA;
            }
        } catch (ParseException ex) {
            Logger.getLogger(AE_Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static JSONObject toJSONObject(AE_Evento evento) {
        JSONObject json = new JSONObject();
        try {
            json.put("id_evento", evento.getEv_id_evento());
            json.put("nombre_" + Lenguaje.LANG_ES, evento.getEv_nombre(Lenguaje.LANG_ES));
            json.put("nombre_" + Lenguaje.LANG_EN, evento.getEv_nombre(Lenguaje.LANG_EN));
            json.put("nombre_" + Lenguaje.LANG_PT, evento.getEv_nombre(Lenguaje.LANG_PT));
            json.put("lugar", evento.getEv_lugar());
            json.put("objetivo_" + Lenguaje.LANG_ES, evento.getEv_objetivo(Lenguaje.LANG_ES));
            json.put("objetivo_" + Lenguaje.LANG_EN, evento.getEv_objetivo(Lenguaje.LANG_EN));
            json.put("objetivo_" + Lenguaje.LANG_PT, evento.getEv_objetivo(Lenguaje.LANG_PT));
            json.put("descripcion_" + Lenguaje.LANG_ES, evento.getEv_descripcion(Lenguaje.LANG_ES));
            json.put("descripcion_" + Lenguaje.LANG_EN, evento.getEv_descripcion(Lenguaje.LANG_EN));
            json.put("descripcion_" + Lenguaje.LANG_PT, evento.getEv_descripcion(Lenguaje.LANG_PT));
            json.put("dirigido_" + Lenguaje.LANG_ES, evento.getEv_dirigido(Lenguaje.LANG_ES));
            json.put("dirigido_" + Lenguaje.LANG_EN, evento.getEv_dirigido(Lenguaje.LANG_EN));
            json.put("dirigido_" + Lenguaje.LANG_PT, evento.getEv_dirigido(Lenguaje.LANG_PT));
            json.put("fecha_actual", String.format("%1$tY-%1$tm-%1$td", Calendar.getInstance()));
            json.put("fecha_inicio", evento.getEv_fecha_inicio());
            DateFormat dfStyle = DateFormat.getDateInstance(DateFormat.LONG);
            if (evento.getEv_fecha_inicio() != null) {
                json.put("fecha_inicio_long", dfStyle.format(evento.getEv_fecha_inicio()));
            }
            if (evento.getEv_fecha_fin() != null) {
                json.put("fecha_fin_long", dfStyle.format(evento.getEv_fecha_fin()));
            }
            json.put("fecha_fin", evento.getEv_fecha_fin());
            json.put("slogan_" + Lenguaje.LANG_ES, evento.getEv_slogan(Lenguaje.LANG_ES));
            json.put("slogan_" + Lenguaje.LANG_EN, evento.getEv_slogan(Lenguaje.LANG_EN));
            json.put("slogan_" + Lenguaje.LANG_PT, evento.getEv_slogan(Lenguaje.LANG_PT));
            json.put("imagen", evento.getEv_imagen());
            json.put("cupo_maximo", evento.getEv_cupo_maximo());
            json.put("cupo_disponible", evento.getEv_cupo_disponible());
            json.put("email", evento.getEv_email());
            json.put("agenda_general", evento.getEv_agenda_general());
            json.put("imagen", evento.getEv_imagen());
            json.put("estado", evento.getEv_estado());
            json.put("descripcion_registro_" + Lenguaje.LANG_ES, evento.getEv_descripcion_registro(Lenguaje.LANG_ES));
            json.put("descripcion_registro_" + Lenguaje.LANG_EN, evento.getEv_descripcion_registro(Lenguaje.LANG_EN));
            json.put("descripcion_registro_" + Lenguaje.LANG_PT, evento.getEv_descripcion_registro(Lenguaje.LANG_PT));
            json.put("estado_registro", evento.getEv_estado_registro());

            if (evento.ref_tipo_evento.getTe_id_tipo_evento() != null)
                json.put("tipo_evento", AE_Tipo_Evento.toJSONObject(AE_Tipo_Evento.buscar_tipo_evento(evento.ref_tipo_evento.getTe_id_tipo_evento())));
            if (evento.ref_ciudad.getCi_id_ciudad() != null)
                json.put("ciudad", SU_Ciudad.toJSONObject(SU_Ciudad.buscar_ciudad(evento.ref_ciudad.getCi_id_ciudad())));
        } catch (Exception ex) {
            Logger.getLogger(AE_Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }

    public static JSONObject toJSONObject(AE_Evento evento, String lang) {
        JSONObject json = new JSONObject();
        try {
            json.put("id_evento", evento.getEv_id_evento());
            json.put("nombre", evento.getEv_nombre(lang));
            json.put("lugar", evento.getEv_lugar());
            json.put("objetivo", evento.getEv_objetivo(lang));
            json.put("descripcion", evento.getEv_descripcion(lang));
            json.put("dirigido", evento.getEv_dirigido(lang));
            DateFormat dfStyle = DateFormat.getDateInstance(DateFormat.LONG);
            if (evento.getEv_fecha_inicio() != null) {
                json.put("fecha_inicio_long", dfStyle.format(evento.getEv_fecha_inicio()));
            }
            if (evento.getEv_fecha_fin() != null) {
                json.put("fecha_fin_long", dfStyle.format(evento.getEv_fecha_fin()));
            }
            json.put("fecha_inicio", evento.getEv_fecha_inicio());
            json.put("fecha_fin", evento.getEv_fecha_fin());
            json.put("slogan", evento.getEv_slogan(lang));
            json.put("imagen", evento.getEv_imagen());
            json.put("cupo_maximo", evento.getEv_cupo_maximo());
            json.put("cupo_disponible", evento.getEv_cupo_disponible());
            json.put("email", evento.getEv_email());
            json.put("agenda_general", evento.getEv_agenda_general());
            json.put("estado", evento.getEv_estado());
            json.put("descripcion_registro", evento.getEv_descripcion_registro(lang));
            json.put("estado_registro", evento.getEv_estado_registro());

            if (evento.ref_tipo_evento.getTe_id_tipo_evento() != null) {
                json.put("tipo_evento", AE_Tipo_Evento.toJSONObject(AE_Tipo_Evento.buscar_tipo_evento(evento.ref_tipo_evento.getTe_id_tipo_evento())));
            }
            if (evento.ref_ciudad.getCi_id_ciudad() != null) {
                json.put("ciudad", SU_Ciudad.toJSONObject(SU_Ciudad.buscar_ciudad(evento.ref_ciudad.getCi_id_ciudad())));
            }
        } catch (Exception ex) {
            Logger.getLogger(AE_Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}