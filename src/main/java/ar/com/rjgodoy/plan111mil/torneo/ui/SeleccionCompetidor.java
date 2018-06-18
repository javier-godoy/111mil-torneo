package ar.com.rjgodoy.plan111mil.torneo.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Categoria;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Disciplina;

public class SeleccionCompetidor {
	private final Competidor competidor;
	private final Map<Disciplina, Set<Categoria>> categoriasPorDisciplina = new HashMap<>();
	private final Set<Disciplina> disciplinas = new HashSet<>();

	public SeleccionCompetidor(Competidor competidor) {
		this.competidor = competidor;
	}

	public Competidor getCompetidor() {
		return competidor;
	}

	@Override
	public String toString() {
		return competidor.toString();
	}

	boolean hasDisciplina(Disciplina disciplina) {
		return disciplinas.contains(disciplina);
	}

	Set<Categoria> getCategorias(Disciplina disciplina) {
		Set<Categoria> categorias = categoriasPorDisciplina.get(disciplina);
		if (categorias == null) {
			categorias = new HashSet<>();
			categoriasPorDisciplina.put(disciplina, categorias);
		}
		return categorias;
	}

	public void setDisciplinaSelected(Disciplina disciplina, boolean selected) {
		if (selected) {
			disciplinas.add(disciplina);
		} else {
			disciplinas.remove(disciplina);
		}

	}
}