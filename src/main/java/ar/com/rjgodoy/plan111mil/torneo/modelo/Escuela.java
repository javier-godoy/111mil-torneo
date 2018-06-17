package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Escuela extends Entity {

	private Integer id;

	private String nombre;

	private String direccion;

	public Escuela() {
		// no-args constructor
	}

	public Escuela(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
