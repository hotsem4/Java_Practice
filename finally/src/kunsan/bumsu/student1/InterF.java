package kunsan.bumsu.student1;

import kunsan.bumsu.lecture04.*;
import kunsan.bumsu.lecture05.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterF{
	public void inter() {
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
		int input = -10;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� : ");
		try {
			input = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("�Է� ���� �ٽ� Ȯ�����ּ���.");
		}
		return input;
	}
	
	public static void main(String[] args) {
		InterF aManF = new InterF(); 
		aManF.inter();
		int number = aManF.select();
		
	}
}
