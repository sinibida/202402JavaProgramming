import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		String school;
		String name;
		int sid;
		
		var scanner = new Scanner(System.in);

		System.out.print("너의 학교는? ");
		school = scanner.next();
		
		System.out.print("너의 학번은? ");
		sid = scanner.nextInt();
		
		System.out.print("너의 이름은? ");
		name = scanner.next();
		
		System.out.println("당신은 " + school + " 학생 " + name + " " + sid + " 입니다.");
		
		scanner.close();
	}

}
