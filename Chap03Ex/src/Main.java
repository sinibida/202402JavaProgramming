import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[3]; // �迭 ����
		int min=Integer.MAX_VALUE; 		// ���� ���� ū ��
		System.out.println("��� 3���� �Է��ϼ���.");		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // �Է¹��� ������ �迭�� ����
			if(intArray[i] <min) // intArray[i]�� ���� ���� ū ������ ũ��
				min = intArray[i]; // intArray[i]�� min�� ����
		}
		System.out.print("���� ���� ���� " + min + "�Դϴ�.");
		
		scanner.close();
	}
}