package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractHibernateDao {

	protected final SessionFactory sessionFactory;

	public AbstractHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected void guardar(Object entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		session.close();
	}

	protected List listarTodo(Class<?> clazz) {
		Session session = sessionFactory.openSession();
		List result = session.createCriteria(clazz).list();
		session.close();
		return result;
	}

}
