package kunsan.bumsu.lecture04;
import java.util.Scanner;


public class ForSum {
    public void printSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("x���� �Է��Ͻÿ� : ");
        int x = scanner.nextInt();
        System.out.print("y���� �Է��Ͻÿ� : ");
        int y = scanner.nextInt();
        System.out.println("");

        for (int i = x; i <= y; i++){
            sum += i;
            System.out.print(i);

            if (i <= y-1) {
                System.out.print(" + ");
            }
            else {
                System.out.print(" = ");
                System.out.print(sum);
            }
        }
        
    }

    // public static void main(String[] args) {
    //     ForSum aMan = new ForSum();
    //     aMan.printSum();
    // }
}
