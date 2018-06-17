package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Competencia;

public interface CompetenciaDao {

	void guardar(Competencia competencia);

	List<Competencia> listarCompetenciasVigentes();

}
