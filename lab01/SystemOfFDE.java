import javax.swing.JOptionPane;

public class SystemOfFDE {

	public static void main(String[] args) {
		String strNum11, strNum12, strNum21, strNum22, strNum1, strNum2;
		double a11, a12, a21, a22, b1, b2;
		JOptionPane.showMessageDialog(null, "a11x1 + a12x2 = b1" + "\n"
				+ "a21x1 + a22x2 = b2");
		
		strNum11 = JOptionPane.showInputDialog(null, "a11 = ?");
		a11 = Double.parseDouble(strNum11);
		strNum12 = JOptionPane.showInputDialog(null, "a12 = ?");
		a12 = Double.parseDouble(strNum12);
		strNum1 = JOptionPane.showInputDialog(null, "b1 = ?");
		
		strNum21 = JOptionPane.showInputDialog(null, "a21 = ?");
		a21 = Double.parseDouble(strNum21);
		strNum22 = JOptionPane.showInputDialog(null, "a22 = ?");
		a22 = Double.parseDouble(strNum22);
		b1 = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null, "b2 = ?");
		b2 = Double.parseDouble(strNum2);
		
		double D = a11 * a22 - a21 * a12;
		double D1 = b1 * a22 - b2 * a12;
		double D2 = a11 * b2 - a21 * b1;
		double x1 = D1/D, x2 = D2/D;
		if (D != 0) {
			JOptionPane.showMessageDialog(null, "(x1, x2) = (" + x1 + ", " + x2 + ")");
		} else if (D == 0) {
			if (D1 == 0 && D2 == 0) {
				JOptionPane.showMessageDialog(null, "The system has infinitely many solutions");
			} else {
				JOptionPane.showMessageDialog(null, "No solutuon");
			}
		}

	}

}
