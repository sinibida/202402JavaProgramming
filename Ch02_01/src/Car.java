import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // String 단어 받기
		
		System.out.println(name);
		
		scanner.close();
	}

}
