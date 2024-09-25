import java.util.Scanner;

public class Car {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int a, b;
		var scanner = new Scanner(System.in);

		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(add(a, b));
		
		scanner.close();
	}

}
