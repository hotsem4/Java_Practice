package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Num7 {
	public void search(ArrayList <Book> bookArr) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("å�� ������ �Է��ϼ��� : ");
		name = scanner.next();
		for (int i = 0; i < bookArr.size(); i++) {
			if (name.equals(bookArr.get(i).getTitle())) {
				System.out.println(bookArr.get(i).getId()+ "   " + bookArr.get(i).getTitle()+ "    " + bookArr.get(i).getAuthor()+ "   " + bookArr.get(i).getPrice());
				break;
			}
			else {
				if(i == bookArr.size()-1) {
					System.out.println("�Է��� å�� �������� �ʽ��ϴ�.");
				}
			}
		}
	}
}
