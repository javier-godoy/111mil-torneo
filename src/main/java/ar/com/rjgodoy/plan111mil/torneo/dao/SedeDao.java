package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Sede;

public interface SedeDao {

	void guardar(Sede sede);

	// CU07 Listar Sedes
	List<Sede> listarSedes();

}
