package ar.com.rjgodoy.plan111mil.torneo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import ar.com.rjgodoy.plan111mil.torneo.dao.CategoriaDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.CompetenciaDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.CompetidorDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.DisciplinaDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.EscuelaDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.ExamenMedicoDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.InscripcionDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.SedeDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.TorneoDao;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.CategoriaDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.CompetenciaDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.CompetidorDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.DisciplinaDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.EscuelaDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.ExamenMedicoDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.InscripcionDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.SedeDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.dao.impl.TorneoDaoImpl;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorCategoria;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorCompetencia;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorDisciplina;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorEscuela;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorInscripcion;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorSede;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorTorneo;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarAspirantesDialog;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarCategoriaFrame;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarCompetenciaFrame;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarDisciplinaFrame;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarEscuelaFrame;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarSedeFrame;
import ar.com.rjgodoy.plan111mil.torneo.ui.RegistrarTorneoFrame;

/**
 *
 * @author Estudiante
 */
public class Aplicacion {

	private SessionFactory sessionFactory;

	public static void main(String[] args) throws Exception {
		initLookAndFeel();
		SessionFactory sessionFactory = initSessionFactory();
		new Aplicacion(sessionFactory);
	}

	private Aplicacion(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		registrarAspirantes();
	}

	private GestorSede crearGestorSede() {
		SedeDao sedeDao = new SedeDaoImpl(sessionFactory);
		GestorSede gestorSede = new GestorSede(sedeDao);
		return gestorSede;
	}

	private GestorEscuela crearGestorEscuela() {
		EscuelaDao escuelaDao = new EscuelaDaoImpl(sessionFactory);
		GestorEscuela gestorEscuela = new GestorEscuela(escuelaDao);
		return gestorEscuela;
	}

	private GestorTorneo crearGestorTorneo() {
		TorneoDao torneoDao = new TorneoDaoImpl(sessionFactory);
		GestorTorneo gestorTorneo = new GestorTorneo(torneoDao);
		return gestorTorneo;
	}

	private GestorCategoria crearGestorCategoria() {
		CategoriaDao categoriaDao = new CategoriaDaoImpl(sessionFactory);
		GestorCategoria gestorCategoria = new GestorCategoria(categoriaDao);
		return gestorCategoria;
	}

	private GestorDisciplina crearGestorDisciplina() {
		DisciplinaDao disciplinaDao = new DisciplinaDaoImpl(sessionFactory);
		GestorDisciplina gestorDisciplina = new GestorDisciplina(disciplinaDao);
		return gestorDisciplina;
	}


	private GestorCompetencia crearGestorCompetencia() {
		CompetenciaDao competenciaDao = new CompetenciaDaoImpl(sessionFactory);
		GestorCompetencia gestorCompetencia = new GestorCompetencia(competenciaDao);
		return gestorCompetencia;
	}

	private GestorInscripcion crearGestorInscripcion() {
		InscripcionDao inscripcionDao = new InscripcionDaoImpl(sessionFactory);
		CompetidorDao competidorDao = new CompetidorDaoImpl(sessionFactory);
		ExamenMedicoDao examenDao = new ExamenMedicoDaoImpl(sessionFactory);
		GestorInscripcion gestorInscripcion = new GestorInscripcion(inscripcionDao, competidorDao, examenDao);
		return gestorInscripcion;
	}

	private void registrarEscuela() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarEscuelaFrame(crearGestorEscuela()).setVisible(true);
			}
		});
	}

	private void registrarSede() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarSedeFrame(crearGestorSede()).setVisible(true);
			}
		});
    }

	private void registrarTorneo() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarTorneoFrame(crearGestorSede(), crearGestorTorneo()).setVisible(true);
			}
		});
	}

	private void registrarCategoria() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarCategoriaFrame(crearGestorCategoria()).setVisible(true);
			}
		});
	}

	private void registrarDisciplina() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarDisciplinaFrame(crearGestorDisciplina()).setVisible(true);
			}
		});
	}

	private void registrarCompetencia() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarCompetenciaFrame(crearGestorTorneo(), crearGestorDisciplina(), crearGestorCategoria(),
						crearGestorCompetencia()).setVisible(true);
			}
		});
	}

	private void registrarAspirantes() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegistrarAspirantesDialog(crearGestorEscuela(), crearGestorCompetencia(), crearGestorInscripcion())
						.setVisible(true);
			}
		});
	}
    
	private static void initLookAndFeel() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private static SessionFactory initSessionFactory() throws Exception {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure() // obtiene los valores de hibernate.cfg.xml
            .build();
    
        try {
            return new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // La variable registry será destruída al crear el SessionFactory,
            // pero como han surgido problemas en el proceso de creación lo hacemos
            StandardServiceRegistryBuilder.destroy(registry);
            throw e;
        } 
    }
    
}
