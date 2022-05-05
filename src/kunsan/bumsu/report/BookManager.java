package kunsan.bumsu.report;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookManager {
	
	static ArrayList<Book> bookArr = null;
	
	public void interF() {
		System.out.println("<클래스 기반 Book 관리 프로그램>\n\n1) Book 입력\n2) Book 전체 리스트 보기\n3) Book 번호로 보기 \n4) 최고 가격, 최저 가격 보기 \n5) 평균 가격, 중위 가격 보기\n6) 제목 순 정렬해서 보기\n7) 제목으로 검색\n0) 메인 메뉴로 돌아감(종료)");
	}
	
	public int select() {
		System.out.print("입력: ");
		
		int number = -1;
		try {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요");
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
			System.out.println("책 목록이 입력해주세요.");
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