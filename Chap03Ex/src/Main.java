import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[3]; // 배열 생성
		int min=Integer.MAX_VALUE; 		// 현재 가장 큰 수
		System.out.println("양수 3개를 입력하세요.");		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
			if(intArray[i] <min) // intArray[i]가 현재 가장 큰 수보다 크면
				min = intArray[i]; // intArray[i]를 min로 변경
		}
		System.out.print("가장 작은 수는 " + min + "입니다.");
		
		scanner.close();
	}
}