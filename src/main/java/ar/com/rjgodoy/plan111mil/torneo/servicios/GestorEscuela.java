package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.EscuelaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Escuela;

public class GestorEscuela {

	private final EscuelaDao dao;

	public GestorEscuela(EscuelaDao dao) {
		this.dao = dao;
	}

	// CU33 Registrar Escuela
	public void registrarEscuela(Escuela escuela) {
		dao.guardar(escuela);
	}

	// CU26 Listar Escuelas
	public List<Escuela> listarEscuelas() {
		return dao.listarEscuelas();
	}

}
