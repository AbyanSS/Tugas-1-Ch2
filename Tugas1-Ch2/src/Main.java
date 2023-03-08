//import java.util.Scanner;

public class Main {
//    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        printFizzBuzz fb = new printFizzBuzz(1,15); fb.pFizzBuzz();
        printFizz fizz = new printFizz(1, 15); fizz.pFizz();
        printBuzz buzz = new printBuzz(1 ,15); buzz.pBuzz();
    }
}
