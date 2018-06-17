package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import ar.com.rjgodoy.plan111mil.torneo.dao.DisciplinaDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Disciplina;

public class DisciplinaDaoImpl extends AbstractHibernateDao implements DisciplinaDao {

	public DisciplinaDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(Disciplina disciplina) {
		super.guardar(disciplina);
	}

	@Override
	public List<Disciplina> listarDisciplinas() {
		return listarTodo(Disciplina.class);
	}

}
