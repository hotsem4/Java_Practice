package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Num3 {
	public void numberSearch(ArrayList<Book> bookArr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾는 책의 ID를 입력해주세요 : ");
		int number = -1;
		number = scanner.nextInt();
		int numberI = number - 1;
		System.out.print(number +"번째 책 ->"+bookArr.get(numberI).getTitle() + "   " + bookArr.get(numberI).getAuthor() + "   " + bookArr.get(numberI).getPrice()+"\n\n");
		
	}
}
