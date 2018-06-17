package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.SedeDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Sede;

public class GestorSede {

	private final SedeDao dao;

	public GestorSede(SedeDao dao) {
		this.dao = dao;
	}

	// CU03 Registrar Sede
	public void registrarSede(Sede sede) {
		dao.guardar(sede);
	}

	// CU07 Listar Sedes
	public List<Sede> listarSedes() {
		return dao.listarSedes();
	}

}
