package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FASE")
public class Fase {	
	@Id
	@Column(name = "COD_FASE", nullable = false, length = 3)
	private Integer codFase;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 120)
	private String descripcion;

	/*Constructores*/
	public Fase() {}
	
	public Fase(Integer codFase, String descripcion) {
		super();
		this.codFase = codFase;
		this.descripcion = descripcion;
	}

	/*Getters and Setters*/
	public Integer getCodFase() {
		return codFase;
	}

	public void setCodFase(Integer codFase) {
		this.codFase = codFase;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}
