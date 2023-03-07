public class Main {
    private int startNumber;
    private int endNumber;

    public static void main(String[] args) {
        printFizzBuzz fb = new printFizzBuzz(1,50); fb.pFizzBuzz();
        printFizz fizz = new printFizz(1, 50); fizz.pFizz();
        printBuzz buzz = new printBuzz(1,50); buzz.pBuzz();
    }
}
