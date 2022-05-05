package kunsan.bumsu.student1;

public class Num2 {

	public void List(int[] arr1) {
		System.out.println("전체 학생성적 리스트 보기\n");
		for (int i = 1; i <  arr1.length; i++) {
			System.out.println(i + "번 학생 : "+ arr1[i]);
		}
	}
}
