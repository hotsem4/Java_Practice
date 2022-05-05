package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Num7 {
	public void search(ArrayList <Book> bookArr) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("책의 제목을 입력하세요 : ");
		name = scanner.next();
		for (int i = 0; i < bookArr.size(); i++) {
			if (name.equals(bookArr.get(i).getTitle())) {
				System.out.println(bookArr.get(i).getId()+ "   " + bookArr.get(i).getTitle()+ "    " + bookArr.get(i).getAuthor()+ "   " + bookArr.get(i).getPrice());
				break;
			}
			else {
				if(i == bookArr.size()-1) {
					System.out.println("입력한 책이 존재하지 않습니다.");
				}
			}
		}
	}
}
