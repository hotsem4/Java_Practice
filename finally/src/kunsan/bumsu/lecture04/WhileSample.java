package kunsan.bumsu.lecture04;

import java.util.Scanner;

public class WhileSample {
    public void explain() {
        System.out.println("---�Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�---\n");
        System.out.println("1) ���ϴ� ���ڸ� 1���� Enter�� �̿��Ͽ� �Է��Ͻÿ�.");
        System.out.println("2) -1�� �Է��ϸ� �Է��������� ����˴ϴ�.");

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
        System.out.println("�Էµ� ���� ������ " + n + "���̸� ����� " + sum / n + "�Դϴ�.");
    }
}

