package kunsan.bumsu.report;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Num7 {
	public void callTitle(ArrayList<Book> bookArr) {
		Scanner sc = new Scanner(System.in);
		String bookName = null;
		System.out.println("ã�� å�� �Է����ּ��� : ");
		bookName = sc.next();
		for (int i = 0; i < bookArr.size(); i++) {
			if (bookName.equals(bookArr.get(i).getTitle())) {
				System.out.println(bookArr.get(i).getId() +"   " + bookArr.get(i).getTitle() +"   " + bookArr.get(i).getAuthor() +"   " + bookArr.get(i).getPrice());
				break;
			}
			else {
				if (i == bookArr.size()-1) {
					System.out.println("�Է��� å�� �����ϴ�.");
				}
			}
		}
	}
}
// �̷��� ���� ���� arraylist�� �ҷ��ͼ� ���ϸ� �ѹ��� ���� �� �ִ�.

// excption ó�� ���ְ� ���� �� ������