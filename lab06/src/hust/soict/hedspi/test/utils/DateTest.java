package hust.soict.hedspi.test.utils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.print();
//		date.accept();
//		date.print();
		
		MyDate date1 = new MyDate(27,3,2020);
		date1.print();
		
		MyDate date2 = new MyDate("Feb 17th 2000");
		date2.print();
		
		MyDate date4 = new MyDate(date1);
		date4.print();
		
	}

}
