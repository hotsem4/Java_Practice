package kunsan.bumsu.mdtest;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	
	static int[][] arrM = null;
	
	
	public void interF() {
		System.out.println("<����ó�� ���α׷�>");
		System.out.println("1. ���� �Է��ϱ�");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� �����ϱ�");
		System.out.println("4. ��� ���� ����");
		System.out.println("5. �ְ�/���� ���� ����");
		System.out.println("0. ���θ޴� ���ư���");
	}
	public int select() {

		System.out.print("���� > ");
		int number = -10;
		try {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���.");
		}
		return number;
	}
	public int[][] arrMemberGrade(){
		int[][] arrM;
		Num1 arrMember = new Num1();
		arrM = arrMember.lastNum1();
		return arrM;
	}
	
	public void sw(int number, int[][] arrM) {
		try {
			switch(number) {
				case 2:
					Num2 num2 = new Num2();
					num2.lookGrade(arrM);
					break;
				case 0:
					break;
			}
		}
		catch(NullPointerException e) {
			System.out.println("������ �Է����� �ʾҽ��ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		int stop = 0;
		Main aMan = new Main();
		while(stop == 0) {
			aMan.interF();
			int number = aMan.select();
			if (number == 1) arrM = aMan.arrMemberGrade();
			else if(number == 0) stop = 1;
			aMan.sw(number, arrM);
			System.out.println("\n");
			
			
			
		}
	}
	
}
// arrM�� main�� fix��Ű�� ����ϱ�