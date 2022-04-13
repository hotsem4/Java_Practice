package kunsan.bumsu.student;

import kunsan.bumsu.lecture04.*;
import kunsan.bumsu.lecture05.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeManage {
	
	
	
	public void interF() {
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
		int Number = 0;
		
		System.out.print("선택 : ");
		try {
			Scanner scanner = new Scanner(System.in);
			Number = scanner.nextInt();
			
		}
		catch(InputMismatchException e){
			System.out.println("정수를 입력해주세요");
		}
		
		return Number;
	}
	
	public int[] situation(int Number) {
		switch(Number) {
			case 1:
				StudentGradeManage Num1 = new StudentGradeManage();
				int[] arrPeople = Num1.num1();
				return arrPeople;
			case 0:
				break;
		}
		return null;
	}
	
	// 배열 연습***********************************
	public int[] num1() {
		int howManyPeople = 0;
		System.out.println("처리할 학생 수를 입력하세요(최대100점) : ");
		Scanner scanner = new Scanner(System.in);
		howManyPeople = scanner.nextInt();
		int[] people;				// 학생들의 성적을 저장할 배열 생성
		people = new int[howManyPeople+1];
		for (int i = 1; i < people.length; i++) {
			System.out.print(i + "번 학생 성적 : ");
			int grade = scanner.nextInt();
			if (grade > 100) {
				System.out.println("점수의 최고점은 100점입니다.\n입력하신 점수를 다시 확인해주세요.");
				System.out.print(i + "번 학생 성적 : ");
				grade = scanner.nextInt();
			}
			people[i] = grade;
		}
		System.out.print("\n");
		return people;
	}
	
	public void gradeList(int[] people) {
		for (int i = 1; i<people.length; i++) {		// 배열이 잘 리턴 되었는지 확인하기 위해 print함
			System.out.print(people[i]+"\t");
		}
	}
	//******************************************
	
	
	
	public static void main(String[] args) {
		StudentGradeManage aMan = new StudentGradeManage();
		int stop = 0;
		while(stop == 0) {
			aMan.interF();
			int Number = aMan.select();
			if (Number == 1) {
				int[] test = aMan.situation(Number);
				for (int i = 1; i<test.length; i++) {		// 배열이 잘 리턴 되었는지 확인하기 위해 print함
					System.out.print(test[i]+"\t");
				}
			}
			System.out.println(test[1]);
			
			System.out.println("");
			
		}
		
	}
}

