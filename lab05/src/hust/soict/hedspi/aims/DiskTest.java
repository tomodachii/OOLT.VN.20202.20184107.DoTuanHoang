package hust.soict.hedspi.aims;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

class DiskTest {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.95f);
		dvd1.setDirector("Roger Allerts");
		dvd1.setLength(87);
		unitTestSearch(dvd1, "Harry Potter and The King of Lion");
		
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
		anOrder.addDigitalVideoDisc(dvdList);
		unitTestGetALuckyItem(anOrder);
		anOrder.print();
	}
	
	public static void unitTestSearch(DigitalVideoDisc dvd, String title) {
		assertTrue(dvd.search(title), "Item not found!");
	}
	public static void unitTestGetALuckyItem(Order anOrder) {
		assertTrue((anOrder.getALuckyItem().getCost() == 0), "Can't find a lucky item!");
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
