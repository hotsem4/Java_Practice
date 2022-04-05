package kunsan.bumsu.lecture04;

import java.util.Scanner;

public class WhileSample {
    public void explain() {
        System.out.println("---입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기---\n");
        System.out.println("1) 원하는 숫자를 1개씩 Enter를 이용하여 입력하시오.");
        System.out.println("2) -1을 입력하면 입력페이지가 종료됩니다.");

    }
    public void getAverage() {
        Scanner rd = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        int i = 0;
        while ((i = rd.nextInt())  != -1) {
            sum += i;
            n++;
        } 
        System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 " + sum / n + "입니다.");
    }
}

