package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import ar.com.rjgodoy.plan111mil.torneo.dao.InscripcionDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Inscripcion;

public class InscripcionDaoImpl extends AbstractHibernateDao implements InscripcionDao {

	public InscripcionDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Inscripcion inscripcion) {
		super.guardar(inscripcion);
	}

	@Override
	public List<Inscripcion> listarInscripcionesPorCompetidor(Competidor c) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Inscripcion.class);
		criteria.add(Restrictions.eq("competidor", c));
		List result = criteria.list();
		session.close();
		return result;
	}

}
