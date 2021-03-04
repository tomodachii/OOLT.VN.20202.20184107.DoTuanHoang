
import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You have entered: ";
		
		double num1, num2;
		do {
		strNum1 = JOptionPane.showInputDialog(null, 
				"Input the 1st number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);
		} while (num1 == 0);
		
		strNotification += strNum1 + " and ";
		
		do {
		strNum2 = JOptionPane.showInputDialog(null,
				"Input the 2nd number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		} while (num2 == 0);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification);
		
		JOptionPane.showMessageDialog(null, "Sum :" + (num1 + num2) + "\n"
				+ "Difference :" + (num1 - num2) + "\n"
				+ "Product :" + num1 * num2 + "\n"
				+ "Quotient :" + num1/num2);
		System.exit(0);

	}
}