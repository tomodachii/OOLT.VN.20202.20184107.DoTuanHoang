
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.95f);
		dvd1.setDirector("Roger Allerts");
		dvd1.setLength(87);
		//add dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is : ");
		System.out.println(anOrder.totalCost());
		
		assert anOrder.removeDigitalVideoDisc(dvd1) : "Cannot remove!";
		// remove lần này sẽ báo lỗi !
		assert anOrder.removeDigitalVideoDisc(dvd1) : "Cannot remove!";
	}

}
