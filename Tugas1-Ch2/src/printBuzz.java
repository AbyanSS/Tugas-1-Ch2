public class printBuzz implements iFizz{
    private int startNumber;
    private int endNumber;

    public printBuzz(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    public int pFizzBuzz() {
        return 0;
    }

    @Override
    public int pFizz() {
        return 0;
    }

    public int pBuzz(){

        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return 0;
    }
}
