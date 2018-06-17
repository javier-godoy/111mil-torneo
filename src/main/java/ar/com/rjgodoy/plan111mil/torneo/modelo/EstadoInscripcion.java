package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class EstadoInscripcion extends Entity {

	private Integer id;
	private String descripcion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EstadoInscripcionEnum getEnumValue() {
		return EstadoInscripcionEnum.fromId(this.id);
	}
}
