package kunsan.bumsu.student1;
import java.lang.Math.*;

public class Num5 {
	public void averLow(int[] sortedArrayNum5) {
		float sum = 0;
		for (int add : sortedArrayNum5) {
			sum = sum + add;
		}
		System.out.println("평균 점수 : " + sum/(sortedArrayNum5.length-1));
		if ((sortedArrayNum5.length % 2) == 0) {		// 학생 수가 홀수 명일 경우
			System.out.println("중위값 : " + sortedArrayNum5[sortedArrayNum5.length/2]);
		}
		else {		// 학생 수가 짝수 일 경우 (두 값의 합 / 2) 를 중위값이라 한다.
			float dot = sortedArrayNum5.length;		//length는 int형만을 받는다.
			int high = Math.round(dot/2);
			int low = high-1;
			float median = sortedArrayNum5[high] + sortedArrayNum5[low];	//.5가 존재하기 때문에 float로 해야한다.
			System.out.println("중위값 : " + median/2);
		}
	}
}
