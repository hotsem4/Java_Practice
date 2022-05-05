package kunsan.bumsu.newBook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterF {
	static ArrayList<Book> bookArr;

	public void menu() {
		System.out.println("<Ŭ���� ��� Book ���� ���α׷�>");
		System.out.println("1) Book�Է�\n2) Book ��ü ����Ʈ ����\n3) Book ��ȣ�� ����\n4) �ְ� ����, ���� ���� ����\n5) ��� ����, ���� ���� ����\n6) ���� �� �����ؼ� ����\n7) �������� �˻�\n0) ���θ޴��� ���ư�(����)");
	}
	public int select() {
		int number = -1;
		System.out.print("�Է� : ");
		try {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���\n\n");
		}
		
		return number;
	}
	
	public ArrayList<Book> insertBook(int number) {
		Num1 num1 = new Num1();
		bookArr = num1.insertBook();
		return bookArr;
	}
	
	public void sw(int number, ArrayList<Book> bookArr) {
		try {
			switch(number) {
				case 2:
					Num2 num2 = new Num2();
					num2.BookList(bookArr);
					break;
				case 3:
					Num3 num3 = new Num3();
					num3.numberSearch(bookArr);
					break;
				case 4:
					Num4 num4 = new Num4();
					int[] arr1 = num4.arrSort(bookArr);
					num4.highlow(arr1);
					break;
				case 5:
					Num5 num5 = new Num5();
					int[] arr = num5.aver(bookArr);
					num5.medi(arr);
					break;
				case 6:
					Num6 num6 = new Num6();
					String[] titleArr = num6.titleSort(bookArr);
					num6.print(titleArr, bookArr);
					break;
				case 7:
					Num7 num7 = new Num7();
					num7.search(bookArr);
					break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���.\n\n");
		}
	}
	
	public static void main(String[] args) {
		int stop = 0;
		int number = -1;
		while(stop == 0) {
			InterF interf = new InterF();
			interf.menu();
			number = interf.select();
			if (number == 1) {
				bookArr = interf.insertBook(number);
			}
			else if(number == 0) {
				System.out.println("���α׷��� �����մϴ�.\n");
				break;
			}
			else {
				interf.sw(number, bookArr);
			}
		}
	}
}
