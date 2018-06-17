package ar.com.rjgodoy.plan111mil.torneo.servicios;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.dao.CategoriaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Categoria;

public class GestorCategoria {

	private CategoriaDao dao;

	public GestorCategoria(CategoriaDao dao) {
		this.dao = dao;
	}

	// CU02 Registrar Categoría
	public void registrarCategoria(Categoria categoria) {
		dao.guardar(categoria);
	}

	// CU14 Listar Categorías
	public List<Categoria> listarCategorias() {
		return dao.listarCategorias();
	}

}
