package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private MyDate dateOrdered;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered++] = disc;
			System.out.println("Successfully insert " + disc.getTitle() + " | current disc : "
					+ qtyOrdered + "/" + MAX_NUMBERS_ORDERED);
			return true;
		} else {
			System.out.printf("The item quantity has reached its limit! "
					+ "Item %s could not be add\n", disc.getTitle());
			return false;
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc ...dvdList) {
		if (dvdList != null) {
			if (dvdList.length > 0) {
				for (DigitalVideoDisc dvd: dvdList) {
					if (!addDigitalVideoDisc(dvd)) {
//						break;
					}
				}
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, 
			DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean flag = false;
		int i;
		for (i = 0; i < qtyOrdered; i++) {
			if (this.itemOrdered[i].getTitle().equals(disc.getTitle())) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Item not found!");
		} else {
			for (int j = i; j < qtyOrdered - 1; j++) {
				itemOrdered[j] = itemOrdered[j + 1];
			}
			qtyOrdered--;
			System.out.println("Successfully remove " + disc.getTitle());
		}
		return flag;
	}
	public float totalCost() {
		float totalCost = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemOrdered[i].getCost();
		}
		return totalCost;
	}
	public void print() {
		System.out.println("***********************Order***********************");
		System.out.print("Date: ");
		dateOrdered.print();
		System.out.println("Ordered Items:");
		float total = 0f;
		for (DigitalVideoDisc dvd: itemOrdered) {
			if (dvd != null) {
				System.out.printf("DVD - %s - %s - %s - %d: %f\n", dvd.getTitle(), dvd.getCategory(),
						dvd.getDirector(), dvd.getLength(), dvd.getCost());
				total += dvd.getCost();
			} else {
				break;
			}
		}
		System.out.println("Total cost: " + total);
		System.out.println("***************************************************");
	}
	
	public DigitalVideoDisc getALuckyItem() {
		int random = (int) (Math.random() * (qtyOrdered));
		itemOrdered[random].setCost(0);
		System.out.println("Congratulation! " + itemOrdered[random].getTitle()
				+ " is the lucky item");
		return itemOrdered[random];
	}
	
	public Order() {
		if (nbOrders < MAX_LIMITTED_ORDERS) {
			this.qtyOrdered = 0;
			this.dateOrdered = new MyDate();
			nbOrders += 1; 
		}
	}
	public Order(int qtyOrdered, DigitalVideoDisc[] itemOrdered, MyDate dateOrdered) {
		if (nbOrders < MAX_LIMITTED_ORDERS) {
			this.qtyOrdered = qtyOrdered;
			this.itemOrdered = itemOrdered;
			this.dateOrdered = dateOrdered;
			nbOrders += 1;
		}
	}
}
