import java.util.Scanner;
public class MatrixAdder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Matrix m x n");
		System.out.println("Insert m :");
		int m = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Insert n :");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		int[][] a = new int[m][];
		for (int i = 0; i < m; i++) {
			a[i] = new int[n];
		}
		int[][] b = new int[m][];
		for (int i = 0; i < m; i++) {
			b[i] = new int[n];
		}
		int[][] c = new int[m][];
		for (int i = 0; i < m; i++) {
			c[i] = new int[n];
		}
		
		System.out.println("Insert elemnts :");
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("A[" + i + "][" + j + "]");
				a[i][j] = scanner.nextInt();
				scanner.nextLine();
			}
		}
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("B[" + i + "][" + j + "]");
				b[i][j] = scanner.nextInt();
				scanner.nextLine();
			}
		}
		
		System.out.println("A = ");
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("B = ");
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Solution : C = A + B");
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
		scanner.close();
	}

}
