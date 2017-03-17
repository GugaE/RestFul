/**
 * 
 */
package com.restfulweb.modelo;

import java.util.Calendar;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gustavo.marins
 *
 */
@XmlRootElement
public class Usuario {

	private long id;
	private String nome;
	private Calendar dataNascimento;
	private List<Telefone> telefones;
	private String sexo;
	private String cpf;
	private String email;
	private List<RedeSocial> redesSocias;
	private String senha;

	public Usuario() {
	}
}
