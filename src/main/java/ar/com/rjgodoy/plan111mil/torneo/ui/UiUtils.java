package ar.com.rjgodoy.plan111mil.torneo.ui;

import javax.swing.JOptionPane;

public class UiUtils {

	public static boolean validarRequerido(String nombre, String valor) {
		if (valor == null || valor.isEmpty()) {
			mostrarErrorValidacion("Debe ingresar un valor para " + nombre);
			return false;
		}
		return true;
	}

	public static boolean validarRequerido(String nombre, Object valor) {
		if (valor == null) {
			mostrarErrorValidacion("Debe ingresar un valor para " + nombre);
			return false;
		}
		return true;
	}

	public static boolean validarEntero(String nombre, String valor) {
		if (valor == null || valor.trim().isEmpty()) {
			return true;
		}
		try {
			int n = Integer.parseInt(valor);
			if (n <= 0) {
				mostrarErrorValidacion(nombre + " debe ser positivo");
				return false;
			}
			return true;
		} catch (NumberFormatException e) {
			mostrarErrorValidacion(nombre + " debe ser entero");
			return false;
		}
	}

	public static void mostrarErrorValidacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.WARNING_MESSAGE);
	}

}
