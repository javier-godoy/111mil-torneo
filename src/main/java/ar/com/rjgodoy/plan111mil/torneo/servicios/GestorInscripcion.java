package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.CompetidorDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.ExamenMedicoDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.InscripcionDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.EstadoInscripcion;
import ar.com.rjgodoy.plan111mil.torneo.modelo.EstadoInscripcionEnum;
import ar.com.rjgodoy.plan111mil.torneo.modelo.ExamenMedico;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Inscripcion;

public class GestorInscripcion {

	private final CompetidorDao competidorDao;
	private final InscripcionDao inscripcionDao;
	private final ExamenMedicoDao examenDao;

	public GestorInscripcion(InscripcionDao inscripcionDao, CompetidorDao competidorDao, ExamenMedicoDao examenDao) {
		this.competidorDao = competidorDao;
		this.inscripcionDao = inscripcionDao;
		this.examenDao = examenDao;
	}

	// CU01 Registrar Inscripcion de Aspirantes
	public void registrarInscripciones(List<Inscripcion> inscripciones) {
		EstadoInscripcion estado = new EstadoInscripcion();
		estado.setId(EstadoInscripcionEnum.INGRESADA.getId());

		for (Inscripcion inscripcion : inscripciones) {
			if (inscripcion.getCompetidor().getId() == null) {
				competidorDao.guardar(inscripcion.getCompetidor());
			}
			inscripcion.setEstado(estado);
			inscripcionDao.guardar(inscripcion);
		}
	}

	// CU23 Listar Inscr. por competidor
	List<Inscripcion> listarInscripcionesPorCompetidor(Competidor c) {
		throw new UnsupportedOperationException();
	}

	// CU16 Registrar Resultado Examen Médico
	void registrarResultadoExamen(Inscripcion inscripcion, ExamenMedico examen) {
		throw new UnsupportedOperationException();
	}

	// CU28 Registrar Evaluación de Inscripción
	void registarEvaluacionInscripcion(Inscripcion inscripcion, boolean documentacionVerificada) {
		throw new UnsupportedOperationException();
	}

}
