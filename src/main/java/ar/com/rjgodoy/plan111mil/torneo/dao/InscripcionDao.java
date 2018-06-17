package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Inscripcion;

public interface InscripcionDao {

	void guardar(Inscripcion inscripcion);

	// CU23 Listar Inscr. por competidor
	List<Inscripcion> listarInscripcionesPorCompetidor(Competidor c);

}
