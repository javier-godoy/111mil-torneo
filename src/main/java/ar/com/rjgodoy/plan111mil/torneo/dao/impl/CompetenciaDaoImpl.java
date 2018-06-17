package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import ar.com.rjgodoy.plan111mil.torneo.dao.CompetenciaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competencia;

public class CompetenciaDaoImpl extends AbstractHibernateDao implements CompetenciaDao {

	public CompetenciaDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Competencia competencia) {
		super.guardar(competencia);
	}

	@Override
	public List<Competencia> listarCompetenciasVigentes() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Competencia.class);
		criteria.add(Restrictions.ge("inicio", new Date()));
		List result = criteria.list();
		session.close();
		return result;
	}

}
