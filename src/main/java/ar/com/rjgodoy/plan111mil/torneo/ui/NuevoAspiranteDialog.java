/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.rjgodoy.plan111mil.torneo.ui;

import static ar.com.rjgodoy.plan111mil.torneo.ui.UiUtils.validarRequerido;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import ar.com.rjgodoy.plan111mil.torneo.modelo.Competidor;
import ar.com.rjgodoy.plan111mil.torneo.modelo.Sexo;

/**
 * CU30 Ingresar Datos del Aspirante
 * 
 * @author Javier
 */
public class NuevoAspiranteDialog extends javax.swing.JDialog {

	public interface Callback {
		void nuevoAspirante(Competidor c);
	}

	private final Callback callback;
    /**
	 * Creates new form RegistrarSedeFrame
	 */
	public NuevoAspiranteDialog(Callback callback) {
		this.callback = callback;
        initComponents();
		buttonGroupSexo.add(rbMasculino);
		buttonGroupSexo.add(rbFemenino);
		setModal(true);
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
        tfNombres = new javax.swing.JTextField();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfFechaNacimiento = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        tfDNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Disciplina");

        tfNombres.setToolTipText("");

        jLabel1.setText("Nombre");

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

        jLabel2.setText("Apellido");

        tfApellido.setToolTipText("");

        jLabel3.setText("Dirección");

        tfDireccion.setToolTipText("");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Sexo");

        jLabel6.setText("DNI");

        rbMasculino.setText("Masculino");

        rbFemenino.setText("Femenino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(60, 60, 60))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombres)
                            .addComponent(tfApellido)
                            .addComponent(tfDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFemenino)
                                .addGap(0, 118, Short.MAX_VALUE))
                            .addComponent(tfDNI)
                            .addComponent(tfFechaNacimiento))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(rbFemenino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    	Competidor competidor = new Competidor();
    	
    	competidor.setNombres(tfNombres.getText());
		if (!validarRequerido("Nombres", competidor.getNombres())) {
			return;
		}
		
		competidor.setApellido(tfApellido.getText());
		if (!validarRequerido("Apellido", competidor.getApellido())) {
			return;
		}
		
		competidor.setDireccion(tfDireccion.getText());
		if (!validarRequerido("Direccion", competidor.getDireccion())) {
			return;
		}
		
		if (!validarRequerido("DNI", tfDNI.getText())) {
			return;
		}
		if (!UiUtils.validarEntero("DNI", tfDNI.getText())) {
			return;
		}
		competidor.setDni(Integer.parseInt(tfDNI.getText()));
		
		if (rbMasculino.isSelected()) {
			competidor.setSexo(new Sexo(Sexo.MASCULINO));
		} else if (rbFemenino.isSelected()) {
			competidor.setSexo(new Sexo(Sexo.FEMENINO));
		} else {
			UiUtils.validarRequerido("Sexo", null);
			return;
		}

		if (!validarRequerido("Fecha Nacimiento", tfFechaNacimiento.getText())) {
			return;
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			competidor.setFechaNacimiento(sdf.parse(tfFechaNacimiento.getText()));
		} catch (ParseException e) {
			UiUtils.mostrarErrorValidacion("La Fecha ingresada es incorrecta");
			return;
		}

		callback.nuevoAspirante(competidor);
		dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
		dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JFormattedTextField tfFechaNacimiento;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration//GEN-END:variables
}
