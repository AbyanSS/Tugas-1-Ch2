import java.util.Scanner;

public class Main {
    private static Scanner input;
    public static int n;

    public static void main(String[] args) {
        Fizz fizz = new Fizz("");
        Buzz buzz = new Buzz("");
        input = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        n = input.nextInt();
        logic();
        fizz.pFizz();
        buzz.pBuzz();

    }

    public static void program(FizzBuzz code) { //poly
        System.out.print(code.word);
    }

    private static void logic() {
        System.out.println("Berikut menampilkan FizzBuzz");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                program(new FizzBuzz("FizzBuzz ")); //poly
            } else if (i % 3 == 0) {
                program(new Fizz("Fizz ")); //poly
            } else if (i % 5 == 0) {
                program(new Buzz("Buzz ")); //poly
            } else {
                System.out.print(i + " ");
            }
        }
    }
}