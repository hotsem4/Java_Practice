package kunsan.bumsu.testpro;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력해주세요.");
		a = sc.nextInt();
		System.out.print("b의 값을 입력해주세요.");
		b = sc.nextInt();
		
		int test = a + b;
		
		System.out.println("a + b = " + test);
		
		
		
		
	}
}
