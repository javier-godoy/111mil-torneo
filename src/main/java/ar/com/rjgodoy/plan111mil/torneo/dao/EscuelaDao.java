package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Escuela;

public interface EscuelaDao {

	void guardar(Escuela escuela);

	// CU26 Listar Escuelas
	List<Escuela> listarEscuelas();

}
