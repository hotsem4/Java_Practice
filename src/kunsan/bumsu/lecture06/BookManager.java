package kunsan.bumsu.lecture06;

import java.util.Scanner;

public class BookManager {
	Book[] getBooks(int n) {
		Book[] books = new Book[n];  // Book 배열 선언
		
		Scanner sc = new Scanner(System.in);
		for  (int i = 0; i < books.length; i++) {
			System.out.print("제목 > ");
			String title = sc.nextLine();
			System.out.print("저자 > ");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
			// 배열 원소 객체 생성
		}
		sc.close();
		return books;
	}
	public void printBooks(Book[] books) {
		for(int i = 0; i< books.length; i++) {
			System.out.println(i+1 + "번 ->" + "(" + books[i].getTitle() + "," + books[i].getAuthor() + ")");
		}
	}
	public static void main(String[] args) {
		BookManager aMan = new BookManager();
		Scanner sc = new Scanner(System.in);
		System.out.print("책의 권수를 입력하시요 : ");
		int n = sc.nextInt();
		Book[] books = aMan.getBooks(n);
		aMan.printBooks(books);
	}
}