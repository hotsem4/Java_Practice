package kunsan.bumsu.mdtest;

public class Student {
	String index;
	public int korean;
	public int math;
	public int english;
	
	public Student(String index, int korean, int math, int english) {
		this.index = index;
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	public void showInfo() {
		System.out.println(this.index + "\t" + this.korean + "\t" + this.english + "\t" + this.math);
	}
}
// �ϴ� �츮�� int[]���� �� �ѹ�
// ��ü�϶� �ѹ� �ؼ� �� ���� ���� �����ϵ��� �Ѵ�.
// ��� �����̴� ��ü�� ��������� �ϴ� �κп��� ������ �ְ�