/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.rjgodoy.plan111mil.torneo.ui;

import static ar.com.rjgodoy.plan111mil.torneo.ui.UiUtils.validarRequerido;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Categoria;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Sexo;
import ar.com.rjgodoy.plan111mil.torneo.servicios.GestorCategoria;

/**
 * CU02 Registrar Categoría
 * 
 * @author Javier
 */
public class RegistrarCategoriaFrame extends javax.swing.JFrame {

	private final GestorCategoria gestor;

    /**
	 * Creates new form RegistrarSedeFrame
	 */
	public RegistrarCategoriaFrame(GestorCategoria gestor) {
		this.gestor = gestor;
        initComponents();
		initButtonGroupSexo();
	}

	private void initButtonGroupSexo() {
		buttonGroupSexo.add(rbMasculino);
		buttonGroupSexo.add(rbFemenino);
		buttonGroupSexo.add(rbAmbosSexos);
		buttonGroupSexo.setSelected(rbAmbosSexos.getModel(), true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        tfDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfEdadMinima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEdadMaxima = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        rbAmbosSexos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Categoría");

        tfDescripcion.setToolTipText("");

        jLabel1.setText("Descripción");

        btnCancelar.setText("Cancelar");
        btnCancelar.setName(""); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setName(""); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("Edad Mínima");

        tfEdadMinima.setToolTipText("");

        jLabel3.setText("Edad Máxima");
        jLabel3.setToolTipText("");

        tfEdadMaxima.setToolTipText("");

        rbMasculino.setText("Varones");

        rbFemenino.setText("Mujeres");

        rbAmbosSexos.setText("Ambos sexos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEdadMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEdadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbAmbosSexos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(tfDescripcion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEdadMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfEdadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbAmbosSexos)
                    .addComponent(rbFemenino))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
		Categoria categoria = new Categoria();

		categoria.setDescripcion(tfDescripcion.getText());
		if (!validarRequerido("Descripción", categoria.getDescripcion())) {
			return;
		}

		String edadMin = tfEdadMinima.getText();
		if (!UiUtils.validarEntero("Edad Mínima", edadMin)) {
			return;
		}
		if (!edadMin.isEmpty()) {
			categoria.setEdadMin(Integer.parseInt(edadMin));
		}

		String edadMax = tfEdadMaxima.getText();
		if (!UiUtils.validarEntero("Edad Máxima", edadMax)) {
			return;
		}
		if (!edadMax.isEmpty()) {
			categoria.setEdadMax(Integer.parseInt(edadMax));
		}

		if (edadMin.isEmpty() && edadMax.isEmpty()) {
			UiUtils.mostrarErrorValidacion("Debe ingresar un valor para Edad Mínima o Edad Máxima");
			return;
		}

		if (rbMasculino.isSelected()) {
			categoria.setSexo(new Sexo(Sexo.MASCULINO));
		}
		if (rbFemenino.isSelected()) {
			categoria.setSexo(new Sexo(Sexo.FEMENINO));
		}
		gestor.registrarCategoria(categoria);
		dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
		dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rbAmbosSexos;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfEdadMaxima;
    private javax.swing.JTextField tfEdadMinima;
    // End of variables declaration//GEN-END:variables
}
