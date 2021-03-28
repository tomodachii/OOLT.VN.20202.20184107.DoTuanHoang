
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered++] = disc;
			System.out.println("Successfully insert " + disc.getTitle());
		} else {
			System.out.println("List Full!");
		}
	}
	public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean flag = false;
		int i;
		for (i = 0; i < qtyOrdered; i++) {
			if (this.itemOrdered[i].equals(disc)) {
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
}
