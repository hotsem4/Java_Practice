package kunsan.bumsu.mdtest;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	
	static int[][] arrM = null;
	
	
	public void interF() {
		System.out.println("<성적처리 프로그램>");
		System.out.println("1. 성적 입력하기");
		System.out.println("2. 성적 보기");
		System.out.println("3. 성적 수정하기");
		System.out.println("4. 평균 성적 보기");
		System.out.println("5. 최고/최저 성적 보기");
		System.out.println("0. 메인메뉴 돌아가기");
	}
	public int select() {

		System.out.print("선택 > ");
		int number = -10;
		try {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요.");
		}
		return number;
	}
	public int[][] arrMemberGrade(){
		int[][] arrM;
		Num1 arrMember = new Num1();
		arrM = arrMember.lastNum1();
		return arrM;
	}
	
	public void sw(int number, int[][] arrM) {
		try {
			switch(number) {
				case 2:
					Num2 num2 = new Num2();
					num2.lookGrade(arrM);
					break;
				case 0:
					break;
			}
		}
		catch(NullPointerException e) {
			System.out.println("성적을 입력하지 않았습니다.");
		}
	}
	
	public static void main(String[] args) {
		int stop = 0;
		Main aMan = new Main();
		while(stop == 0) {
			aMan.interF();
			int number = aMan.select();
			if (number == 1) arrM = aMan.arrMemberGrade();
			else if(number == 0) stop = 1;
			aMan.sw(number, arrM);
			System.out.println("\n");
			
			
			
		}
	}
	
}
// arrM을 main에 fix시키고 사용하기