package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ar.com.rjgodoy.plan111mil.torneo.dao.SedeDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Sede;

public class SedeDaoImpl extends AbstractHibernateDao implements SedeDao {

	public SedeDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Sede sede) {
		super.guardar(sede);
	}

	@Override
	public List<Sede> listarSedes() {
		return listarTodo(Sede.class);
	}

}
