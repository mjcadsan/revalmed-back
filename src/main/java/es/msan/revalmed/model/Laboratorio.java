package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LABORATORIO")
public class Laboratorio {
	
	@Id
	@Column(name = "CIF", nullable = false, length = 9)
	private String cif;
	
	@Column(name = "NOMBRE", nullable = false, length = 150)
	private String nombre;
	
	@Column(name = "EMAIL_CONTACTO", nullable = false, length = 100)
	private String emailContacto;

	/*Constructores*/
	public Laboratorio() {}
	
	public Laboratorio(String cif, String nombre, String emailContacto) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.emailContacto = emailContacto;
	}
	
	/*Getters and Setters*/
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}	
}
