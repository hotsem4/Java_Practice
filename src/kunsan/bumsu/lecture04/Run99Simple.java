package kunsan.bumsu.lecture04;

import java.util.Scanner;

public class Run99Simple {
    public void run99(int start, int end, int j_start, int j_end) {
        int i,j;

        for (i = start; i <= end; i++, System.out.println()) {
            for (j = j_start; j< j_end + 1; j++,System.out.print("\t")) {
                System.out.print(i + " * " + j + " = " + i*j);
            }
        }
    }

    public void doDialog() {
        int start = 0, end = 0, j_start = 0, j_end = 0;
        Scanner rd = new Scanner(System.in);
        System.out.println("�� �� ���� �� �� ���� �������� ����ұ��? (int, int) : ");
        start = rd.nextInt();
        end = rd.nextInt();
        System.out.println("��� �� ���� ��� �� ���� ���ұ��?(int, int) : ");
        j_start = rd.nextInt();
        j_end = rd.nextInt();
        run99(start, end, j_start, j_end);
    }

    // public static void main(String[] args) {
    //     Run99Simple aMan = new Run99Simple();

        
    //     aMan.doDialog();
    // }
}