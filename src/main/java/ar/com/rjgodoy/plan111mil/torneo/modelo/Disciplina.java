package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Disciplina extends Entity {

	private Integer id;

	private String nombre;

	public Disciplina() {
		// no-arg constructor
	}

	public Disciplina(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
