import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public boolean setDay(int day) {
		int daysInMonth = 0;
		int month = getMonth();
		int year = getYear();
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				daysInMonth = 29;
			else 
				daysInMonth = 28;
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10 ||
				month == 12) {
			daysInMonth = 31;
		} else {
			daysInMonth = 30;
		}
		
		if (day < 0 || day > daysInMonth) {
			System.out.println("Invalid input (day)");
			return false;
		} else { 
			this.day = day;
			return true;
		}
	}
	public int getMonth() {
		return month;
	}
	public boolean setMonth(int month) {
		if (month < 0 || month > 12) {
			System.out.println("Invalid input (month)");
			return false;
		} else {
			this.month = month;
			return true;
		}
			
	}
	public int getYear() {
		return year;
	}
	public boolean setYear(int year) {
		if (year < 0 || year > 9999) {
			System.out.println("Invalid input (year)");
			return false;
		} else {
			this.year = year;
			return true;
		}
	}
	public void print() {
		if (this.day != 0 && this.month != 0 && this.year != 0)
			System.out.println(this.day + "/" + this.month + "/" + this.year);
		else
			System.out.println("Error! Cannot print invalid date!");
	}
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date (dd/mm/yyyy) : ");
		String str = scanner.nextLine();
		String[] result = str.split("/");
		setYear(Integer.parseInt(result[2]));
		setMonth(Integer.parseInt(result[1]));
		setDay(Integer.parseInt(result[0]));
		scanner.close();
	}
	public MyDate() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		this.day = calendar.get(Calendar.DATE);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.year = calendar.get(Calendar.YEAR) + 1;
	}
	public MyDate(int day, int month, int year) {
		super();
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public MyDate(String str) {
		// dd/mm/yyyy
		String[] result = str.split("/");
		setYear(Integer.parseInt(result[2]));
		setMonth(Integer.parseInt(result[1]));
		setDay(Integer.parseInt(result[0]));
	}
}
