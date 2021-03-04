
import java.lang.Math;
import javax.swing.JOptionPane;

public class SecondDegreeEquationOneVar {

	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
		double a, b, c;
		JOptionPane.showMessageDialog(null, "ax^2 + bx + c = 0");
		strNum1 = JOptionPane.showInputDialog(null, "a = ?");
		a = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null, "b = ?");
		b = Double.parseDouble(strNum2);
		strNum3 = JOptionPane.showInputDialog(null, "c = ?");
		c = Double.parseDouble(strNum3);
		double d = b * b - 4 * a * c;
		double x1, x2;
		if (d == 0) {
			JOptionPane.showMessageDialog(null, "x1 = x2 =  " + -b/(2 * a));
		} else if (d > 0) {
			x1 = (-b + Math.sqrt(d))/(2 * a);
			x2 = (-b - Math.sqrt(d))/(2 * a);
			JOptionPane.showMessageDialog(null, "x1 = " + x1
					+ "\nx2 = " + x2);
		} else
			JOptionPane.showMessageDialog(null, "No solution");

	}

}
