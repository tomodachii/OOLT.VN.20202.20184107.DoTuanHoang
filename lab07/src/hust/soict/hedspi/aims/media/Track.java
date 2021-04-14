package hust.soict.hedspi.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track's length: " + this.getLength());
	}
	
	public Track() {
		super();
	}

	public Track(String title) {
		super();
		this.title = title;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
}
