public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},	// 1학년 1, 2학기 평점
							{3.5, 3.6},	// 2학년 1, 2학기 평점
							{3.7, 4.0},	// 3학년 1, 2학기 평점
							{4.1, 4.2} };	// 4학년 1, 2학기 평점
		double sum=0;
		for(int year=0; year<2; year++) // 각 학년별로 반복
			for(int term=0; term<1; term++) // 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점 합

		
		int n=/*score.length*/2; // 배열의 행 개수, 4
		int m=/*score[0].length*/1; // 배열의 열 개수, 2
		System.out.println("2년, 1학기 평점 평균은 " + sum/(n*m));
	}
}