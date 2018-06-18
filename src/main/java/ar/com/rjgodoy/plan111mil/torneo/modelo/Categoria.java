package ar.com.rjgodoy.plan111mil.torneo.modelo;

public class Categoria extends Entity {

	private Integer id;
	
	private String descripcion;

	private Integer edadMin;
	
	private Integer edadMax;
	
	private Sexo sexo;

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

	public Integer getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(Integer edadMin) {
		this.edadMin = edadMin;
	}

	public Integer getEdadMax() {
		return edadMax;
	}

	public void setEdadMax(Integer edadMax) {
		this.edadMax = edadMax;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return descripcion;
	}

	public boolean verificarCompetidor(Competidor competidor) {
		int edad = competidor.calcularEdad();
		if (edadMax != null && edad > edadMax) {
			return false;
		}
		if (edadMin != null && edad < edadMin) {
			return false;
		}
		if (this.sexo != null && !this.sexo.equals(competidor.getSexo())) {
			return false;
		}
		return true;
	}
}
