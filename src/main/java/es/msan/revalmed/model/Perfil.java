package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERFIL")
public class Perfil {
	
	@Id
	@Column(name = "COD_PERFIL", nullable = false, length = 3)
	private Integer codPerfil;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 100)
	private String descripcion;

	/*Constructores*/
	public Perfil() {}
	
	public Perfil(Integer codPerfil, String descripcion) {
		super();
		this.codPerfil = codPerfil;
		this.descripcion = descripcion;
	}

	/*Getters and Setters*/
	public Integer getCodPerfil() {
		return codPerfil;
	}

	public void setCodPerfil(Integer codPerfil) {
		this.codPerfil = codPerfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
