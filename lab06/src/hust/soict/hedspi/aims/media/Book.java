package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthors(String authorsName) {
		if (!(authors.contains(authorsName))) {
			authors.add(authorsName);
		}
	}

	public void removeAuthors(String authorsName) {
		if (!(authors.contains(authorsName))) {
			authors.remove(authorsName);
		}
	}

	public Book(String title) {
		super(title);
	}

	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
}
