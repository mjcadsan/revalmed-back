package es.msan.revalmed.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MEDICAMENTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento implements Serializable {
	@Id
	@Column(name = "codigo", nullable = false, length = 9)
	private String codigo;
	
	@Column(name = "CIF_LABORATORIO", length = 9)
	private String cif;
	
	@Column(name = "NOMBRE", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "PRINCIPIO_ACTIVO", nullable = false, length = 150)
	private String principioActivo;
	
	@Column(name = "COMERCIALIZADOR_EUROPEO", length = 100)
	private String comercializadorEuropeo;
	
	@Column(name = "FECHA_INTENCION_COMERCIALIZACION")
	private Date fechaIntencionComercializacion;
	
	@Column(name = "ATC", nullable = false, length = 9)
	private String atc;
}
