/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package websae.informacion;

/**
 *
 * @author Guillermo Pizarro
 */
public class Lenguaje {
    public static int TOTAL = 3;
    
    public static int ES = 0;
    public static int EN = 1;
    public static int PT = 2;

    public static String LANG_ES = "es";
    public static String LANG_EN = "en";
    public static String LANG_PT = "pt";
    
    public static int parse(String lang) {
        if (lang.compareTo("en") == 0) {
            return EN;
        } else if (lang.compareTo("pt") == 0) {
            return PT;
        }
        return ES;
    }

    /* MENSAJES DE ERROR */

    public static String[] ERROR_AGENDA_REPETIDO = {"La Fecha a ingresar, ya se encuentra registrada.",
                                                   "The Date to enter, is already registered.",
                                                   "La Fecha para assinar, j� est� registrado."};

    public static String[] ERROR_ACTIVIDAD_REPETIDA = {"La Actividad a ingresar, ya se encuentra registrada a esa hora.",
                                                       "The Activity to enter, is already registered in that time.",
                                                       "La Actividad para assinar, j� est� registrado a esa hora."};

    public static String[] ERROR_ACTIVIDAD_TRASLAPADA = {"La Actividad a ingresar, esta siendo traslapada con otra actividad ya ingresada.",
                                                         "The Activity to enter, being overlapped with other activity already registered.",
                                                         "La Actividad para assinar, ser sobreposta com as outra actividad j� registrado."};

    public static String[] ERROR_AUSPICIANTE_REPETIDO = {"El Auspiciante a ingresar, ya se encuentra registrada.",
                                                         "The Sponsor to enter, is already registered.",
                                                         "El Patrocinador para assinar, j� est� registrado."};

    public static String[] ERROR_CARGO_REPETIDO = {"El Cargo a ingresar, ya se encuentra registrada.",
                                                   "The Position to enter, is already registered.",
                                                   "El Cargo para assinar, j� est� registrado."};

    public static String[] ERROR_CARGO_ASIGNADO = {"El Cargo a eliminar, se encuentra asignado.",
                                                   "The charge to remove, is assigned.",
                                                   "A taxa para retirar, � atribu�do."};
    
    public static String[] ERROR_CATEGORIA_REPETIDO = {"La Categor�a a ingresar, ya se encuentra registrada.",
                                                       "The Category to enter, is already registered.",
                                                       "La Categoria para assinar, j� est� registrado."};

    public static String[] ERROR_CLAVE_MODIFICAR = {"La contrasena actual ingresa no coincide con la contrase�a actual almacenada. La contrasena no ha sido modificada.",
                                                    "The current password entered does not match the current password stored. The password was not changed.",
                                                    "O actual senha introduzida n�o corresponder ao actual senha armazenada. A senha n�o foi alterada."};

    public static String[] ERROR_CONFERENCISTA_REPETIDO = {"El Conferencista a ingresar, ya se encuentra registrada.",
                                                           "The Speaker to enter, is already registered.",
                                                           "Do Palestrante para assinar, j� est� registrada."};

    public static String[] ERROR_DESCUENTO_REPETIDO = {"El Descuento a ingresar, ya se encuentra registrada.",
                                                       "The Discount to enter, is already registered.",
                                                       "Do Descuento para assinar, j� est� registrada."};

    public static String[] ERROR_DESCUENTO_TRASLAPADO = {"El Descuento a ingresar, esta siendo traslapada con otro descuento ya ingresado.",
                                                         "The Discount to enter, being overlapped with other discount already registered.",
                                                         "Do Descuento para assinar, ser sobreposta com as outro descuento j� registrado."};

    public static String[] ERROR_EMAIL_CLAVE = {"La direcci�n de correo electr�nico o la contrase�a son incorrectas. Int�ntelo de nuevo.",
                                                "The email address or password are incorrect. Please try again.",
                                                "O endere�o de email ou a senha est�o incorretas. Por favor, tente novamente."};

    public static String[] ERROR_EMAIL_ENVIO = {"Hubo problemas en el env�o del correo, pero Ud. ha sido registrado.",
                                                "There were problems sending the email, but you have been registered.",
                                                "N�o houve problemas para enviar e-mail, mas voc� tem sido registada."};

    public static String[] ERROR_EMAIL_NOENVIADO = {"No se pudo enviar el correo, por favor intente m�s tarde.",
                                                    "Unable to send email, please try again later.",
                                                    "N�o foi poss�vel enviar o e-mail, tente novamente mais tarde."};

    public static String[] ERROR_EMAIL_NOREGISTRADO = {"El correo ingresado no se encuentra registrado.",
                                                       "The entered email is not registered.",
                                                       "Os inscritos e-mail n�o est� registrado."};

    public static String[] ERROR_EMAIL_REPETIDO = {"Ese correo ya se encuentra registrado.",
                                                   "That email is already registered.",
                                                   "Esse e-mail j� est� registrado."};

    public static String[] ERROR_EMPRESA_REGISTRAR = {"Hubo problemas en el registro de la Empresa/Universidad. Intente m�s tarde.",
                                                      "There were problems with the registration of the Enterprise/University. Try again later.",
                                                      "Houve problemas com o registro da Empresa/Universidade. Tente novamente mais tarde."};

    public static String[] ERROR_EMPRESA_REPETIDA = {"La Empresa/Universidad a ingresar, ya se encuentra registrada.",
                                                     "The Enterprise/University to enter, is already registered.",
                                                     "A Empresa/Universidade para assinar, j� est� registrado."};

    public static String[] ERROR_EVENTO_REPETIDO = {"El Evento a ingresar, ya se encuentra registrado.",
                                                    "The Event to enter, is already registered.",
                                                    "Do Evento para assinar, j� est� registrado."};

    public static String[] ERROR_GRUPO_INVESTIGACION_REPETIDO = {"El Grupo de Investigaci�n a ingresar, ya se encuentra registrada.",
                                                                 "The Rearch Group to enter, is already registered.",
                                                                 "Da Grupo de Pesquisa para assinar, j� est� registrado."};

    public static String[] ERROR_GRUPO_INVESTIGACION_ASIGNADO = {"El Grupo de Investigaci�n a eliminar, se encuentra asignado en algun Evento.",
                                                                 "The Rearch Group to delete, is assigned to some Event.",
                                                                 "Da Grupo de Pesquisa para retirar, � atribu�do do Evento."};

    public static String[] ERROR_MATERIAL_REPETIDO = {"El Material a ingresar, ya se encuentra registrada.",
                                                      "The Material to enter, is already registered.",
                                                      "El Material para assinar, j� est� registrado."};

    public static String[] ERROR_MENU_OPCIONES_MODIFICAR = {"No se pudo modificar el Men� de Opciones.",
                                                            "Unable to change the options menu.",
                                                            "�o � poss�vel alterar o menu de op��es."};

    public static String[] ERROR_ORGANIZADOR_REPETIDO = {"El Organizador a ingresar, ya se encuentra registrada.",
                                                         "The Organizer to enter, is already registered.",
                                                         "Do Organizador para assinar, j� est� registrada."};

    public static String[] ERROR_PRECIO_REPETIDO = {"El Precio a ingresar, ya se encuentra registrada.",
                                                    "The Price to enter, is already registered.",
                                                    "Do Precio para assinar, j� est� registrada."};

    public static String[] ERROR_PRECIO_TRASLAPADO = {"El Precio a ingresar, esta siendo traslapada con otro precio ya ingresado.",
                                                      "The Price to enter, being overlapped with other price already registered.",
                                                      "Do Precio para assinar, ser sobreposta com as outro precio j� registrado."};

    public static String[] ERROR_SUBCATEGORIA_REPETIDA = {"La SubCategoria a ingresar, ya se encuentra registrada.",
                                                          "The SubCategory to enter, is already registered.",
                                                          "Da SubCategoria para assinar, j� est� registrada."};

    public static String[] ERROR_SUBCATEGORIA_ASIGNADA = {"La SubCategoria no se puede eliminar debido a que tiene asignado varios elementos.",
                                                          "The sub can not be deleted because it has assigned several elements.",
                                                          "O sub n�o pode ser exclu�do porque tem afectado v�rios elementos."};
    
    public static String[] ERROR_SUBEVENTO_REPETIDO = {"El SubEvento a ingresar, ya se encuentra registrado.",
                                                       "The SubEvent to enter, is already registered.",
                                                       "Do SubEvento para assinar, j� est� registrado."};

    public static String[] ERROR_TECNICO_PROBLEMAS = {"Existen problemas t�cnicos, intente m�s tarde.",
                                                      "There are technical problems, please try again later.",
                                                      "Existem problemas t�cnicos, por favor, tente novamente mais tarde."};
    
    public static String[] ERROR_TECNICO_REGISTRO = {"Hubo problemas en el registro del Usuario. Intente m�s tarde.",
                                                      "There were problems with the registration of the user. Try again later.",
                                                      "Houve problemas com o registo do utilizador. Tente novamente mais tarde."};

    public static String[] ERROR_TIPO_EMPRESA_REPETIDA = {"El Tipo de Empresa a ingresar, ya se encuentra registrada.",
                                                          "The Enterprise Type to enter, is already registered.",
                                                          "A Tipo de Empresa para assinar, j� est� registrado."};

    public static String[] ERROR_TIPO_EVENTO_REPETIDO = {"El Tipo de Evento a ingresar, ya se encuentra registrada.",
                                                         "The Event Type to enter, is already registered.",
                                                         "El Tipo de Evento para assinar, j� est� registrado."};

    public static String[] ERROR_TIPO_MATERIAL_REPETIDO = {"El Tipo de Material a ingresar, ya se encuentra registrada.",
                                                           "The Material Type to enter, is already registered.",
                                                           "El Tipo de Material para assinar, j� est� registrado."};

    public static String[] ERROR_TITULO_REPETIDO = {"El T�tulo a ingresar, ya se encuentra registrado.",
                                                   "The Degree to enter, is already registered.",
                                                   "El Titulo para assinar, j� est� registrado."};

    public static String[] ERROR_ASIGNADO_EMPRESA = {"No se pudo eliminar, debido a que se encuentra asignado a alguna Universidad/Empresa.",
                                                     "Could not removed, because is assigned to an University/Enterprise.",
                                                     "Poder� n�o ser removida, pois � atribu�do a um Universidad/Empresa."};

    public static String[] ERROR_ASIGNADO_EVENTO = {"No se pudo eliminar, debido a que se encuentra asignado a alg�n Evento.",
                                                    "Could not removed, because is assigned to an Event.",
                                                    "Poder� n�o ser removida, pois � atribu�do a um evento."};

    public static String[] ERROR_ASIGNADO_USUARIO = {"No se pudo eliminar, debido a que se encuentra asignado a alg�n Usuario.",
                                                     "Could not removed, because is assigned to an User.",
                                                     "Poder� n�o ser removida, pois � atribu�do a um Usuario."};

    public static String[] ERROR_TEMA_REPETIDO = {"El Tema ingresado ya se encuentra registrado.",
                                                  "The Item is already registered input.",
                                                  "O ponto de entrada j� est� registrado."};
    
    public static String[] ERROR_TEMA_ASIGNADO = {"No se pudo eliminar, debido a que se encuentra asignado a un art�culo.",
                                                  "Could not delete because it is assigned to an item.",
                                                  "N�o foi poss�vel eliminar porque � atribu�da a um item."};
    
    public static String[] ERROR_SECCION_REPETIDO = {"La Secci�n ingresada ya se encuentra registrada.",
                                                     "The Section entered is already registered.",
                                                     "A Sec��o entrou j� est� registrado."};

    public static String[] ERROR_SECCION_ASIGNADO = {"No se pudo eliminar, debido a que se encuentra asignado a una pregunta.",
                                                     "Could not delete because it is assigned to a question.",
                                                     "N�o foi poss�vel eliminar, porque ele � atribu�do a uma causa."};
    
    public static String[] ERROR_PREGUNTA_REPETIDO = {"La Pregunta ingresada ya se encuentra registrada.",
                                                      "The Question entered is already registered.",
                                                      "A Pergunta entrou j� est� registrado."};

    public static String[] ERROR_PREGUNTA_ASIGNADO = {"No se pudo eliminar, debido a que se encuentra asignado a una respuesta.",
                                                      "Could not delete because it is assigned to an answer.",
                                                      "N�o foi poss�vel eliminar, porque ele � atribu�do a uma resposta."};

    public static String[] ERROR_REGISTRO_REPETIDO = {"Ya se encuentra registrado a este evento.",
                                                      "Already register to this Event.",
                                                      "J� est� registrado a este Evento."};

    public static String[] ERROR_ALTERNATIVA_REPETIDO = {"La Alternativa ingresada ya se encuentra registrada.",
                                                         "Alternative entered is already registered.",
                                                         "Alternativa entrou j� est� registrado."};

    public static String[] ERROR_AUTOR_ARTICULO_REPETIDO = {"El email se encuentra repetido.",
                                                            "The email is recorded.",
                                                            "O e-mail � registrado."};

    public static String[] ERROR_AUTOR_ARTICULO_NO_EXISTE = {"El email del autor que desea registrar no se encuentra en el Sistema.",
                                                             "Author's email you want to register is not found in the System.",
                                                             "Author's e-mail voc� deseja registrar n�o est� no sistema."};

    public static String[] ERROR_ARTICULO_REPETIDO = {"El t�tulo del art�culo ya se encuentra registrado.",
                                                      "The article title is already registered.",
                                                      "O t�tulo do artigo j� est� registrado."};

    /* MENSAJES DE OK */
    public static String[] OK_ALTERNATIVA_REGISTRAR = {"Registro exitoso de la Alternativa.",
                                                       "Successful registration of Alternative.",
                                                       "O �xito do registo Alternativa."};
    
    public static String[] OK_ALTERNATIVA_MODIFICAR = {"Modificaci�n exitosa de la Alternativa.",
                                                       "Successful modification of Alternative.",
                                                       "Successful modifica��o da Alternativa."};
    
    public static String[] OK_ALTERNATIVA_ELIMINAR = {"Eliminaci�n exitosa de la Alternativa.",
                                                      "Successful elimination of the Alternative.",
                                                      "Sucesso elimina��o da Alternativa."};
    
    public static String[] OK_PREGUNTA_REGISTRAR = {"Registro exitoso de la Pregunta.",
                                                    "Registration successful Question.",
                                                    "Registo �xito Pergunta."};

    public static String[] OK_PREGUNTA_MODIFICAR = {"Modificaci�n exitosa de la Pregunta.",
                                                    "Successful modification of the Question.",
                                                    "Successful modifica��o da Pergunta."};

    public static String[] OK_PREGUNTA_ELIMINAR = {"Eliminaci�n exitosa de la Pregunta.",
                                                   "Disposal successful Question.",
                                                   "Elimina��o �xito Pergunta."};

    public static String[] OK_SECCION_REGISTRAR = {"Registro exitoso de la Secci�n.",
                                                   "Successful registration of the Section.",
                                                   "O �xito do registo da sec��o."};

    public static String[] OK_SECCION_MODIFICAR = {"Modificaci�n exitosa de la Secci�n.",
                                                   "Successful modification of Section.",
                                                   "Successful modifica��o da sec��o."};

    public static String[] OK_SECCION_ELIMINAR = {"Eliminaci�n exitosa de la Secci�n.",
                                                  "Successful elimination of the Section.",
                                                  "Sucesso elimina��o da Sec��o."};

    public static String[] OK_EVALUACION_ACTUALIZAR = {"Actualizaci�n exitosa de la Evaluaci�n.",
                                                      "Successful update of the Assessmen.",
                                                      "O �xito do actualizacion da avalia��o."};

    public static String[] OK_EVALUACION_REGISTRAR = {"Registro exitoso de la Evaluaci�n.",
                                                      "Successful registration of the Assessmen.",
                                                      "O �xito do registo da avalia��o."};
    
    public static String[] OK_EVALUACION_MODIFICAR = {"Modificaci�n exitosa de la Evaluaci�n.",
                                                      "Successful modification of the Assessment.",
                                                      "Successful modifica��o da Avalia��o."};

    public static String[] OK_TEMA_REGISTRAR = {"Registro exitoso del Tema.",
                                                "Successful Track Record.",
                                                "Registro exitoso del Tema."};
    
    public static String[] OK_TEMA_MODIFICAR = {"Modificaci�n exitosa del Tema.",
                                                "Successful modification of the theme.",
                                                "Successful modifica��o do tema."};

    public static String[] OK_TEMA_ELIMINAR = {"Eliminaci�n exitosa del Tema.",
                                               "Disposal successful theme.",
                                               "Elimina��o sucesso tema."};

    public static String[] OK_CONVOCATORIA_REGISTRAR = {"Registro exitoso de la Convocatoria.",
                                                       "Successful registration of the Call.",
                                                       "O �xito do registo de chamadas."};
    
    public static String[] OK_CONVOCATORIA_MODIFICAR = {"Modificaci�n exitosa de la Convocatoria.",
                                                       "Successful modification of the Call.",
                                                       "Successful modifica��o do convite."};

    public static String[] OK_CONVOCATORIA_ACTUALIZAR = {"Actualizaci�n exitosa de la Convocatoria.",
                                                         "Successful Update of the Call.",
                                                         "Successful actualizaci�n do convite."};

    public static String[] OK_AGENDA_ELIMINAR = {"Eliminaci�n exitosa de la Fecha.",
                                                 "Successful elimination of Date.",
                                                 "Sucesso elimina��o do Fecha."};

    public static String[] OK_AGENDA_MODIFICAR = {"Modificaci�n exitosa de la Fecha.",
                                                  "Successful modification of Date.",
                                                  "Successful modifica��o do Fecha."};

    public static String[] OK_AGENDA_REGISTRAR = {"Registro exitoso de la Fecha.",
                                                  "Successful registration of Date.",
                                                  "O �xito do registo da Fecha."};

    public static String[] OK_ACTIVIDAD_ELIMINAR = {"Eliminaci�n exitosa de la Actividad.",
                                                    "Successful elimination of Activiry.",
                                                    "Sucesso elimina��o do Actividad."};

    public static String[] OK_ACTIVIDAD_MODIFICAR = {"Modificaci�n exitosa de la Actividad.",
                                                     "Successful modification of Activity.",
                                                     "Successful modifica��o do Actividad."};

    public static String[] OK_ACTIVIDAD_REGISTRAR = {"Registro exitoso de la Actividad.",
                                                     "Successful registration of Activity.",
                                                     "O �xito do registo da Actividad."};

    public static String[] OK_AUSPICIANTE_ELIMINAR = {"Eliminaci�n exitosa del Auspiciante.",
                                                      "Successful elimination of Sponsor.",
                                                      "Sucesso elimina��o do Patrocinador."};

    public static String[] OK_AUSPICIANTE_MODIFICAR = {"Modificaci�n exitosa del Auspiciante.",
                                                  "Successful modification of Sponsor.",
                                                  "Successful modifica��o do Patrocinador."};

    public static String[] OK_AUSPICIANTE_REGISTRAR = {"Registro exitoso del Auspiciante.",
                                                  "Successful registration of Sponsor.",
                                                  "O �xito do registo da Patrocinador."};

    public static String[] OK_ASIGNACIONES_REGISTRAR = {"Registro exitoso de las Asignaciones.",
                                                        "Successful registration of assignments.",
                                                        "O �xito do registo da atribui��es."};
    
    public static String[] OK_CARGO_MODIFICAR = {"Modificaci�n exitosa del Cargo.",
                                                  "Successful modification of Position.",
                                                  "Successful modifica��o do Cargo."};

    public static String[] OK_CARGO_REGISTRAR = {"Registro exitoso del Cargo.",
                                                 "Successful registration of Position.",
                                                 "O �xito do registo da Cargo."};

    public static String[] OK_CARGO_ELIMINAR = {"Eliminaci�n exitosa del Cargo.",
                                                "Successful elimination of Position.",
                                                "Sucesso elimina��o da Cargo."};

    public static String[] OK_CATEGORIA_ELIMINAR = {"Eliminaci�n exitosa de la Categor�a.",
                                                    "Successful elimination of Category.",
                                                    "Sucesso elimina��o do Categoria."};
    
    public static String[] OK_CATEGORIA_MODIFICAR = {"Modificaci�n exitosa de la Categor�a.",
                                                     "Successful modification of Category.",
                                                     "Successful modifica��o do Categoria."};

    public static String[] OK_CATEGORIA_REGISTRAR = {"Registro exitoso del Categor�a.",
                                                     "Successful registration of Category.",
                                                     "O �xito do registo da Categoria."};

    public static String[] OK_CLAVE_MODIFICAR = {"La contrasena ha sido modificada exitosamente.",
                                                 "The password has changed successfully.",
                                                 "A senha foi alterada com sucesso."};

    public static String[] OK_CONFERENCISTA_REGISTRAR = {"Registro exitoso del Conferencista.",
                                                         "Successful registration of Speaker.",
                                                         "O �xito do registo do Palestrante."};

    public static String[] OK_CONFERENCISTA_MODIFICAR = {"Modificaci�n exitosa del Conferencista.",
                                                         "Successful modification of Speaker.",
                                                         "O �xito do modifica��o do Palestrante."};

    public static String[] OK_CONFERENCISTA_ELIMINAR = {"Eliminaci�n exitosa del Conferencista.",
                                                        "Successful elimination of Speaker.",
                                                        "Sucesso elimina��o do Palestrante."};

    public static String[] OK_EVALUADOR_REGISTRAR = {"Registro exitoso del Evaluador.",
                                                     "Evaluator Registration successful.",
                                                     "Avaliador de inscri��o."};

    public static String[] OK_EVALUADOR_ELIMINAR = {"Eliminaci�n exitosa del Evaluador.",
                                                    "Disposal successful Evaluator.",
                                                    "Elimina��o Avaliador de sucesso."};

    public static String[] OK_CUENTA_REGISTRAR = {"La cuenta ha sido registrada exitosamente.",
                                                  "The account was registered successfully.",
                                                  "A conta foi registrada com sucesso."};

    public static String[] OK_CUENTA_MODIFICAR = {"Modificaci�n exitosa del Usuario.",
                                                  "Successful modification of the User.",
                                                  "Successful modifica��o do Usu�rio."};

    public static String[] OK_DESCUENTO_REGISTRAR = {"Registro exitoso del Descuento.",
                                                     "Successful registration of Discount.",
                                                     "O �xito do registo do Descuento."};

    public static String[] OK_DESCUENTO_MODIFICAR = {"Modificaci�n exitosa del Descuento.",
                                                     "Successful modification of Discount.",
                                                     "O �xito do modifica��o do Descuento."};

    public static String[] OK_DESCUENTO_ELIMINAR = {"Eliminaci�n exitosa del Descuento.",
                                                    "Successful elimination of Discount.",
                                                    "Sucesso elimina��o do Descuento."};

    public static String[] OK_EMAIL_RECUPERACION = {"Se ha enviado un correo con su contrase�a. Por favor, revise su correo.",
                                                    "Was sent an email with your password. Please check your email.",
                                                    "Foi enviado um e-mail com sua senha. Verifique seu e-mail."};

    public static String[] OK_EMPRESA_REGISTRAR = {"Registro exitoso de la Empresa.",
                                                   "Successful registration of Enterprise.",
                                                   "O �xito do registo da Empresa."};

    public static String[] OK_EMPRESA_MODIFICAR = {"Modificaci�n exitosa de la Empresa.",
                                                   "Successful modification of Enterprise.",
                                                   "Successful modifica��o da Empresa."};

    public static String[] OK_EMPRESA_ELIMINAR = {"Eliminaci�n exitosa de la Empresa.",
                                                  "Successful elimination of Enterprise.",
                                                  "Successful elimina��o da Empresa."};

    public static String[] OK_EVENTO_REGISTRAR = {"Registro exitoso del Evento.",
                                                  "Successful registration of the Event.",
                                                  "O �xito do registo da Evento."};

    public static String[] OK_EVENTO_MODIFICAR = {"Modificaci�n exitosa del Evento.",
                                                  "Successful modification of the Event.",
                                                  "O �xito do modifica��o da Evento."};

    public static String[] OK_FAQ_MODIFICAR = {"Modificaci�n exitosa del FAQ.",
                                               "Successful modification of FAQ.",
                                               "O �xito do modifica��o da FAQ."};

    public static String[] OK_GRUPO_INVESTIGACION_REGISTRAR = {"Registro exitoso del Grupo de Investigaci�n.",
                                                               "Successful registration of Research Group.",
                                                               "O �xito do registo da Grupo de Pesquisa"};

    public static String[] OK_GRUPO_INVESTIGACION_MODIFICAR = {"Modificaci�n exitosa del Grupo de Investigaci�n..",
                                                               "Successful modification of Resarch Group.",
                                                               "Successful modifica��o da Grupo de Pesquisa."};

    public static String[] OK_GRUPO_INVESTIGACION_ELIMINAR = {"Eliminaci�n exitosa del Grupo de Investigaci�n.",
                                                              "Successful elimination of Resarch Group.",
                                                              "Successful elimina��o da Grupo de Pesquisa"};

    public static String[] OK_MATERIAL_ELIMINAR = {"Eliminaci�n exitosa del Material.",
                                                   "Successful elimination of Material.",
                                                   "Sucesso elimina��o de Material."};

    public static String[] OK_MATERIAL_MODIFICAR = {"Modificaci�n exitosa del Material.",
                                                    "Successful modification of Material.",
                                                    "Successful modifica��o de Material."};

    public static String[] OK_MATERIAL_REGISTRAR = {"Registro exitoso del Material.",
                                                    "Successful registration of Material.",
                                                    "O �xito do registo de Material."};

    public static String[] OK_MENU_OPCIONES_MODIFICAR = {"Modificaci�n exitosa del Men� de Opciones.",
                                                         "Successful modification of Option Menu.",
                                                         "Successful modifica��o do menu Op��es."};

    public static String[] OK_ORGANIZADOR_REGISTRAR = {"Registro exitoso del Organizador.",
                                                       "Successful registration of Organizer.",
                                                       "O �xito do registo do Organizador."};

    public static String[] OK_ORGANIZADOR_MODIFICAR = {"Modificaci�n exitosa del Organizador.",
                                                       "Successful modification of Organizer.",
                                                       "O �xito do modifica��o do Organizador."};

    public static String[] OK_ORGANIZADOR_ELIMINAR = {"Eliminaci�n exitosa del Organizador.",
                                                      "Successful elimination of Organizer.",
                                                      "Sucesso elimina��o do Organizador."};

    public static String[] OK_PRECIO_REGISTRAR = {"Registro exitoso del Precio.",
                                                  "Successful registration of Price.",
                                                  "O �xito do registo do Precio."};

    public static String[] OK_PRECIO_MODIFICAR = {"Modificaci�n exitosa del Precio.",
                                                  "Successful modification of Price.",
                                                  "O �xito do modifica��o do Precio."};

    public static String[] OK_PRECIO_ELIMINAR = {"Eliminaci�n exitosa del Precio.",
                                                 "Successful elimination of Price.",
                                                 "Sucesso elimina��o do Precio."};

    public static String[] OK_REGISTRO_REGISTRAR = {"Registro exitoso al Evento.",
                                                    "Successful registration to Event.",
                                                    "O �xito do registo do Evento."};
    
    public static String[] OK_SUBCATEGORIA_REGISTRAR = {"Registro exitoso de la SubCategoria.",
                                                        "Successful registration of SubCategory.",
                                                        "O �xito do registo da SubCategoria."};

    public static String[] OK_SUBCATEGORIA_MODIFICAR = {"Modificaci�n exitosa del SubCategoria.",
                                                        "Successful modification of the SubCategory.",
                                                        "O �xito do modifica��o da SubCategoria."};

    public static String[] OK_SUBCATEGORIA_ELIMINAR = {"Eliminaci�n exitosa del SubCategoria.",
                                                       "Successful elimination of the SubCategory.",
                                                       "Sucesso elimina��o da SubCategoria."};

    public static String[] OK_SUBEVENTO_REGISTRAR = {"Registro exitoso del SubEvento.",
                                                     "Successful registration of the SubEvent.",
                                                     "O �xito do registo da SubEvento."};

    public static String[] OK_SUBEVENTO_MODIFICAR = {"Modificaci�n exitosa del SubEvento.",
                                                     "Successful modification of the SubEvent.",
                                                     "O �xito do modifica��o da SubEvento."};

    public static String[] OK_SUBEVENTO_ELIMINAR = {"Eliminaci�n exitosa del SubEvento.",
                                                    "Successful elimination of the SubEvent.",
                                                    "Sucesso elimina��o da SubEvent."};

    public static String[] OK_TIPO_EMPRESA_MODIFICAR = {"Modificaci�n exitosa del Tipo de Empresa.",
                                                        "Successful modification of the Enterprise Type.",
                                                        "Successful modifica��o do Tipo de Empresa."};

    public static String[] OK_TIPO_EMPRESA_REGISTRAR = {"Registro exitoso del Tipo de Empresa.",
                                                        "Successful registration of the Enterprise Type.",
                                                        "O �xito do registo da Tipo de Empresa."};

    public static String[] OK_TIPO_EMPRESA_ELIMINAR = {"Eliminaci�n exitosa del Tipo de Empresa.",
                                                       "Successful elimination of the Enterprise Type.",
                                                       "Sucesso elimina��o do Tipo de Empresa."};

    public static String[] OK_TIPO_EVENTO_ELIMINAR = {"Eliminaci�n exitosa del Tipo de Evento.",
                                                      "Successful elimination of the Event Type.",
                                                      "Sucesso elimina��o do Tipo de Evento."};

    public static String[] OK_TIPO_EVENTO_MODIFICAR = {"Modificaci�n exitosa del Tipo de Evento.",
                                                       "Successful modification of the Event Type.",
                                                       "Successful modifica��o do Tipo de Evento."};

    public static String[] OK_TIPO_EVENTO_REGISTRAR = {"Registro exitoso del Tipo de Evento.",
                                                       "Successful registration of the Event Type.",
                                                        "O �xito do registo da Tipo de Evento."};

    public static String[] OK_TIPO_MATERIAL_ELIMINAR = {"Eliminaci�n exitosa del Tipo de Material.",
                                                      "Successful elimination of the Material Type.",
                                                      "Sucesso elimina��o do Tipo de Material."};

    public static String[] OK_TIPO_MATERIAL_MODIFICAR = {"Modificaci�n exitosa del Tipo de Material.",
                                                       "Successful modification of the Material Type.",
                                                       "Successful modifica��o do Tipo de Material."};

    public static String[] OK_TIPO_MATERIAL_REGISTRAR = {"Registro exitoso del Tipo de Material.",
                                                       "Successful registration of the Event Material.",
                                                        "O �xito do registo da Tipo de Material."};

    public static String[] OK_TITULO_MODIFICAR = {"Modificaci�n exitosa del T�tulo.",
                                                  "Successful modification of Degree.",
                                                  "Successful modifica��o do Titulo."};

    public static String[] OK_TITULO_REGISTRAR = {"Registro exitoso del T�tulo.",
                                                 "Successful registration of Degree.",
                                                 "O �xito do registo da Titulo."};

    public static String[] OK_TITULO_ELIMINAR = {"Eliminaci�n exitosa del T�tulo.",
                                                 "Successful elimination of Degree.",
                                                 "Sucesso elimina��o da Titulo."};

    public static String[] OK_ARTICULO_MODIFICAR = {"Ha modificado correctamente su Art�culo.",
                                                    "Have successfully modified your article.",
                                                    "Modificou com �xito o seu artigo."};

    public static String[] OK_ARTICULO_REGISTRAR = {"Ha subido correctamente el art�culo. Por favor revisar su email.",
                                                    "Your paper has been uploaded successfully. Please check your email.",
                                                    "Artigo enviado com sucesso. Verifique seu e-mail."};

    public static String[] OK_ARTICULO_ELIMINAR = {"Ha eliminado correctamente su Art�culo.",
                                                   "Successfully removed the article.",
                                                   "Removido com sucesso o artigo. "};

    
    public static String[] EMAIL_ARTICULO_EVALUADO = {"Resultado de la evaluaci�n de su trabajo en el Evento.",
                                                       "",
                                                       ""};
    
    public static String[] EMAIL_ARTICULO_RECIBIDO = {"Confirmaci�n de trabajo recibido.",
                                                       "",
                                                       ""};

    public static String[] ERROR_EVALUADOR_REPETIDO = {"El Evaluador asignado ya se encuentra registrado en el evento.",
                                                     "The Assessor assigned already registered for the event.",
                                                     "O Assessor atribu�do j� registrado para o evento."};

    public static String[] ERROR_EVALUADOR_ASIGNADO = {"No se puede eliminar este evaluador debido a que tiene asignado un art�culo a evaluar.",
                                                       "Can not delete this evaluator because it has assigned an article to be evaluated.",
                                                       "N�o � poss�vel excluir este avaliador porque tem atribu�do um artigo a ser avaliado."};
}
