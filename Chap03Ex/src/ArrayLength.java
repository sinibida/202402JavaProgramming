import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		double iArray[] = new double[3]; // 배열의 선언과 생성
		double sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.print(iArray.length + "개의 실수를 입력하세요>> ");
		for(int i=0; i<iArray.length; i++)
			iArray[i] = sc.nextDouble(); // 키보드에서 입력받은 정수 저장
		
		for(int i=0; i<iArray.length; i++)
			sum += iArray[i]; // 배열에 저장된 정수 값을 더하기

		System.out.print("평균은 " + (double)sum/iArray.length);
		sc.close();
	}
}