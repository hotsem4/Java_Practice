package kunsan.bumsu.report;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Num1 {
	
	int id;
	String title;
	String author;
	int price;
	
	public ArrayList<Book> insertBook() {
		ArrayList<Book> bookArr = new ArrayList<Book>();
		System.out.print("처리할 Book의 수를 입력하시오 : ");
		int books = 0;
		try {
			Scanner sc = new Scanner(System.in);
			books = sc.nextInt();
			System.out.println("제목, 저자, 가격 순으로 입력하시오.\n");
		}
		catch(InputMismatchException e) {
			System.out.println("입력한 값이 정수인지 확인하시오.\n");
			bookArr.add(null);
		}
		
		for(int i = 1; i <= books; i++) {
			System.out.print(i+"번 책-> ");
			try {
				Scanner sc1 = new Scanner(System.in);
				title = sc1.next(); author = sc1.next(); price = sc1.nextInt();
				Book book1 = new Book(i ,title, author, price);
				bookArr.add(book1);
			}
			catch(InputMismatchException e) {
				System.out.println("<Error>\n1) 책 제목에 띄어쓰기가 있는지 확인하시오.\n2) 값을 잘 입력하였는지 확인하시오.");
				i--;
			}
		}
		return bookArr;
	}
}