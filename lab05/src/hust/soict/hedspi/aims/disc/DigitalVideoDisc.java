package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean search(String title) {
		String[] partsList1 = title.toLowerCase().split(" ");
		String[] partsList2 = this.title.toLowerCase().split(" ");
		int i = 0;
		for (String item1: partsList1) {
			for (String item2: partsList2) {
				if (item1.equals(item2)) {
					i++;
					break;
				}
			}
		}
		if (i == partsList2.length) {
			return true;
		}
		return false;
	}
	
	//Constructor
	public DigitalVideoDisc() {
		this.title = "noname";
		this.category = "unknown";
		this.director = "unknown";
		this.length = 0;
		this.cost = 0.0f;
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
}
