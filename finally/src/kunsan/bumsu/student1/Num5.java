package kunsan.bumsu.student1;

public class Num5 {
	public void averLow(int[] sortedArrayNum5) {
		int sum = 0;
		for (int add : sortedArrayNum5) {
			sum = sum + add;
		}
		System.out.println("평균 점수 : " + sum/(sortedArrayNum5.length-1));
		System.out.println("최저 점수 : " + sortedArrayNum5[1]);
	}
}
