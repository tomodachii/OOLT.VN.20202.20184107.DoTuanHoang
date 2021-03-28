import static org.junit.jupiter.api.Assertions.*;

//import org.graalvm.compiler.lir.StandardOp.ImplicitNullCheck;

//import org.junit.jupiter.api.Test;

class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.95f);
		dvd1.setDirector("Roger Allerts");
		dvd1.setLength(87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
		unitTestAddDigitalVideoDisc(anOrder, dvdList);
		unitTestAddDigitalVideoDisc(anOrder, dvd1, dvd2);
		unitTestSwap(dvd1, dvd2);
		
		MyDate date1 = new MyDate("January 1st 2000");
		MyDate date2 = new MyDate("February 2nd 2000");
		MyDate date3 = new MyDate("February 2nd 1900");
		MyDate date4 = new MyDate("February 2nd 140");
		MyDate date5 = new MyDate("February 2nd 4092");
		unitTestDateCompare(date1, date2);
		MyDate[] dateList = {date1, date2, date3, date4, date5};
		unitTestDateSort(dateList);
		for (MyDate date: dateList) {
			date.print();
		}
	}
	
	public static void unitTestAddDigitalVideoDisc(Order anOrder, DigitalVideoDisc ...dvdList) {
		assertTrue(anOrder.addDigitalVideoDisc(dvdList), "Can not add dvdList");
	}
	public static void unitTestAddDigitalVideoDisc(Order anOrder, DigitalVideoDisc dvd1,
			DigitalVideoDisc dvd2) {
		assertTrue(anOrder.addDigitalVideoDisc(dvd1, dvd2), "Can not add dvdList");
	}
	public static void unitTestSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String title1 = dvd1.getTitle();
		String title2 = dvd2.getTitle();
		String catagory1 = dvd1.getCategory();
		String catagory2 = dvd2.getCategory();
		String director1 = dvd1.getDirector();
		String director2 = dvd2.getDirector();
		int length1 = dvd1.getLength();
		int length2 = dvd2.getLength();
		float cost1 = dvd1.getCost();
		float cost2 = dvd2.getCost();
		TestPassingParameter.swap(dvd1, dvd2);
		assertTrue(title1.equals(dvd2.getTitle()), "Can not swap");
		assertTrue(title2.equals(dvd1.getTitle()), "Can not swap");
		assertTrue(catagory1.equals(dvd2.getCategory()), "Can not swap");
		assertTrue(catagory2.equals(dvd1.getCategory()), "Can not swap");
		assertTrue(director1.equals(dvd2.getDirector()), "Can not swap");
		assertTrue(director2.equals(dvd1.getDirector()), "Can not swap");
		assertTrue(length1 == dvd2.getLength(), "Can not swap");
		assertTrue(length2 == dvd1.getLength(), "Can not swap");
		assertTrue(cost1 == dvd2.getCost(), "Can not swap");
		assertTrue(cost2 == dvd1.getCost(), "Can not swap");
	}
	public static void unitTestDateCompare(MyDate date1, MyDate date2) {
		assertTrue(DateUtil.compare(date1, date2) < 0, "date1 > date2");
	}
	public static void unitTestDateSort(MyDate ...dateList) {
		DateUtil.sort(dateList);
		for (int i = 0; i < dateList.length - 1; i++) {
			assertTrue(DateUtil.compare(dateList[i], dateList[i + 1]) < 0, "Can not sort Date");
		}
	}
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
