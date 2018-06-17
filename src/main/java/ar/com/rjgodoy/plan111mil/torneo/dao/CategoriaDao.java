package ar.com.rjgodoy.plan111mil.torneo.dao;

import java.util.List;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Categoria;

public interface CategoriaDao {

	void guardar(Categoria categoria);

	// CU14 Listar Categorías
	List<Categoria> listarCategorias();

}
