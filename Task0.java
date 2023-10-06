import java.util.Scanner;
public class Task0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter list items");
		for (int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		int m = 0;
		for (int j = 0; j < n; j++){
			if (array[j] > m) {
				m = array[j];
			}
		}
		System.out.println("Max of the list = " + m);
	}
}