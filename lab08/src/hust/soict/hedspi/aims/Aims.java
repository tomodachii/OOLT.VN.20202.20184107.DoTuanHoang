package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//import com.sun.tools.classfile.StackMapTable_attribute.chop_frame;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		boolean flag = false;
//		
//		Order order = new Order();
//		showMenu();
//		int c;
//		do {
//			c = scanner.nextInt();
//			scanner.nextLine();
//			switch (c) {
//			case 0: {
//				order = new Order();
//				System.out.println("Good bye !!");
//				System.exit(1);
//				break;
//			}
//			case 1: {
//				System.out.println("Sucessfully created new order!");
//				flag = true;
//				break;
//			}
//			case 2: {
//				if (!flag) {
//					System.out.println("Please create a new order first!");
//					break;
//				}
//				int m = 0;
//				do {
//					System.out.println("Please choose media format:");
//					System.out.println("1. Book");
//					System.out.println("2. DVD");
//					System.out.println("3. CD");
//					m = scanner.nextInt();
//					scanner.nextLine();
//				} while (m > 0 && m < 4 );
//				
//				System.out.println("Enter title: ");
//				String title = scanner.nextLine();
//				System.out.println("Enter category: ");
//				String category = scanner.nextLine();
//				System.out.println("Enter cost:");
//				float cost = scanner.nextFloat();
//				scanner.nextLine();
//				if (m == 1) {
//					System.out.println("Enter author's name:");
//					List<String> authors = new ArrayList<String>();
//					String authorName = scanner.nextLine();
//					authors.add(authorName);
//					Book book = new Book(title, category, cost, authors);
//					order.addMedia(book);
//				} else if (m == 2 || m == 3) {
//					if (m == 2) {
//						System.out.println("Enter director:");
//						String director = scanner.nextLine();
//						System.out.println("Enter length:");
//						int lenth = scanner.nextInt();
//						scanner.nextLine();
//						DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost, lenth, director);
//						order.addMedia(dvd);
//					} else {
//						CompactDisc cd = new CompactDisc();
//						order.addMedia(cd);
//					}
//					System.out.println("Do you want to play the cd/dvd?(y/n)");
//					String answer;
//					do {
//						answer = scanner.nextLine();
//						if (answer.equals("y")) {
//							
//						}
//					} while(answer.toLowerCase() != "y" || answer.toLowerCase() != "n");
//				}
//				showMenu();
//				break;
//			}
//			case 3: {
//				if (!flag) {
//					System.out.println("Please create a new order first!");
//					break;
//				}
//				System.out.print("Enter title: ");
//				String title = scanner.nextLine();
//				if (order.searchMedia(title) != null) {
//					order.removeMedia(order.searchMedia(title));
//					System.out.println("Sucessfully deleted " + title);
//				} else {
//					System.out.println("Item not found!");
//				}
//				showMenu();
//				break;
//			}
//			case 4: {
//				if (!flag) {
//					System.out.println("Please create a new order first!");
//					break;
//				}
//				order.print();
//				showMenu();
//				break;
//			}
//			default:
//				System.out.println("Invalid input! Please choose a number: 0-1-2-3-4");
//				showMenu();
//			}
//		} while (c != 0);
//		scanner.close();
		
		
	}
	
}
