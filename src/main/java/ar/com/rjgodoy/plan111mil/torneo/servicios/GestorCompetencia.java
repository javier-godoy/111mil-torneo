package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.CompetenciaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competencia;

public class GestorCompetencia {

	private final CompetenciaDao dao;

	public GestorCompetencia(CompetenciaDao dao) {
		this.dao = dao;
	}

	// CU08 Registrar Competencia
	public void registrarCompetencia(Competencia competencia) {
		dao.guardar(competencia);
	}

	public List<Competencia> listarCompetenciasVigentes() {
		return dao.listarCompetenciasVigentes();
	}

}
