package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import ar.com.rjgodoy.plan111mil.torneo.dao.CompetidorDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Escuela;

public class CompetidorDaoImpl extends AbstractHibernateDao implements CompetidorDao {

	public CompetidorDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Competidor competidor) {
		super.guardar(competidor);
	}

	@Override
	public List<Competidor> listarCompetidoresPorEscuela(Escuela e) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Competidor.class);
		criteria.add(Restrictions.eq("escuela", e));
		List result = criteria.list();
		session.close();
		return result;
	}

}
