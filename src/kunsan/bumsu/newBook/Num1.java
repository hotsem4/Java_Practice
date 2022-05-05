package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Num1 {
	
	String title;
	String author;
	int price;
	
	public ArrayList<Book> insertBook(){
		int books = -1;
		ArrayList<Book> bookArr = new ArrayList<Book>();
		System.out.print("처리할 Book의 수를 입력하세요 : ");
		
		try {
			Scanner sc1 = new Scanner(System.in);
			books = sc1.nextInt();
			System.out.println("            이름    저자    가격");
		}
		catch(InputMismatchException e) {
			System.out.println("잘못된 값을 ㅌ입력하셨습니다.\n");
		}
		
		
		for (int i = 1; i <= books; i++) {
			System.out.print(i+"번 Book -> ");
			try {
				Scanner sc11 = new Scanner(System.in);
				title = sc11.next(); author = sc11.next(); price = sc11.nextInt();
				Book book = new Book(i,title,author,price);
				bookArr.add(book);
			}
			catch(InputMismatchException e) {
				System.out.println("금액을 다시 확인해주세요.");
				i--;
			}
			
			
		}
		return bookArr;
	}
}
