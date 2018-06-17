package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.DisciplinaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Disciplina;

public class GestorDisciplina {

	private final DisciplinaDao dao;

	public GestorDisciplina(DisciplinaDao dao) {
		this.dao = dao;
	}

	public void registrarDisciplina(Disciplina disciplina) {
		dao.guardar(disciplina);
	}

	// CU13 Listar Disciplinas
	public List<Disciplina> listarDisciplinas() {
		return dao.listarDisciplinas();
	}

}
