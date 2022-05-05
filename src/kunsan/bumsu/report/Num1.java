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
		System.out.print("ó���� Book�� ���� �Է��Ͻÿ� : ");
		int books = 0;
		try {
			Scanner sc = new Scanner(System.in);
			books = sc.nextInt();
			System.out.println("����, ����, ���� ������ �Է��Ͻÿ�.\n");
		}
		catch(InputMismatchException e) {
			System.out.println("�Է��� ���� �������� Ȯ���Ͻÿ�.\n");
			bookArr.add(null);
		}
		
		for(int i = 1; i <= books; i++) {
			System.out.print(i+"�� å-> ");
			try {
				Scanner sc1 = new Scanner(System.in);
				title = sc1.next(); author = sc1.next(); price = sc1.nextInt();
				Book book1 = new Book(i ,title, author, price);
				bookArr.add(book1);
			}
			catch(InputMismatchException e) {
				System.out.println("<Error>\n1) å ���� ���Ⱑ �ִ��� Ȯ���Ͻÿ�.\n2) ���� �� �Է��Ͽ����� Ȯ���Ͻÿ�.");
				i--;
			}
		}
		return bookArr;
	}
}