package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRITERIOS_PRIORIZACION")
public class Criterios_Priorizacion {

	@Id
	@Column(name = "COD_CRITERIO", nullable = false, length = 3)
	private Integer codCriterio;
	
	@Column(name = "COD_CRITERIO_PADRE", length = 3)
	private Integer CodCriterioPadre;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	/*Constructores*/
	public Criterios_Priorizacion() {}
	
	public Criterios_Priorizacion(Integer codCriterio, Integer codCriterioPadre, String nombre) {
		super();
		this.codCriterio = codCriterio;
		CodCriterioPadre = codCriterioPadre;
		this.nombre = nombre;
	}
	
	/*Getters and Setters*/
	public Integer getCodCriterio() {
		return codCriterio;
	}

	public void setCodCriterio(Integer codCriterio) {
		this.codCriterio = codCriterio;
	}

	public Integer getCodCriterioPadre() {
		return CodCriterioPadre;
	}

	public void setCodCriterioPadre(Integer codCriterioPadre) {
		CodCriterioPadre = codCriterioPadre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
