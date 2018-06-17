package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ar.com.rjgodoy.plan111mil.torneo.dao.CategoriaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Categoria;

public class CategoriaDaoImpl extends AbstractHibernateDao implements CategoriaDao {

	public CategoriaDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Categoria categoria) {
		super.guardar(categoria);
	}

	@Override
	public List<Categoria> listarCategorias() {
		return listarTodo(Categoria.class);
	}

}
