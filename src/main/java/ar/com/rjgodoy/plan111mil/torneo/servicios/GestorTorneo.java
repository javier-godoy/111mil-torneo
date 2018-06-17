package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.TorneoDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Torneo;

public class GestorTorneo {

	private final TorneoDao dao;

	public GestorTorneo(TorneoDao dao) {
		this.dao = dao;
	}

	// CU05 Registrar Torneo
	public void registrarTorneo(Torneo torneo) {
		dao.guardar(torneo);
	}

	// CU12 Listar Torneos
	public List<Torneo> listarTorneos() {
		return dao.listarTorneos();
	}

}
