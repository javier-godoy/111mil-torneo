package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Disciplina;

public interface DisciplinaDao {

	void guardar(Disciplina disciplina);

	// CU13 Listar Disciplinas
	List<Disciplina> listarDisciplinas();

}
