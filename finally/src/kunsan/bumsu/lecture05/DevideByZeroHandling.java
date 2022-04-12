package kunsan.bumsu.lecture05;

import kunsan.bumsu.lecture04.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZeroHandling {
    public void testSafeException() {
        int check = 0;
        int dividend = 0;
        int divisor = 0;
        

        while (check == 0) {
        	try {
        		
         		System.out.print("�������� �Է��Ͻÿ� : ");
         		Scanner scanner = new Scanner(System.in);
                dividend=scanner.nextInt();    // ������ �Է�
               //String test= scanner.nextLine();
                if (dividend == 1234) {
                    System.out.println("���α׷��� �����մϴ�.");
                    check = 1;
                    break;
                }
                System.out.print("�������� �Է��Ͻÿ� : ");
                divisor = scanner.nextInt();    // ������ �Է�
        	}
        	catch(InputMismatchException e) {
            	System.out.println("������ �Է��Ͻÿ�.");
            	continue;
            	
            }
        	
            try {
                System.out.println(dividend + "�� "+ divisor+"�� ������ ���� " + dividend/divisor + "�Դϴ�.");
                break;    // �������� ������ �Ϸ� �� while �����
            }
            catch(ArithmeticException e) {   // ArithmeticException ���� ó�� �ڵ�
            	if (divisor == 0)
            		System.out.println("0���� ���� �� �����ϴ�! \n �ٽ� �Է��ϼ���.");
            }
            
        }
    }// test__test

    public static void main(String[] args) {
        Main aMan = new Main();
        aMan.Main_method();
    }
}