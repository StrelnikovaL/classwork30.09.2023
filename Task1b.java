import  java.util.Scanner;
public class Task1b {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter list items");
		for (int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be found");
		int x = sc.nextInt();
		boolean found = false;
		int number = 0;
		for (int i = 0; i < n; i++){
			if (array[i] == x) {
				found = true;
				number = i;
			}
		}
		if (found == true) {
			System.out.println(x + " was found under number " + (number + 1));
		} else {
			System.out.println(x + " was not found");
		}
	}
}