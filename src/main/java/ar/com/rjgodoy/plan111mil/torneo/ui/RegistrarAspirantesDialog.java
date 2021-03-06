/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.rjgodoy.plan111mil.torneo.ui;

import static ar.com.rjgodoy.plan111mil.torneo.ui.UiUtils.validarRequerido;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Categoria;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competencia;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Disciplina;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Escuela;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Inscripcion;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorCompetencia;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorEscuela;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorInscripcion;
import ar.com.rjgodoy.plan111mil.torneo.ui.NuevoAspiranteDialog.Callback;

/**
 * CU01 Registrar Inscripcion de Aspirantes
 * 
 * @author Javier
 */
public class RegistrarAspirantesDialog extends javax.swing.JFrame {

	private final GestorEscuela gestorEscuela;

	private final GestorCompetencia gestorCompetencia;

	private final GestorInscripcion gestorInscripcion;

	private Map<Disciplina, Set<Categoria>> categoriasPorDisciplina = new HashMap<>();

	private SeleccionCompetidor competidorSelected;

	private Disciplina disciplinaSelected;

	/**
	 * Creates new form RegistrarSedeFrame
	 */
	public RegistrarAspirantesDialog(GestorEscuela gestorEscuela,
			GestorCompetencia gestorCompetencia, GestorInscripcion gestorInscripcion) {
		this.gestorEscuela = gestorEscuela;
		this.gestorCompetencia = gestorCompetencia;
		this.gestorInscripcion = gestorInscripcion;
        initComponents();
		initListaEscuelas();
		initListaDisciplinas();
		initListaAspirantes();
		initListaCategorias();
		btnNuevoAspirante.setEnabled(false);
    }

	private void initListaEscuelas() {
		DefaultListModel<Escuela> model = new DefaultListModel<>();
		for (Escuela escuela : gestorEscuela.listarEscuelas()) {
			model.addElement(escuela);
		}
		listEscuelas.setModel(model);
		listEscuelas.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				btnNuevoAspirante.setEnabled(true);
			}
		});
	}

	private void initListaAspirantes() {
		listAspirantes.setModel(new DefaultListModel<>());
		listAspirantes.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				listAspirantesSelectionChanged(listAspirantes.getSelectedValue());
			}
		});
	}

	private void initListaDisciplinas() {
		TreeSet<Disciplina> disciplinas = new TreeSet<>(new Comparator<Disciplina>() {
			@Override
			public int compare(Disciplina o1, Disciplina o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});

		for (Competencia competencia : gestorCompetencia.listarCompetenciasVigentes()) {
			Disciplina disciplina = competencia.getDisciplina();
			if (disciplinas.add(disciplina)) {
				categoriasPorDisciplina.put(disciplina, new HashSet<>());
			}
			categoriasPorDisciplina.get(disciplina).addAll(competencia.getCategorias());
		}

		for (Disciplina disciplina : disciplinas) {
			((DefaultTableModel) tableDisciplinas.getModel()).addRow(new Object[] { false, disciplina });
		}

		tableDisciplinas.getColumnModel().getColumn(0).setPreferredWidth(20);
		tableDisciplinas.getColumnModel().getColumn(1).setPreferredWidth(400);

		tableDisciplinas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					listDisciplinaSelectionChanged(tableDisciplinas.getSelectedRow());
				}
			}
		});

		tableDisciplinas.getModel().addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {				
				if (e.getColumn() == 0) {
					listDisciplinaSelectionChanged(e.getFirstRow());
				}
			}
		});

		tableDisciplinas.setEnabled(false);
	}

	private void initListaCategorias() {
		listCategorias.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent ev) {
				if (competidorSelected != null && disciplinaSelected != null) {
					Set<Categoria> categoriasCompetidor = competidorSelected.getCategorias(disciplinaSelected);
					categoriasCompetidor.clear();
					categoriasCompetidor.addAll(listCategorias.getSelectedValuesList());
				}
			}
		});

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listEscuelas = new javax.swing.JList<>();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAspirantes = new javax.swing.JList<>();
        btnNuevoAspirante = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDisciplinas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listCategorias = new javax.swing.JList<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Aspirantes");

        listEscuelas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listEscuelas);

        jLabel2.setText("Seleccione una entidad educativa");

        jLabel3.setText("Aspirantes");

        jScrollPane2.setViewportView(listAspirantes);

        btnNuevoAspirante.setText("Nuevo Aspirante");
        btnNuevoAspirante.setName(""); // NOI18N
        btnNuevoAspirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAspiranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoAspirante)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoAspirante)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel5.setText("Competencias");

        tableDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Disciplina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDisciplinas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane3.setViewportView(tableDisciplinas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );

        jLabel6.setText("Categorías");

        jScrollPane5.setViewportView(listCategorias);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.setName(""); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setName(""); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAceptar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
		Escuela escuela = listEscuelas.getSelectedValue();
		if (!validarRequerido("Escuela", escuela)) {
			return;
		}

		DefaultListModel<SeleccionCompetidor> competidorModel = (DefaultListModel<SeleccionCompetidor>) listAspirantes
				.getModel();
		List<SeleccionCompetidor> competidores = new ArrayList<>();
		for (Enumeration<SeleccionCompetidor> e = competidorModel.elements(); e.hasMoreElements();) {
			competidores.add(e.nextElement());
		}

		if (competidores.isEmpty()) {
			UiUtils.mostrarErrorValidacion("Debe ingresar al menos un competidor");
			return;
		}

		if (confirmar()) {
			List<Competencia> competencias = gestorCompetencia.listarCompetenciasVigentes();
			List<Inscripcion> inscripciones = new ArrayList<>();
			for (SeleccionCompetidor seleccionCompetidor : competidores) {
				Competidor competidor = seleccionCompetidor.getCompetidor();

				competidor.setEscuela(escuela);
				boolean vinculadoDisciplina = false;
				boolean vinculadoCategoria = false;
				for (Competencia competencia : competencias) {
					if (!seleccionCompetidor.hasDisciplina(competencia.getDisciplina())) {
						//no se inscribe a las competencias de la disciplina
						continue;
					}

					vinculadoDisciplina = true;
					for (Categoria categoria : competencia.getCategorias()) {
						if (!seleccionCompetidor.getCategorias(competencia.getDisciplina()).contains(categoria)) {
							//no se inscribe a la categoria para esta disciplina
							continue;
						}

						vinculadoCategoria = true;
						Inscripcion inscripcion = new Inscripcion();
						inscripcion.setCompetidor(competidor);
						inscripcion.setCompetencia(competencia);
						inscripcion.setCategoria(categoria);
						inscripciones.add(inscripcion);
					}

					if (!vinculadoCategoria) {
						UiUtils.mostrarErrorValidacion(competidor + " no se encuentra vinculado a una categoría para "+competencia.getDisciplina());
						return;
					}
					
				}
				if (!vinculadoDisciplina) {
					UiUtils.mostrarErrorValidacion(competidor + " no se encuentra vinculado a una competencia");
					return;
				}
				
				gestorInscripcion.registrarInscripciones(inscripciones);
			}
		}
		
    }//GEN-LAST:event_btnAceptarActionPerformed

	private boolean confirmar() {
		Object[] options = { "SI", "NO" };
		String message = "¿Confirma la inscripción de los participantes ingresados?";
		int n = JOptionPane.showOptionDialog(this, message, "Confirmar inscripción", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		return n == JOptionPane.YES_OPTION;
	}

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
		dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoAspiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAspiranteActionPerformed
        Callback callback = new Callback() {
			@Override
			public void nuevoAspirante(Competidor c) {
				SeleccionCompetidor nuevo = new SeleccionCompetidor(c);
				((DefaultListModel<SeleccionCompetidor>) listAspirantes.getModel()).addElement(nuevo);
				for (Entry<Disciplina, Set<Categoria>> e : categoriasPorDisciplina.entrySet()) {
					Disciplina disciplina = e.getKey();
					for (Categoria categoria : e.getValue()) {
						if (categoria.verificarCompetidor(c)) {
							nuevo.getCategorias(disciplina).add(categoria);
						}
					}
				}
			}
        };
        
		new NuevoAspiranteDialog(callback).setVisible(true);
    }//GEN-LAST:event_btnNuevoAspiranteActionPerformed

	private void listAspirantesSelectionChanged(SeleccionCompetidor competidor) {
		this.competidorSelected = competidor;
		tableDisciplinas.setEnabled(competidorSelected != null);
		for (int i = 0; i < tableDisciplinas.getModel().getRowCount(); i++) {
			Disciplina disciplina = (Disciplina) tableDisciplinas.getModel().getValueAt(i, 1);
			tableDisciplinas.getModel().setValueAt(competidor.hasDisciplina(disciplina), i, 0);
		}
	}

	private void listDisciplinaSelectionChanged(int rowIndex) {
		Disciplina disciplina = (Disciplina) tableDisciplinas.getModel().getValueAt(rowIndex, 1);
		Boolean selected = (Boolean) tableDisciplinas.getModel().getValueAt(rowIndex, 0);

		if (competidorSelected != null) {

			this.disciplinaSelected = null;

			Set<Categoria> categoriasCompetidor = competidorSelected.getCategorias(disciplina);
			Set<Categoria> categorias = categoriasPorDisciplina.get(disciplina);
			DefaultListModel<Categoria> model = new DefaultListModel<>();
			
			int index = 0;
			List<Integer> indicesList = new ArrayList<>();
			for (Categoria categoria : categorias) {
				model.addElement(categoria);
				if (selected && categoriasCompetidor.contains(categoria)) {
					indicesList.add(index);
				}
				index++;
			}

			int indices[] = new int[indicesList.size()];
			for (int i = 0; i < indices.length; i++) {
				indices[i] = indicesList.get(i);
			}

			competidorSelected.setDisciplinaSelected(disciplina, selected);
			listCategorias.setModel(model);
			listCategorias.setSelectedIndices(indices);
			listCategorias.setEnabled(selected);

			if (selected) {
				this.disciplinaSelected = disciplina;
			}
		}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNuevoAspirante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<SeleccionCompetidor> listAspirantes;
    private javax.swing.JList<Categoria> listCategorias;
    private javax.swing.JList<Escuela> listEscuelas;
    private javax.swing.JTable tableDisciplinas;
    // End of variables declaration//GEN-END:variables
}
