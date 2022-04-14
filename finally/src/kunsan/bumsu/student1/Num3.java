package kunsan.bumsu.student1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Num3 {
	public void search(int[] arr1) {
		int stop = 0;
		System.out.println("*****학생 성적 검색*****\n");
		System.out.println("검색할 학생의 번호를 입력하세요 : ");
		
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				int student_number = scanner.nextInt();
				if (student_number == 0) {
					while(student_number == 0) {
						System.out.println("0번 학생은 존재하지 않습니다.\n다시 입력해주십시오.");
						Scanner scanner1 = new Scanner(System.in);
						student_number = scanner1.nextInt();
					}
				}
				System.out.println(student_number + "번 학생의 성적은 "+ arr1[student_number]);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("학생 수를 다시 확인하고 값을 입력해주세요.");
			}
		}
	}
}
