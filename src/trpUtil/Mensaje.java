package trpUtil;

import java.awt.Component;
import javax.swing.JOptionPane;


public final class Mensaje {

	private Mensaje() {
	}

	public static void showInfo(Component parent, String message) {
		JOptionPane.showMessageDialog(parent, message, "TURISMOREAL - INFO",
						JOptionPane.INFORMATION_MESSAGE);
	}

	public static void showError(Component parent, String message) {
		JOptionPane.showMessageDialog(parent, message, "TURISMOREAL - ERROR",
						JOptionPane.ERROR_MESSAGE);
	}

	public static boolean showConfirm(Component parent, String message) {
		int rpta = JOptionPane.showConfirmDialog(parent, message, "TURISMOREAL - CONFIRMAR",
						JOptionPane.YES_NO_OPTION);
		return (rpta == JOptionPane.YES_OPTION);
	}

}
