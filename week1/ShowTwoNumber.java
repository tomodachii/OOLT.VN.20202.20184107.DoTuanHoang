import javax.swing.JOptionPane;

public class ShowTwoNumber {

	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You have entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Input the 1st number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNotification += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Input the 2nd number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification);
		System.exit(0);

	}

}