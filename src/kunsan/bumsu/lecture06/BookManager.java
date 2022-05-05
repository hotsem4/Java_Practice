package kunsan.bumsu.lecture06;

import java.util.Scanner;

public class BookManager {
	Book[] getBooks(int n) {
		Book[] books = new Book[n];  // Book �迭 ����
		
		Scanner sc = new Scanner(System.in);
		for  (int i = 0; i < books.length; i++) {
			System.out.print("���� > ");
			String title = sc.nextLine();
			System.out.print("���� > ");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
			// �迭 ���� ��ü ����
		}
		sc.close();
		return books;
	}
	public void printBooks(Book[] books) {
		for(int i = 0; i< books.length; i++) {
			System.out.println(i+1 + "�� ->" + "(" + books[i].getTitle() + "," + books[i].getAuthor() + ")");
		}
	}
	public static void main(String[] args) {
		BookManager aMan = new BookManager();
		Scanner sc = new Scanner(System.in);
		System.out.print("å�� �Ǽ��� �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		Book[] books = aMan.getBooks(n);
		aMan.printBooks(books);
	}
}