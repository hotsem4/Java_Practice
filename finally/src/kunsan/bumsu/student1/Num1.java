package kunsan.bumsu.student1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num1{
	int[] student;								//�л����� ������ student�迭�� ����
	Scanner scanner = new Scanner(System.in);
	
	public int[] select1() {
		System.out.println("ó���� �л��� ���� �Է��ϼ���(�ִ� 100��) : ");		//�迭�� ũ�⸦ �󸶳� �Ҵ����� ���ϴ� �κ�
		try {
			int studentNumber = scanner.nextInt();							
			student = new int[studentNumber+1];
		}
		catch(InputMismatchException e) {
			System.out.print("������ �Է����ּ���");
		}
		// The bottom line is the part for entering a student's grade.
		for (int i = 1; i < student.length; i++) {
			System.out.print(i + "�� �л� ���� : ");
			int grade;
			try {
				Scanner scanner = new Scanner(System.in);
				grade = scanner.nextInt();
				if (grade > 100) {
					while(grade > 100) {
						System.out.println("������ �ٽ� �Է����ּ���.");
						grade = scanner.nextInt();
					}
				}
				student[i] = grade;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				i--;
			}
		}
		return student;
	}
}