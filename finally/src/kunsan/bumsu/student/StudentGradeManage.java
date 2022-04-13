package kunsan.bumsu.student;

import kunsan.bumsu.lecture04.*;
import kunsan.bumsu.lecture05.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeManage {
	
	
	
	public void interF() {
		System.out.println("<�л� ���� ó�� ���α׷�>");
		System.out.println("1) �л� ���� �Է�");
		System.out.println("2) �л� ��ü ���� ����Ʈ ����");
		System.out.println("3) �л��� ��ȣ�� ���� ����");
		System.out.println("4) ���� �ְ� ����, ���� ���� ����");
		System.out.println("5) ���� ��� ����, ������ ���� ����");
		System.out.println("6) ���� �����ؼ� ����");
		System.out.println("0) ���� �޴��� ���ư�(����)");
	}
	
	public int select() {
		int Number = 0;
		
		System.out.print("���� : ");
		try {
			Scanner scanner = new Scanner(System.in);
			Number = scanner.nextInt();
			
		}
		catch(InputMismatchException e){
			System.out.println("������ �Է����ּ���");
		}
		
		return Number;
	}
	
	public int[] situation(int Number) {
		switch(Number) {
			case 1:
				StudentGradeManage Num1 = new StudentGradeManage();
				int[] arrPeople = Num1.num1();
				return arrPeople;
			case 0:
				break;
		}
		return null;
	}
	
	// �迭 ����***********************************
	public int[] num1() {
		int howManyPeople = 0;
		System.out.println("ó���� �л� ���� �Է��ϼ���(�ִ�100��) : ");
		Scanner scanner = new Scanner(System.in);
		howManyPeople = scanner.nextInt();
		int[] people;				// �л����� ������ ������ �迭 ����
		people = new int[howManyPeople+1];
		for (int i = 1; i < people.length; i++) {
			System.out.print(i + "�� �л� ���� : ");
			int grade = scanner.nextInt();
			if (grade > 100) {
				System.out.println("������ �ְ����� 100���Դϴ�.\n�Է��Ͻ� ������ �ٽ� Ȯ�����ּ���.");
				System.out.print(i + "�� �л� ���� : ");
				grade = scanner.nextInt();
			}
			people[i] = grade;
		}
		System.out.print("\n");
		return people;
	}
	
	public void gradeList(int[] people) {
		for (int i = 1; i<people.length; i++) {		// �迭�� �� ���� �Ǿ����� Ȯ���ϱ� ���� print��
			System.out.print(people[i]+"\t");
		}
	}
	//******************************************
	
	
	
	public static void main(String[] args) {
		StudentGradeManage aMan = new StudentGradeManage();
		int stop = 0;
		while(stop == 0) {
			aMan.interF();
			int Number = aMan.select();
			if (Number == 1) {
				int[] test = aMan.situation(Number);
				for (int i = 1; i<test.length; i++) {		// �迭�� �� ���� �Ǿ����� Ȯ���ϱ� ���� print��
					System.out.print(test[i]+"\t");
				}
			}
			System.out.println(test[1]);
			
			System.out.println("");
			
		}
		
	}
}

