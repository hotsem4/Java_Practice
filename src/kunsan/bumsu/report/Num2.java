package kunsan.bumsu.report;

import java.util.ArrayList;

public class Num2 {
	public void listBook(ArrayList<Book> bookArr) {
		System.out.println("��ü Book ����Ʈ ����");
		for (int i = 0; i < bookArr.size(); i++) {
			bookArr.get(i).showList();
		}
	}
}