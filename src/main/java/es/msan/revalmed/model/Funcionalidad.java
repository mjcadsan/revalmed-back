package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONALIDADES")
public class Funcionalidad {
	@Id
	@Column(name = "COD_FUNCIONALIDAD", nullable = false, length = 2)
	private Integer codFuncionalidad;
	
	@Column(name = "DESCRIPCION", length = 200)
	private String descripcion;

	/*Constructores*/
	public Funcionalidad() {}
	
	public Funcionalidad(Integer codFuncionalidad, String descripcion) {
		super();
		this.codFuncionalidad = codFuncionalidad;
		this.descripcion = descripcion;
	}

	/*Getters and Setters*/
	public Integer getCodFuncionalidad() {
		return codFuncionalidad;
	}

	public void setCodFuncionalidad(Integer codFuncionalidad) {
		this.codFuncionalidad = codFuncionalidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
