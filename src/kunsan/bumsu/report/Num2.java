package kunsan.bumsu.report;

import java.util.ArrayList;

public class Num2 {
	public void listBook(ArrayList<Book> bookArr) {
		System.out.println("전체 Book 리스트 보기");
		for (int i = 0; i < bookArr.size(); i++) {
			bookArr.get(i).showList();
		}
	}
}