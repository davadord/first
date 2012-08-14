/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package websae.mae.eventos;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import mad.eventos.Datos;
import mad.objetos.Dato;
import mad.objetos.Parametros;
import mad.objetos.Respuesta;
import mad.objetos.Tipo;
import org.json.JSONException;
import org.json.JSONObject;
import websae.informacion.Lenguaje;
import websae.mae.dominio.AE_Evento;

/**
 *
 * @author Guillermo Pizarro
 */
public class Administrar_Subevento {
    
    private AE_Evento evento;
    private BigDecimal id_evento;
    private Datos datos;
    private Respuesta respuesta;
    private String tipo_accion;
    
    public Administrar_Subevento(HttpServletRequest request, String id_evento, String tipo) {
        this.evento = new AE_Evento();
        
        this.evento.setEv_id_evento(new BigDecimal( (String) request.getParameter("txt_id_subevento") ));
        this.evento.setEv_nombre( request.getParameter("txt_subevento_es"), Lenguaje.LANG_ES );
        this.evento.setEv_nombre( request.getParameter("txt_subevento_en"), Lenguaje.LANG_EN );
        this.evento.setEv_nombre( request.getParameter("txt_subevento_pt"), Lenguaje.LANG_PT );
        this.evento.setEv_descripcion( request.getParameter("txt_descripcion_es"), Lenguaje.LANG_ES );
        this.evento.setEv_descripcion( request.getParameter("txt_descripcion_en"), Lenguaje.LANG_EN );
        this.evento.setEv_descripcion( request.getParameter("txt_descripcion_pt"), Lenguaje.LANG_PT );
        this.evento.setEv_cupo_maximo( Integer.parseInt( request.getParameter("txt_cupo") ) );
        this.evento.getRef_tipo_evento().setTe_id_tipo_evento( new BigDecimal( request.getParameter("cmb_tipo_evento") ) );
        this.id_evento = new BigDecimal( id_evento );
        
        this.tipo_accion = tipo;
        
        this.datos = new Datos("WebSAE");
        this.respuesta = new Respuesta();
    }

    public String getMensaje() {
        return this.respuesta.getMensaje();
    }

    public void procesar_peticion() {
        Parametros parametros = new Parametros();

        parametros.add(new Dato(Tipo.IN, this.tipo_accion));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_id_evento(), new BigDecimal("0")));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_nombre( Lenguaje.LANG_ES )));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_nombre( Lenguaje.LANG_EN )));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_nombre( Lenguaje.LANG_PT )));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_descripcion( Lenguaje.LANG_ES ), new String()));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_descripcion( Lenguaje.LANG_EN ), new String()));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_descripcion( Lenguaje.LANG_PT ), new String()));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_cupo_maximo(), new Integer(0)));
        parametros.add(new Dato(Tipo.IN, this.evento.getEv_cupo_disponible(), new Integer(0)));
        parametros.add(new Dato(Tipo.IN, this.evento.ref_tipo_evento.getTe_id_tipo_evento(), new BigDecimal("0")));
        parametros.add(new Dato(Tipo.IN, this.id_evento, new BigDecimal("0")));
        parametros.add(new Dato(Tipo.OUT, new String()));
        
        String sql = "{call ae_administrar_subevento(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        this.respuesta = datos.procedimiento(sql, parametros);
        Dato mensaje = this.respuesta.getObjetos().get(0);
        this.respuesta.setMensaje((String) mensaje.getDato());
    }

    public static JSONObject obtener_mensaje(String mensaje, String lang) {
        String valores[] = new String[2];
        valores = mensaje.split(":", 2);
        JSONObject json = new JSONObject();
        try {
            if (valores[0].equals("OK")) {
                if (valores[1].equals("registrar")) {
                    json.put("tipo", "OK");
                    json.put("mensaje", Lenguaje.OK_SUBEVENTO_REGISTRAR[ Lenguaje.parse(lang) ]);
                } else if (valores[1].equals("modificar")) {
                    json.put("tipo", "OK");
                    json.put("mensaje", Lenguaje.OK_SUBEVENTO_MODIFICAR[ Lenguaje.parse(lang) ]);
                } else if (valores[1].equals("eliminar")) {
                    json.put("tipo", "OK");
                    json.put("mensaje", Lenguaje.OK_SUBEVENTO_ELIMINAR[ Lenguaje.parse(lang) ]);
                }
            } else if (valores[0].equals("ERROR")) {
                if (valores[1].equals("registro")) {
                    json.put("tipo", "ERROR");
                    json.put("mensaje", Lenguaje.ERROR_TECNICO_PROBLEMAS[ Lenguaje.parse(lang) ]);
                } else if (valores[1].equals("repetido")) {
                    json.put("tipo", "ERROR");
                    json.put("mensaje", Lenguaje.ERROR_SUBEVENTO_REPETIDO[ Lenguaje.parse(lang) ]);
                }
            }
        } catch (JSONException ex) {
            Logger.getLogger(Administrar_Subevento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}