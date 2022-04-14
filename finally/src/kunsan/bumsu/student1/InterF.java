package kunsan.bumsu.student1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InterF{
	
	static int[] arr1 = null;		// 배열 arr1을 편하게 쓰기 위해 전역변수로 선언
	
	
	public void inter() {
		System.out.println("\n\n<학생 성적 처리 프로그램>");
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
		
		System.out.print("입력 : ");
		try {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			if(input > 6) {
				while(input > 6) {
					System.out.println("입력한 값이 올바르지 않습니다.\n다시 입력해주세요.");
					Scanner scanner1 = new Scanner(System.in);
					input = scanner1.nextInt();
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("입력 값을 다시 확인해주세요.");
		}
		return input;
	}
	
	public int[] practiceNum1(){		// 학생들 성적 입력 method
		Num1 num1 = new Num1();
		int[] arr;
		arr = num1.select1();
		return arr;
	}
	
	public int[] practice(int input, int[] arr1) {
		try {
			switch (input) {
				case 2:
					Num2 num2 = new Num2();
					num2.List(arr1);
					break;
				case 3:
					Num3 num3 = new Num3();
					num3.search(arr1);
					break;
				case 4:
					Num4 num4 = new Num4();
					int[] sortedArr= null;
					sortedArr = num4.sort(arr1);
					num4.high_low(sortedArr);
					break;
				case 5:
					Num4 num5 = new Num4();
					int[] sortedArrNum5 = null;
					sortedArrNum5 = num5.sort(arr1);
					Num5 aver = new Num5();
					aver.averLow(sortedArrNum5);
					break;
				case 6:
					Num4 num6 = new Num4();
					int[] sortedArrNum6 = null;
					sortedArrNum6 = num6.sort(arr1);
					Num6 sortList = new Num6();
					sortList.sort(sortedArrNum6);
					break;
				
				case 0:
					break;		// 여기를 전 메인메뉴로 돌려보내기
			}
		}
		catch(NullPointerException e) {
			System.out.println("학생의 성적을 입력하지 않았습니다.");
		}
		
		return null;
	}
	
	public void mainCopy() {
		InterF aManF = new InterF(); 
		int stop = 0;
		while(stop == 0) {
			aManF.inter();
			int number = aManF.select();
			
			if (number == 1) {
				arr1 = aManF.practiceNum1();
			}
			else {
				if (number == 0) {
					stop = 1;
				}
				aManF.practice(number, arr1);
			}
		}
	}
}
