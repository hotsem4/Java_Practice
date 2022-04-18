package kunsan.bumsu.mdtest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num1 {
	// ���⼭�� �Է� ����� �Է��ϸ� �׿� �´� ũ���� 2���� �迭�� �����Ͽ� �� �ȿ� 
	// math = scanner.nextInt();
	// kor =scanner.nextInt();
	// eng = scanner.nextInt();
	
	/*
	 * 1. �л����� ���� �Է� �޴´�.
	 * 2. �Է� ��� ���� ���� 2���� �迭�� �����Ѵ�.
	 * 3. ���� �Է��ϸ� idx�� �̿��� �迭�� ���� �����Ѵ�.
	 * 4. �׸��� 2���� �迭�� �����Ѵ�!
	 */
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	public int insertMember() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("���� �Է� ��� > ");
		try {
			number = sc.nextInt();        // �л� ���� �Է¹޴´�.
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
		}
		return number;
	}
	
	public int[][] arrMember(int number){  // �л����� ������ �Է��ϴ� method
		int[][] arrM = new int[number][4];
		for (int i =0; i< number; i++) {
			System.out.print(i+"��° �л��� ���� : ");
			try {
				Scanner sc = new Scanner(System.in);
				kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
				while (kor > 100 || eng > 100 || math > 100) {
					System.out.println("���� 100���� ���� �� �����ϴ�.");
					System.out.print(i+"��° �л��� ���� : ");
					kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
				}
				arrM[i][0] = i; arrM[i][1] = kor; arrM[i][2] = eng; arrM[i][3] = math;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���"); i--;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("������ �Է����ּ���."); i--;
			}
		}
		return arrM;
	}
	public int[][] lastNum1(){		// �� method�� Main���� �ѹ��� ����ϱ� ���� ���� method
		Num1 num1 = new Num1();
		int number = num1.insertMember();
		int[][] arrM = num1.arrMember(number);
		return arrM;
	}
}