import javax.swing.JOptionPane;

public class FirstDegreeEquation {

	public static void main(String[] args) {
		String strNum1, strNum2;
		double a, b;
		JOptionPane.showMessageDialog(null, "ax + b = 0");
		strNum1 = JOptionPane.showInputDialog(null, "a = ?");
		a = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null, "b = ?");
		b = Double.parseDouble(strNum2);
		double x = -b/a;
		JOptionPane.showMessageDialog(null, "x = " + x);

	}

}
