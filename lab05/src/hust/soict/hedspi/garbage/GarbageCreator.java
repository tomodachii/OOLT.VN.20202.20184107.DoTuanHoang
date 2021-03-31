package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
//    	String s = null;
        StringBuffer s = new StringBuffer();
        try {
            File f = new File("D:/Java/OOLT.VN.20202.20184107.DoTuanHoang/lab05/src/hust/soict/hedspi/garbage/garbage.txt");
            Scanner text = new Scanner(f);
            while (text.hasNextLine()) {
            	System.out.println(text);
//            	s += text.nextLine();
                s.append(text.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
