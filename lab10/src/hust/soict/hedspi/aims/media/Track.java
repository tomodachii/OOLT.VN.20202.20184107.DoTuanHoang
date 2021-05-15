package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track implements Playable{
	private String title;
	private Integer length;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void play() throws PlayerException {
		if (this.getLength() <= 0) {
			System.err.println("ERROR: Track length is 0");
			throw (new PlayerException());
		}
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
	
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track t = (Track) o;
			if (t != null) {
				return (this.getTitle().equals(t.getTitle()) && 
						this.getLength().equals(t.getLength()));
			}
		}
		return false;
	}
}
