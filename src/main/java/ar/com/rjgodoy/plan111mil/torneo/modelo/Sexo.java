package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Sexo extends Entity {

	public static final char MASCULINO = 'M';
	public static final char FEMENINO = 'F';

	private Character id;
	private String descripcion;

	public Sexo() {
		// no-arg constructor
	}

	public Sexo(Character id) {
		this.id = id;
	}

	public Character getId() {
		return id;
	}

	public void setId(Character id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
