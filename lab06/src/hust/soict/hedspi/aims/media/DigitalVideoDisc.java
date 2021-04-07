package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;

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

	public boolean search(String title) {
		String[] partsList1 = title.toLowerCase().split(" ");
		String[] partsList2 = this.title.toLowerCase().split(" ");
		int i = 0;
		for (String item1 : partsList1) {
			for (String item2 : partsList2) {
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

	// Constructor
	public DigitalVideoDisc() {
		this.title = "noname";
		this.category = "unknown";
		this.director = "unknown";
		this.length = 0;
		this.cost = 0.0f;
	}

	public DigitalVideoDisc(String title) {
		super(title);
	}

	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}

	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length) {
		this(title, category, director);
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

}
