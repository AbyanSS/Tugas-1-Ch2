public class printFizzBuzz implements  iFizz {
    private int startNumber;
    private int endNumber;

    public printFizzBuzz(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public int pFizzBuzz(){
        System.out.println("Berikut menampilkan FIzzBuzz");
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("\nBerikut hanya Fizz yang akan ditampilkan \n");
        return 0;
    }

    @Override
    public int pFizz() {
        return 0;
    }

    @Override
    public int pBuzz(){
        return  0;
    }


}
