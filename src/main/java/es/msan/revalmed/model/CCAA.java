package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CCAA")
public class CCAA {
	
	@Id
	@Column(name = "COD_CCAA", nullable = false, length = 3)
	private Integer codCCAA;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 100)
	private String descripcion;

	/*Constructores*/
	public CCAA() {}
	
	public CCAA(Integer codCCAA, String descripcion) {
		super();
		this.codCCAA = codCCAA;
		this.descripcion = descripcion;
	}
	
	/*Getters and Setters*/
	public Integer getCodCCAA() {
		return codCCAA;
	}

	public void setCodCCAA(Integer codCCAA) {
		this.codCCAA = codCCAA;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
