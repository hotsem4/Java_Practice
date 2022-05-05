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
		System.out.print("ó���� Book�� ���� �Է��ϼ��� : ");
		
		try {
			Scanner sc1 = new Scanner(System.in);
			books = sc1.nextInt();
			System.out.println("            �̸�    ����    ����");
		}
		catch(InputMismatchException e) {
			System.out.println("�߸��� ���� ���Է��ϼ̽��ϴ�.\n");
		}
		
		
		for (int i = 1; i <= books; i++) {
			System.out.print(i+"�� Book -> ");
			try {
				Scanner sc11 = new Scanner(System.in);
				title = sc11.next(); author = sc11.next(); price = sc11.nextInt();
				Book book = new Book(i,title,author,price);
				bookArr.add(book);
			}
			catch(InputMismatchException e) {
				System.out.println("�ݾ��� �ٽ� Ȯ�����ּ���.");
				i--;
			}
			
			
		}
		return bookArr;
	}
}
