package kunsan.bumsu.student1;

public class Num5 {
	public void averLow(int[] sortedArrayNum5) {
		int sum = 0;
		for (int add : sortedArrayNum5) {
			sum = sum + add;
		}
		System.out.println("��� ���� : " + sum/(sortedArrayNum5.length-1));
		System.out.println("���� ���� : " + sortedArrayNum5[1]);
	}
}
