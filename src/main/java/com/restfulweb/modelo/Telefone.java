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
@XmlRootElement
@Entity
@Table(name="telefone")
public class Telefone {
	
	@Id
	@Column(name="id")
	private long id;
	@Column(name="tipo")
	private String tipo;
	@Column(name="ddd")
	private String ddd;
	@Column(name="numero")
	private String numero;
	
}
