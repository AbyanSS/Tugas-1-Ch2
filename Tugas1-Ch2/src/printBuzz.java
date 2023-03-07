public class printBuzz extends printFizzBuzz{// Inheritance
    public printBuzz(int startNumber, int endNumber) {
        super(startNumber,endNumber);
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
