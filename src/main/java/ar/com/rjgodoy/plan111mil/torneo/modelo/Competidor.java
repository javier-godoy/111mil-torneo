package ar.com.rjgodoy.plan111mil.torneo.modelo;

import java.util.Calendar;
import java.util.Date;

public class Competidor extends Entity {

	private Integer id;
	private int dni;
	private Sexo sexo;
	private String nombres;
	private String apellido;
	private String direccion;
	private Date fechaNacimiento;
	private Escuela escuela;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Escuela getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	@Override
	public String toString() {
		return nombres + " " + apellido;
	}

	public int calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		Calendar nac = Calendar.getInstance();
		nac.setTime(fechaNacimiento);
		int edad = hoy.get(Calendar.YEAR) - nac.get(Calendar.YEAR);
		if (nac.get(Calendar.MONTH) > hoy.get(Calendar.MONTH) || ((nac.get(Calendar.MONTH) == hoy.get(Calendar.MONTH))
				&& nac.get(Calendar.DAY_OF_MONTH) > hoy.get(Calendar.DAY_OF_MONTH))) {
			return edad - 1;
		} else {
			return edad;
		}
	}

}
