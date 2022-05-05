package kunsan.bumsu.lecture04;

import java.util.Scanner;

public class CoffeePrice{
    public void menu() {
        System.out.println("에스프레소 : 3500원\n카푸치노 : 3500원\n카페라떼 : 3500원\n\n아메리카노 : 2000원\n");
    }

    public void calcPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램");
        System.out.print("무슨 커피 드릴까요? ");
        String order = scanner.next();
        int price = 0;
        switch (order) {
            case "에스프레소":
            case "카푸치노" :
            case "카페라떼" :
                price = 3500;
                break;
            case "아메리카노" :
                price = 2000;
                break;
            default:
                System.out.println("메뉴가 없습니다!");
        }
        if (price != 0) {
            System.out.print(order + "는 " +price + "원입니다.");
        
        }
    }

    // public static void main(String[] args) {
    //     CoffeePrice aMan = new CoffeePrice();
    //     aMan.calcPrice();
    // }
}