
public class DateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.print();
		date.accept();
		date.print();
		
		MyDate date1 = new MyDate(16,3,2020);
		date1.print();
		
		MyDate date2 = new MyDate("17/3/2020");
		date2.print();
	}

}
