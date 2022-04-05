package kunsan.bumsu.lecture04;

import kunsan.bumsu.lecture04.*;
import kunsan.bumsu.lecture05.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public void homePage() {
        System.out.println("-- 다음의 프로그램들 중에서 수행할 함수를 선택하시오.--");
        System.out.println("1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램");
        System.out.println("2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기");
        System.out.println("3) 알파벳 A부터 Z까지 프린트하기");
        System.out.println("4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기");
        System.out.println("5) 99단 단순 찍기");
        System.out.println("6) 99단 출력단수와 수의 범위 설정해서 프린트하기");
        System.out.println("7) 안전한 나눗셈 프로그램 만들기 : __ArithmeticException");
        System.out.println("0) 종료");
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
                System.out.println("프로그램을 종료합니다.");
                break;
            case -10:
                break;
                
            default :
                System.out.println("값을 다시 입력하시오.");
                


        }
    }
    public int Select_number(){
        int number = -10;
            Scanner scanner = new Scanner(System.in);
            System.out.print("선택 : ");
            try{
                number = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("정수를 입력해 주세요.");
            }
            
            return number;
    }
    
    public void Main_method() {             //다른 package에서 인터페이스를 호출하기 위해 main함수를 Method로 만듬 
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
