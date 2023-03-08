class printBuzz extends printFizzBuzz{// Inheritance

    public printBuzz(int paramStartNumber, int paramEndNumber) {
        super(paramStartNumber, paramEndNumber);
    }

    public void pBuzz(){

        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
