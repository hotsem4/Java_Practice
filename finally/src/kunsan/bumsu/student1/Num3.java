package kunsan.bumsu.student1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Num3 {
	public void search(int[] arr1) {
		int stop = 0;
		System.out.println("*****�л� ���� �˻�*****\n");
		System.out.println("�˻��� �л��� ��ȣ�� �Է��ϼ��� : ");
		
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				int student_number = scanner.nextInt();
				if (student_number == 0) {
					while(student_number == 0) {
						System.out.println("0�� �л��� �������� �ʽ��ϴ�.\n�ٽ� �Է����ֽʽÿ�.");
						Scanner scanner1 = new Scanner(System.in);
						student_number = scanner1.nextInt();
					}
				}
				System.out.println(student_number + "�� �л��� ������ "+ arr1[student_number]);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�л� ���� �ٽ� Ȯ���ϰ� ���� �Է����ּ���.");
			}
		}
	}
}
