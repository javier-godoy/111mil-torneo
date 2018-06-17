package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Inscripcion extends Entity {

	private Integer id;

	private Competidor competidor;
	
	private Competencia competencia;
	
	private Categoria categoria;

	private ExamenMedico examen;

	private Integer posicion;

	private boolean verificada;

	private EstadoInscripcion estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Competidor getCompetidor() {
		return competidor;
	}

	public void setCompetidor(Competidor competidor) {
		this.competidor = competidor;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ExamenMedico getExamen() {
		return examen;
	}

	public void setExamen(ExamenMedico examen) {
		this.examen = examen;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public boolean isVerificada() {
		return verificada;
	}

	public void setVerificada(boolean verificada) {
		this.verificada = verificada;
	}

	public EstadoInscripcion getEstado() {
		return estado;
	}

	public void setEstado(EstadoInscripcion estado) {
		this.estado = estado;
	}

}
