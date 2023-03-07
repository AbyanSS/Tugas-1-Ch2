public class printFizzBuzz implements  iFizz { // Interface
    public int startNumber;
    public int endNumber;
    // Enkapsulasi
    public printFizzBuzz(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public int pFizzBuzz(){ // Interface
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
}
