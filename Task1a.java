import java.util.Scanner ;
public class Task1a {
	public static int binarySearch(int[] array, int x){
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == x){
				return mid;
			} else if  (array[mid] < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter list items");
		int [] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be found");
		int x = sc.nextInt(); 
		int result = binarySearch(array, x);
		if (result == -1){
			System.out.println(x + " was not found");
		} else {
			System.out.println(x + " was found under number " + (result + 1) );
		}
	}
}