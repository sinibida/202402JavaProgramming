import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int number = in.nextInt();
		if (number % 5 == 0)
			System.out.println("5의 배수입니다.");
		else
			System.out.println("5의 배수가 아닙니다.");
		in.close();
	}
}