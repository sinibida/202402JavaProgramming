import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		double iArray[] = new double[3]; // �迭�� ����� ����
		double sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.print(iArray.length + "���� �Ǽ��� �Է��ϼ���>> ");
		for(int i=0; i<iArray.length; i++)
			iArray[i] = sc.nextDouble(); // Ű���忡�� �Է¹��� ���� ����
		
		for(int i=0; i<iArray.length; i++)
			sum += iArray[i]; // �迭�� ����� ���� ���� ���ϱ�

		System.out.print("����� " + (double)sum/iArray.length);
		sc.close();
	}
}