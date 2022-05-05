package kunsan.bumsu.report;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Num7 {
	public void callTitle(ArrayList<Book> bookArr) {
		Scanner sc = new Scanner(System.in);
		String bookName = null;
		System.out.println("찾을 책을 입력해주세요 : ");
		bookName = sc.next();
		for (int i = 0; i < bookArr.size(); i++) {
			if (bookName.equals(bookArr.get(i).getTitle())) {
				System.out.println(bookArr.get(i).getId() +"   " + bookArr.get(i).getTitle() +"   " + bookArr.get(i).getAuthor() +"   " + bookArr.get(i).getPrice());
				break;
			}
			else {
				if (i == bookArr.size()-1) {
					System.out.println("입력한 책이 없습니다.");
				}
			}
		}
	}
}
// 이렇게 하지 말고 arraylist를 불러와서 비교하면 한번에 끝낼 수 있다.

// excption 처리 해주고 조금 더 수정하