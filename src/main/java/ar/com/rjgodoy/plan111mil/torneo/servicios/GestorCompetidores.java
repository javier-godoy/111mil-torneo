package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Escuela;

public interface GestorCompetidores {

	// CU27 Listar Competidores por escuela
	List<Competidor> listarCompetidoresPorEscuela(Escuela e);

}
