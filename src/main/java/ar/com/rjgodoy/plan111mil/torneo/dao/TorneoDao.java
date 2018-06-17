package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Torneo;

public interface TorneoDao {

	void guardar(Torneo torneo);

	// CU12 Listar Torneos
	List<Torneo> listarTorneos();

}
