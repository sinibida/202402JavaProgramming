
public class Hello {
	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static double avg(int n, int m) {
		return sum(n, m) / 2.0;
	}
	
	public static void main(String[] args) {
		System.out.println("장준하");
		
		System.out.println("당신은 컴퓨터 공학과 학생인가요?");
		
		System.out.println("저는 컴공과 학생입니다.");
		
		int a = 20;
		
		System.out.println(a);
		
		int s;
		s = sum(a, 10);
		System.out.println(s);
		
		double d;
		d = avg(a, 45);
		System.out.println(d);
		
		int ss = 0;
		for (int i = 1; i <= 10; i++) {
			ss += i;
		}
		System.out.println(ss);
	}
}
