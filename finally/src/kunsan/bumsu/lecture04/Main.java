package kunsan.bumsu.lecture04;

import kunsan.bumsu.lecture04.*;
import kunsan.bumsu.lecture05.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public void homePage() {
        System.out.println("-- ������ ���α׷��� �߿��� ������ �Լ��� �����Ͻÿ�.--");
        System.out.println("1) Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�");
        System.out.println("2) �Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�");
        System.out.println("3) ���ĺ� A���� Z���� ����Ʈ�ϱ�");
        System.out.println("4) ���� x�� y�� �Է¹޾�, x���� y���� ���ϴ� ������ ��� ���̱�");
        System.out.println("5) 99�� �ܼ� ���");
        System.out.println("6) 99�� ��´ܼ��� ���� ���� �����ؼ� ����Ʈ�ϱ�");
        System.out.println("7) ������ ������ ���α׷� ����� : __ArithmeticException");
        System.out.println("0) ����");
    }

    public void contect_number(int number) {
        switch(number) {
            case 1:
                CoffeePrice coffeePrice = new CoffeePrice();
                coffeePrice.menu();
                coffeePrice.calcPrice();
                break;
            case 2:
                WhileSample whileSimple = new WhileSample();
                whileSimple.explain();
                whileSimple.getAverage();
                break;
            case 3:
                DoWhileSample doWhileSample = new DoWhileSample();
                doWhileSample.printAtoZ();
                break;
            case 4:
                ForSum sum = new ForSum();
                sum.printSum();
                break;
            case 5:
                NestedLoop nestedLoop = new NestedLoop();
                nestedLoop.run99();
                break;
            case 6:
                Run99 run99 = new Run99();
                run99.exe();
                break;
            case 7:
            	DevideByZeroHandling devidebyzerohandling = new DevideByZeroHandling();
            	devidebyzerohandling.testSafeException();
            	break;
            case 0:
                System.out.println("���α׷��� �����մϴ�.");
                break;
            case -10:
                break;
                
            default :
                System.out.println("���� �ٽ� �Է��Ͻÿ�.");
                


        }
    }
    public int Select_number(){
        int number = -10;
            Scanner scanner = new Scanner(System.in);
            System.out.print("���� : ");
            try{
                number = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("������ �Է��� �ּ���.");
            }
            
            return number;
    }
    
    public void Main_method() {             //�ٸ� package���� �������̽��� ȣ���ϱ� ���� main�Լ��� Method�� ���� 
        Main aMan = new Main();
        while (true) {
            System.out.print("\n\n");
            aMan.homePage();
            int Input = aMan.Select_number();

            aMan.contect_number(Input);
            if (Input == 0) {
                break;
            }   
        }   
    }
    public static void main(String[] args) {
          
        Main newMan = new Main();
        newMan.Main_method();
    }
}
