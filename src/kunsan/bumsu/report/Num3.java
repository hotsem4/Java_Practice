package kunsan.bumsu.report;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Num3 {
	public void search(ArrayList<Book> bookArr) {
		System.out.print("�˻��� å ��ȣ�� �Է��Ͻÿ�.");
		int num1 = 0;
		try {
			Scanner sc = new Scanner(System.in);
			num1 = sc.nextInt();
			while (num1 > bookArr.size()) {
				Scanner sc1 = new Scanner(System.in);
				num1 = sc1.nextInt();
			}
			int num = num1-1;
			System.out.println(num1 +" -> "+ bookArr.get(num).getTitle()+"    "+ bookArr.get(num).getAuthor()+"    "+ bookArr.get(num).getPrice());
		}
		catch(InputMismatchException e) {
			System.out.println("���� �ٽ� �Է����ּ���.");
		}
	}
}