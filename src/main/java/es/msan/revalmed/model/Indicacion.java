package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INDICACION")
public class Indicacion {
	
	@Id
	@Column(name = "COD_INDICACION", nullable = false, length = 9)
	private Integer codIndicacion;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 500)
	private String descripcion;
	
	/*Constructores*/
	public Indicacion() {}

	public Indicacion(Integer codIndicacion, String descripcion) {
		super();
		this.codIndicacion = codIndicacion;
		this.descripcion = descripcion;
	}

	/*Getters and Setters*/
	public Integer getCodIndicacion() {
		return codIndicacion;
	}

	public void setCodIndicacion(Integer codIndicacion) {
		this.codIndicacion = codIndicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
