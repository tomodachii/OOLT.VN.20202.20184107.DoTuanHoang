import java.util.Scanner;
public class SortSumAverageOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert number of elements : ");
		int n = scanner.nextInt();
		scanner.nextLine();
		double[] array = new double[n];
		
		System.out.println("Insert elements:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[i]) {
					double temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		double sum = 0, avg = 0;
		
		System.out.print("Sorted array :");
		for (int i = 0; i < n - 1; i++) {
			sum += array[i];
			System.out.print(array[i] + ", ");
		}
		avg = sum / n;
		System.out.println(array[n - 1]);
		
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + avg);
		
		scanner.close();
	}

}
