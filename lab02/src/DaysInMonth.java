import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		int year;
		int month = 0;
		int numberOfDays;
		String monthInput;
		Scanner scanner = new Scanner(System.in);
		String monthList[] = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December"};
		String monthList1[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
				"Aug", "Sep", "Oct", "Nov", "Dec"};
		String monthList2[] = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", 
				"Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
		String monthList3[] = {"1", "2", "3", "4", "5", "6", "7", 
				"8", "9", "10", "11", "12"};
		
		do {
			System.out.println("Enter year :");
			year = scanner.nextInt();
			if (year < 1000 || year > 9999) System.out.println("Invalid input! Please enter again");
		} while (year < 1000 || year > 9999);
		scanner.nextLine();
		boolean flag = true;
		do {
			System.out.println("Enter month :");
			monthInput = scanner.nextLine();
			
			for (int i = 0; i < 12; i++) {
				if (monthInput.equals(monthList[i]) || monthInput.equals(monthList1[i]) ||
						monthInput.equals(monthList2[i]) || monthInput.equals(monthList3[i])) {
					month = i + 1;
					flag = false;
				}
			}
			if (flag) System.out.println("Invalid input! Please enter again");
		} while (flag);
		
		if(month == 2) {
			if (year % 4 == 0 && year % 100 != 0) {
				numberOfDays = 29;
			} else {
				numberOfDays = 28;
			}
			
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10 ||
				month == 12) {
			numberOfDays = 31;
			
		} else {
			numberOfDays = 30;
		}
		System.out.println("Number of days in month : " + numberOfDays);
		scanner.close();
	}

}
