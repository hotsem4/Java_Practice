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
// 일단 살리고 int[]형일 때 한번
// 객체일때 한번 해서 더 빠른 쪽을 선택하도록 한다.
// 어느 방향이던 객체를 생성해줘야 하는 부분에서 막히고 있고