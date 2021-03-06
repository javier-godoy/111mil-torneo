/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.rjgodoy.plan111mil.torneo.ui;

import ar.com.rjgodoy.plan111mil.torneo.Aplicacion;

/**
 *
 * @author Javier
 */
public class FrameAdministradorTorneo extends javax.swing.JFrame {

	private Aplicacion aplicacion;

    /**
     * Creates new form FramePrincipal
     */
	public FrameAdministradorTorneo(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarCategoria = new javax.swing.JButton();
        brnRegistrarSede = new javax.swing.JButton();
        btnRegistrarDisciplina = new javax.swing.JButton();
        btnRegistrarTorneo = new javax.swing.JButton();
        btnRegistrarCompetencia = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Torneo");

        btnRegistrarCategoria.setText("Registrar Categoría");
        btnRegistrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCategoriaActionPerformed(evt);
            }
        });

        brnRegistrarSede.setText("Registrar Sede");
        brnRegistrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnRegistrarSedeActionPerformed(evt);
            }
        });

        btnRegistrarDisciplina.setText("Registrar Disciplina");
        btnRegistrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDisciplinaActionPerformed(evt);
            }
        });

        btnRegistrarTorneo.setText("Registrar Torneo");
        btnRegistrarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTorneoActionPerformed(evt);
            }
        });

        btnRegistrarCompetencia.setText("Registrar Competencia");
        btnRegistrarCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompetenciaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brnRegistrarSede, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(btnRegistrarDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(btnRegistrarTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCompetencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnRegistrarCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brnRegistrarSede)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarDisciplina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarTorneo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarCompetencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCategoriaActionPerformed
        aplicacion.registrarCategoria();
    }//GEN-LAST:event_btnRegistrarCategoriaActionPerformed

    private void brnRegistrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnRegistrarSedeActionPerformed
        aplicacion.registrarSede();
    }//GEN-LAST:event_brnRegistrarSedeActionPerformed

    private void btnRegistrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDisciplinaActionPerformed
        aplicacion.registrarDisciplina();
    }//GEN-LAST:event_btnRegistrarDisciplinaActionPerformed

    private void btnRegistrarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTorneoActionPerformed
        aplicacion.registrarTorneo();
    }//GEN-LAST:event_btnRegistrarTorneoActionPerformed

    private void btnRegistrarCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompetenciaActionPerformed
        aplicacion.registrarCompetencia();
    }//GEN-LAST:event_btnRegistrarCompetenciaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnRegistrarSede;
    private javax.swing.JButton btnRegistrarCategoria;
    private javax.swing.JButton btnRegistrarCompetencia;
    private javax.swing.JButton btnRegistrarDisciplina;
    private javax.swing.JButton btnRegistrarTorneo;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
