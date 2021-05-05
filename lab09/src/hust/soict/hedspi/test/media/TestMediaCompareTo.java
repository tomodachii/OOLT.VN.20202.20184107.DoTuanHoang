package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Media> collection = new ArrayList<Media>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Python King", "Animation", 19.95f, 87, "Roger Allers");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Java - an unexpected journey", "Codeventure", 99.96f, 90, "Mad Demon");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("A beautiful hello World", "Science Fiction", 60.9f, 89, "Peter Scripter");
		
		Book book1 = new Book("The trial", "Classic", 100.0f, "Franz Kafka");
		Book book2 = new Book("Doraemon", "Fiction", 20.05f, "Fujiko F. Fujio");
		
		Track track1 = new Track("Heart-shaped box", 12);
		Track track2 = new Track("Polly", 10);
		Track track3 = new Track("The man who sold the world", 8);
		Track track4 = new Track("Lithium", 21);
		Track track5 = new Track("Smells like teen spirit", 15);
		
		CompactDisc album1 = new CompactDisc("Depression", "Rock", 245.55f, "Nirvana",track1, track2, track3, track4, track5);
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		collection.add(book1);
		collection.add(book2);
		
		collection.add(album1);
		
		Iterator<Media> iterator = collection.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The Media currently in the order are: ");
		while (iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).getTitle());
		}
		
		Collections.sort((List<Media>)collection);
		
		iterator = collection.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The Media in sorted order are: ");
		while (iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).getTitle());
		}
		System.out.println("--------------------------------------");
	}

}
