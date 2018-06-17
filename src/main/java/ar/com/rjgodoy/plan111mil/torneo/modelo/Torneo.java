package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Torneo extends Entity {

	private Integer id;

	private String nombre;

	private Sede sede;

	public Torneo() {
		// TODO Auto-generated constructor stub
	}

	public Torneo(String nombre, Sede sede) {
		this.nombre = nombre;
		this.sede = sede;
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

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
