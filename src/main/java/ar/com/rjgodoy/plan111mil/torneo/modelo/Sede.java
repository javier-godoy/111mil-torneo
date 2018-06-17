package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Sede extends Entity {

	private Integer id;

	private String nombre;

	private String direccion;

	public Sede() {
		// no-args constructor
	}

	public Sede(String nombre, String direccion) {
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
