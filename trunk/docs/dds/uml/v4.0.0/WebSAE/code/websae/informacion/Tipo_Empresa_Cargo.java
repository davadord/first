/**
 * @(#) Tipo_Empresa_Cargo.java
 */

package websae.informacion;

import websae.dominio.Cargo;
import websae.dominio.Tipo_Empresa;

public class Tipo_Empresa_Cargo{
	/**
	 * indicador de estado
	 */
	private int estado;
	
	
	private Integer id_tipo_empresa_cargo;
	
	public Tipo_Empresa_Cargo( ){
		
	}
	
	public void cr_Tipo_Empresa_Cargo( ){
		
	}
	
	public void fin_Tipo_Empresa_Cargo( ){
		
	}
	
	/**
	 * Referencia al tipo de objeto maestro Cargo.
	 */
	public Cargo ref_cargo;
	
	/**
	 * Referencia al tipo de objeto maestro Tipo_Empresa.
	 */
	public Tipo_Empresa ref_tipo_empresa;
	
	
}
