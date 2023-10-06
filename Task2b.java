import java.util.Scanner;
public class Task2b {
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
			arrayB[i] = sc.nextInt(); // ввели вектора
		}
		int scalar = 0;
		for (int i = 0; i < n; i++){
			scalar = scalar + (arrayA[i]*arrayB[i]); // нашли скалярное произведение векторов
		}
		int lengthA = 0;
		int lengthB = 0;
		for (int i = 0; i < n; i++){
			lengthA = lengthA + arrayA[i] * arrayA[i];
			lengthB = lengthB + arrayB[i] * arrayB[i];
		}
		double productOfLengths = Math.sqrt(lengthA) * Math.sqrt(lengthB);// нашли произведение длин векторов
		double cosAB = scalar / productOfLengths;
		System.out.println("cosAB = " + cosAB);
		System.out.println("angleAB = " + (180 * Math.acos(cosAB) / Math.PI) + " degrees");
	}
}