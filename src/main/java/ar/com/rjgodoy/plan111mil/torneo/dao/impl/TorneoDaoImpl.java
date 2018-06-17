package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ar.com.rjgodoy.plan111mil.torneo.dao.TorneoDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Torneo;

public class TorneoDaoImpl extends AbstractHibernateDao implements TorneoDao {

	public TorneoDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Torneo torneo) {
		super.guardar(torneo);
	}

	@Override
	public List<Torneo> listarTorneos() {
		return listarTodo(Torneo.class);
	}

}
