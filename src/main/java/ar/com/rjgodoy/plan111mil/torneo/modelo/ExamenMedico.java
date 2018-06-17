package ar.com.rjgodoy.plan111mil.torneo.modelo;

import java.util.Date;

public class ExamenMedico extends Entity {

	private Integer id;
	private Inscripcion inscripcion;
	private Date fechaExamen;
	private Date fechaPresentacion;
	private boolean apto;
	private String observaciones;
	private String nombreMedico;
	private String matriculaMedico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Inscripcion getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(Inscripcion inscripcion) {
		this.inscripcion = inscripcion;
	}
	public Date getFechaExamen() {
		return fechaExamen;
	}
	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}
	public Date getFechaPresentacion() {
		return fechaPresentacion;
	}
	public void setFechaPresentacion(Date fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}
	public boolean isApto() {
		return apto;
	}
	public void setApto(boolean apto) {
		this.apto = apto;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getNombreMedico() {
		return nombreMedico;
	}
	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}
	public String getMatriculaMedico() {
		return matriculaMedico;
	}
	public void setMatriculaMedico(String matriculaMedico) {
		this.matriculaMedico = matriculaMedico;
	}

}
