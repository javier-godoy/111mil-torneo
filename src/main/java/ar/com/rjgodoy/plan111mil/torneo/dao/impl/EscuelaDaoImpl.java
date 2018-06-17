package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ar.com.rjgodoy.plan111mil.torneo.dao.EscuelaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Escuela;

public class EscuelaDaoImpl extends AbstractHibernateDao implements EscuelaDao {

	public EscuelaDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Escuela escuela) {
		super.guardar(escuela);
	}

	@Override
	public List<Escuela> listarEscuelas() {
		return listarTodo(Escuela.class);
	}

}
