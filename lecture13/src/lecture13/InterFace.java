package lecture13;

import java.util.Scanner;

public class InterFace {
	public void interF() {
		System.out.println("1. �ű� ȸ�� ����");
		System.out.println("2. ȸ�� ���� ���� \n  1) pass ����\n  2) �̸� ����");
		System.out.println("3. ȸ�� ����");
		System.out.println("4. ȸ�� ���� ����");
		System.out.println("5. ���� ȭ������");
	}
	
	public int selectNum() {
		int number = -1;
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		return number;
	}
	
	public static void main(String[] args) {
		InterFace iF = new InterFace();
		iF.interF();
		iF.selectNum();
	}
}
