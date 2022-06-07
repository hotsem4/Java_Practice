package lecture13;

import java.util.Scanner;

public class InterFace {
	public void interF() {
		System.out.println("1. 신규 회원 가입");
		System.out.println("2. 회원 정보 수정 \n  1) pass 수정\n  2) 이름 수정");
		System.out.println("3. 회원 삭제");
		System.out.println("4. 회원 정보 보기");
		System.out.println("5. 이전 화면으로");
	}
	
	public int selectNum() {
		int number = -1;
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		return number;
	}
	
	public static void main(String[] args) {
		InterFace iF = new InterFace();
		iF.interF();
		iF.selectNum();
	}
}
