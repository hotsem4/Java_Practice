package kunsan.bumsu.student1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num1{
	int[] student;								//학생들을 저장할 student배열을 생성
	Scanner scanner = new Scanner(System.in);
	
	public int[] select1() {
		System.out.println("처리할 학생의 수를 입력하세요(최대 100점) : ");		//배열의 크기를 얼마나 할당할지 정하는 부분
		try {
			int studentNumber = scanner.nextInt();							
			student = new int[studentNumber+1];
		}
		catch(InputMismatchException e) {
			System.out.print("정수를 입력해주세요");
		}
		// The bottom line is the part for entering a student's grade.
		for (int i = 1; i < student.length; i++) {
			System.out.print(i + "번 학생 성적 : ");
			int grade;
			try {
				Scanner scanner = new Scanner(System.in);
				grade = scanner.nextInt();
				if (grade > 100) {
					while(grade > 100) {
						System.out.println("성적을 다시 입력해주세요.");
						grade = scanner.nextInt();
					}
				}
				student[i] = grade;
			}
			catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				i--;
			}
		}
		return student;
	}
}