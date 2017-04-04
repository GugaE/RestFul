/**
 * 
 */
package com.restfulweb.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gustavo.marins
 *
 */
@Entity
@Table(name="telefone")
public class Telefone {
	
		
	private long id;
	private String tipo;
	private String ddd;
	private String numero;
	private Usuario usuario;
	
	
	
}
