package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_IPT")
public class Tipo_IPT {
	
	@Id
	@Column(name = "COD_TIPO_IPT", nullable = false, length = 3)
	private Integer codTipoIpt;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 100)
	private String descripcion;

	/*Constructores*/
	public Tipo_IPT() {}
	
	public Tipo_IPT(Integer codTipoIpt, String descripcion) {
		super();
		this.codTipoIpt = codTipoIpt;
		this.descripcion = descripcion;
	}
	
	/*Getters and Setters*/
	public Integer getCodTipoIpt() {
		return codTipoIpt;
	}

	public void setCodTipoIpt(Integer codTipoIpt) {
		this.codTipoIpt = codTipoIpt;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}
