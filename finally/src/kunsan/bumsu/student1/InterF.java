package kunsan.bumsu.student1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InterF{
	
	static int[] arr1 = null;		// �迭 arr1�� ���ϰ� ���� ���� ���������� ����
	
	
	public void inter() {
		System.out.println("\n\n<�л� ���� ó�� ���α׷�>");
		System.out.println("1) �л� ���� �Է�");
		System.out.println("2) �л� ��ü ���� ����Ʈ ����");
		System.out.println("3) �л��� ��ȣ�� ���� ����");
		System.out.println("4) ���� �ְ� ����, ���� ���� ����");
		System.out.println("5) ���� ��� ����, ������ ���� ����");
		System.out.println("6) ���� �����ؼ� ����");
		System.out.println("0) ���� �޴��� ���ư�(����)");
	}
	
	public int select() {
		int input = -10;
		
		System.out.print("�Է� : ");
		try {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			if(input > 6) {
				while(input > 6) {
					System.out.println("�Է��� ���� �ùٸ��� �ʽ��ϴ�.\n�ٽ� �Է����ּ���.");
					Scanner scanner1 = new Scanner(System.in);
					input = scanner1.nextInt();
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("�Է� ���� �ٽ� Ȯ�����ּ���.");
		}
		return input;
	}
	
	public int[] practiceNum1(){		// �л��� ���� �Է� method
		Num1 num1 = new Num1();
		int[] arr;
		arr = num1.select1();
		return arr;
	}
	
	public int[] practice(int input, int[] arr1) {
		try {
			switch (input) {
				case 2:
					Num2 num2 = new Num2();
					num2.List(arr1);
					break;
				case 3:
					Num3 num3 = new Num3();
					num3.search(arr1);
					break;
				case 4:
					Num4 num4 = new Num4();
					int[] sortedArr= null;
					sortedArr = num4.sort(arr1);
					num4.high_low(sortedArr);
					break;
				case 5:
					Num4 num5 = new Num4();
					int[] sortedArrNum5 = null;
					sortedArrNum5 = num5.sort(arr1);
					Num5 aver = new Num5();
					aver.averLow(sortedArrNum5);
					break;
				case 6:
					Num4 num6 = new Num4();
					int[] sortedArrNum6 = null;
					sortedArrNum6 = num6.sort(arr1);
					Num6 sortList = new Num6();
					sortList.sort(sortedArrNum6);
					break;
				
				case 0:
					break;		// ���⸦ �� ���θ޴��� ����������
			}
		}
		catch(NullPointerException e) {
			System.out.println("�л��� ������ �Է����� �ʾҽ��ϴ�.");
		}
		
		return null;
	}
	
	public void mainCopy() {
		InterF aManF = new InterF(); 
		int stop = 0;
		while(stop == 0) {
			aManF.inter();
			int number = aManF.select();
			
			if (number == 1) {
				arr1 = aManF.practiceNum1();
			}
			else {
				if (number == 0) {
					stop = 1;
				}
				aManF.practice(number, arr1);
			}
		}
	}
}
