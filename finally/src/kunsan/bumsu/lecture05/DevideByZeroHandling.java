package kunsan.bumsu.lecture05;

import kunsan.bumsu.lecture04.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZeroHandling {
    public void testSafeException() {
        int check = 0;
        int dividend = 0;
        int divisor = 0;
        Scanner scanner = new Scanner(System.in);

        while (check == 0) {
        	try {
        		System.out.print("나뉨수를 입력하시오 : ");
                dividend=scanner.nextInt();    // 나뉨수 입력
                if (dividend == 1234) {
                    System.out.println("프로그램을 종료합니다.");
                    check = 1;
                    break;
                }
                System.out.print("나눗수를 입력하시오 : ");
                divisor = scanner.nextInt();    // 나눗수 입력
        	}
        	catch(InputMismatchException e) {
            	System.out.println("정수를 입력하시오.");
            	System.out.println("00");
            	break;
            }
            try {
                System.out.println(dividend + "를 "+ divisor+"로 나누면 몫은 " + dividend/divisor + "입니다.");
                break;    // 정상적인 나누기 완료 후 while 벗어나기
            }
            catch(ArithmeticException e) {   // ArithmeticException 예외 처리 코드
                System.out.println("0으로 나눌 수 없습니다! \n 다시 입력하세요.");
            }
            
        }
    }// 여기까지

    public static void main(String[] args) {
        Main aMan = new Main();
        aMan.Main_method();
    }
}