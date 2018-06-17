package ar.com.rjgodoy.plan111mil.torneo.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Competencia extends Entity {

	private Integer id;
	
	private Date inicio;

	private Torneo torneo;

	private Set<Categoria> categorias = new HashSet<>();

	private Disciplina disciplina;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
