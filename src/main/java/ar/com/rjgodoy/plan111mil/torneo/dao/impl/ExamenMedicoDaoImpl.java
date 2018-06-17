package ar.com.rjgodoy.plan111mil.torneo.dao.impl;

import org.hibernate.SessionFactory;

import ar.com.rjgodoy.plan111mil.torneo.dao.ExamenMedicoDao;
import ar.com.rjgodoy.plan111mil.torneo.modelo.ExamenMedico;

public class ExamenMedicoDaoImpl extends AbstractHibernateDao implements ExamenMedicoDao {

	public ExamenMedicoDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public void guardar(ExamenMedico examenMedico) {
		super.guardar(examenMedico);
	}

}
