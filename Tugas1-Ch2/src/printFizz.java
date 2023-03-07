public class printFizz implements iFizz {
    private int startNumber;
    private int endNumber;

    public printFizz(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    public int pFizzBuzz() {
        return 0;
    }

    public int pFizz(){
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("\nBerikut hanya Buzz yang akan ditampilkan \n");
        return 0;
    }

    @Override
    public int pBuzz(){
        return  0;
    }
}
