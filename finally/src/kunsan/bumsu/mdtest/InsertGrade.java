package kunsan.bumsu.mdtest;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class InsertGrade {
	public int member() {
		System.out.print("���� �Է� �� �� > ");
		int number = 0;
		try {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���");
		}
		return number;
	}
	
	public void grades(int number) {
		
		int[][] memberGrade = new int[5][number+1];		// �л��� �迭 ����
		
		for(int i = 0; i < number + 1; i++) {
			for (int j = 0; j < 4; j++) {
				memberGrade[i][j] = 0;
				System.out.print(memberGrade[i][j]);
			}
			System.out.print("\n");
			
		}
		
	}
	
	public static void main(String[] args) {
		InsertGrade aMan = new InsertGrade();
		
		aMan.grades(aMan.member());
	}
}