import java.util.Scanner;
public class Task2a {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of coordinates in vectors ");
		int n = sc.nextInt();
		System.out.println("Enter the coordinates of the vector 'a' ");
		int [] arrayA = new int[n];
		for (int i = 0; i < n; i++){
			arrayA[i] = sc.nextInt();
		}
		System.out.println("Enter the coordinates of the vector 'b'");
		int [] arrayB = new int[n];
		for (int i = 0; i < n; i++){
			arrayB[i] = sc.nextInt();
		}
		int s = 0;
		for (int i = 0; i < n; i++){
			s = s + (arrayA[i]*arrayB[i]);
		}
		System.out.println("Scalar product of vectors = " + s);
	}
}