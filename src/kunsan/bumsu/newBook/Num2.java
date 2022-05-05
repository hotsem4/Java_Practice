package kunsan.bumsu.newBook;

import java.util.ArrayList;

public class Num2 {
	public void BookList(ArrayList<Book> bookArr) {
		for (int i = 0; i < bookArr.size(); i++) {
			bookArr.get(i).BookList();
			
		}
		System.out.println("\n");
	}
}
