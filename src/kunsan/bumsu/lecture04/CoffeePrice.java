package kunsan.bumsu.lecture04;

import java.util.Scanner;

public class CoffeePrice{
    public void menu() {
        System.out.println("���������� : 3500��\nīǪġ�� : 3500��\nī��� : 3500��\n\n�Ƹ޸�ī�� : 2000��\n");
    }

    public void calcPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�");
        System.out.print("���� Ŀ�� �帱���? ");
        String order = scanner.next();
        int price = 0;
        switch (order) {
            case "����������":
            case "īǪġ��" :
            case "ī���" :
                price = 3500;
                break;
            case "�Ƹ޸�ī��" :
                price = 2000;
                break;
            default:
                System.out.println("�޴��� �����ϴ�!");
        }
        if (price != 0) {
            System.out.print(order + "�� " +price + "���Դϴ�.");
        
        }
    }

    // public static void main(String[] args) {
    //     CoffeePrice aMan = new CoffeePrice();
    //     aMan.calcPrice();
    // }
}