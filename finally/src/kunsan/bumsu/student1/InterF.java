package kunsan.bumsu.student1;

import kunsan.bumsu.lecture04.*;
import kunsan.bumsu.lecture05.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterF{
	public void inter() {
		System.out.println("<학생 성적 처리 프로그램>");
		System.out.println("1) 학생 성적 입력");
		System.out.println("2) 학생 전체 성적 리스트 보기");
		System.out.println("3) 학생의 번호로 성적 보기");
		System.out.println("4) 성적 최고 점수, 최저 점수 보기");
		System.out.println("5) 성적 평균 점수, 중위값 점수 보기");
		System.out.println("6) 성적 정렬해서 보기");
		System.out.println("0) 메인 메뉴로 돌아감(종료)");
	}
	
	public int select() {
		int input = -10;
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		try {
			input = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("입력 값을 다시 확인해주세요.");
		}
		return input;
	}
	
	public static void main(String[] args) {
		InterF aManF = new InterF(); 
		aManF.inter();
		int number = aManF.select();
		
	}
}
