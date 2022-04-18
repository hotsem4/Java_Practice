package kunsan.bumsu.mdtest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num1 {
	// 여기서는 입력 명수를 입력하면 그에 맞는 크기의 2차원 배열을 생성하여 그 안에 
	// math = scanner.nextInt();
	// kor =scanner.nextInt();
	// eng = scanner.nextInt();
	
	/*
	 * 1. 학생들의 수를 입력 받는다.
	 * 2. 입력 방느 값을 토대로 2차원 배열을 생성한다.
	 * 3. 값을 입력하면 idx를 이용해 배열에 값을 대입한다.
	 * 4. 그리고 2차원 배열을 리턴한다!
	 */
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	public int insertMember() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("성적 입력 명수 > ");
		try {
			number = sc.nextInt();        // 학생 수를 입력받는다.
		}
		catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		}
		return number;
	}
	
	public int[][] arrMember(int number){  // 학생들의 성적을 입력하는 method
		int[][] arrM = new int[number][4];
		for (int i =0; i< number; i++) {
			System.out.print(i+"번째 학생의 성적 : ");
			try {
				Scanner sc = new Scanner(System.in);
				kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
				while (kor > 100 || eng > 100 || math > 100) {
					System.out.println("값이 100점을 넘을 수 없습니다.");
					System.out.print(i+"번째 학생의 성적 : ");
					kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt();
				}
				arrM[i][0] = i; arrM[i][1] = kor; arrM[i][2] = eng; arrM[i][3] = math;
			}
			catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요"); i--;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("정수를 입력해주세요."); i--;
			}
		}
		return arrM;
	}
	public int[][] lastNum1(){		// 두 method를 Main에서 한번에 사용하기 위해 묶은 method
		Num1 num1 = new Num1();
		int number = num1.insertMember();
		int[][] arrM = num1.arrMember(number);
		return arrM;
	}
}