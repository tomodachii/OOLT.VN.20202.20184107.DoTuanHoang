
public class DateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
//		date.print();
		
		MyDate date1 = new MyDate(27,3,2020);
//		date1.print();
		
		MyDate date2 = new MyDate("Feb 17th 2000");
//		date2.print();
		
		MyDate date4 = new MyDate(date1);
//		date4.print();
		
		MyDate date5 = new MyDate("second", "February", "two thousand and one");
//		date5.print();
		
		MyDate[] dateList = {date, date1, date2, date4, date5};
		DateUtil.sort(dateList);
		for (MyDate item: dateList) {
			item.print();
		}
		date.printWithDifferentFormats();
	}

}
