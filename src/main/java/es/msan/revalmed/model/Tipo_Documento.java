package es.msan.revalmed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_DOCUMENTO")
public class Tipo_Documento {
	@Id
	@Column(name = "COD_TIPO_DOCUMENTO", nullable = false, length = 3)
	private Integer codTipoDocumento;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 100)
	private String descripcion;

	/*Constructores*/
	public Tipo_Documento() {}
	
	public Tipo_Documento(Integer codTipoDocumento, String descripcion) {
		super();
		this.codTipoDocumento = codTipoDocumento;
		this.descripcion = descripcion;
	}

	/*Getters and Setters*/
	public Integer getCodTipoDocumento() {
		return codTipoDocumento;
	}

	public void setCodTipoDocumento(Integer codTipoDocumento) {
		this.codTipoDocumento = codTipoDocumento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
