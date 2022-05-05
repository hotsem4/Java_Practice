package kunsan.bumsu.report;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManager {
	
	static ArrayList<Book> bookArr = null;
	
	public void interF() {
		System.out.println("<Ŭ���� ��� Book ���� ���α׷�>\n\n1) Book �Է�\n2) Book ��ü ����Ʈ ����\n3) Book ��ȣ�� ���� \n4) �ְ� ����, ���� ���� ���� \n5) ��� ����, ���� ���� ����\n6) ���� �� �����ؼ� ����\n7) �������� �˻�\n0) ���� �޴��� ���ư�(����)");
	}
	
	public int select() {
		System.out.print("�Է�: ");
		
		int number = -1;
		try {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼ���");
		}
		return number;
	}
	
	public ArrayList<Book> arrBookList(){
		
		Num1 num1 = new Num1();
		ArrayList<Book> bookArr = num1.insertBook();
		return bookArr;
	}
	
	public void switchFun(int num) {
		try {
			switch(num) {
				case 2:
					Num2 num2 = new Num2();
					num2.listBook(bookArr);
					break;
				case 3:
					Num3 num3 = new Num3();
					num3.search(bookArr);
					break;
				case 4:
					Num4 num4 = new Num4();
					int[] arr = num4.highLow(bookArr);
					num4.enterArr(arr);
					break;
				case 5:
					Num5 num5 = new Num5();
					num5.aver(bookArr);
					break;
				case 6:
					Num6 num6 = new Num6();
					String[] title = num6.titleSort(bookArr);
					num6.num6Print(title, bookArr);
					break;
				case 7:
					Num7 num7 = new Num7();
					num7.callTitle(bookArr);
					break;
			}
		}
		catch(NullPointerException e) {
			System.out.println("å ����� �Է����ּ���.");
		}
		
	}
	
	public void exe() {
		BookManager aManBook = new BookManager();
		int stop = 0;
		while(stop == 0) {
			aManBook.interF();
			int num = aManBook.select();
			if (num == 1) bookArr = aManBook.arrBookList();
			else if (num == 0) break;
			aManBook.switchFun(num);
		}
	}
		
		
	public static void main(String[] args) {
		BookManager aManBook = new BookManager();
		int stop = 0;
		while(stop == 0) {
			aManBook.interF();
			int num = aManBook.select();
			if (num == 1) bookArr = aManBook.arrBookList();
			else if (num == 0) break;
			aManBook.switchFun(num);
		}
	}
}