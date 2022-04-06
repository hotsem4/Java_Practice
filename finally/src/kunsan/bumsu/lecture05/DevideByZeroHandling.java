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
        		System.out.print("�������� �Է��Ͻÿ� : ");
                dividend=scanner.nextInt();    // ������ �Է�
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
            	System.out.println("00");
            	break;
            }
            try {
                System.out.println(dividend + "�� "+ divisor+"�� ������ ���� " + dividend/divisor + "�Դϴ�.");
                break;    // �������� ������ �Ϸ� �� while �����
            }
            catch(ArithmeticException e) {   // ArithmeticException ���� ó�� �ڵ�
                System.out.println("0���� ���� �� �����ϴ�! \n �ٽ� �Է��ϼ���.");
            }
            
        }
    }// �������

    public static void main(String[] args) {
        Main aMan = new Main();
        aMan.Main_method();
    }
}