package kunsan.bumsu.lecture04;


public class DoWhileSample {
    public void printAtoZ() {
        char A= 'A';

        do {
            System.out.print(A);
            A = (char) (A + 1);
        } while (A <= 'Z');

    }

    // public static void main(String[] args) {
    //     DoWhileSample aMan = new DoWhileSample();
    //     aMan.printAtoZ();
    // }
}
