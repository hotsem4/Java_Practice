package kunsan.bumsu.student1;
import java.lang.Math.*;

public class Num5 {
	public void averLow(int[] sortedArrayNum5) {
		float sum = 0;
		for (int add : sortedArrayNum5) {
			sum = sum + add;
		}
		System.out.println("��� ���� : " + sum/(sortedArrayNum5.length-1));
		if ((sortedArrayNum5.length % 2) == 0) {		// �л� ���� Ȧ�� ���� ���
			System.out.println("������ : " + sortedArrayNum5[sortedArrayNum5.length/2]);
		}
		else {		// �л� ���� ¦�� �� ��� (�� ���� �� / 2) �� �������̶� �Ѵ�.
			float dot = sortedArrayNum5.length;		//length�� int������ �޴´�.
			int high = Math.round(dot/2);
			int low = high-1;
			float median = sortedArrayNum5[high] + sortedArrayNum5[low];	//.5�� �����ϱ� ������ float�� �ؾ��Ѵ�.
			System.out.println("������ : " + median/2);
		}
	}
}
