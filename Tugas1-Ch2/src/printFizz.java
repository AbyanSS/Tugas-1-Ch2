class printFizz extends printFizzBuzz {// Inheritance
    public printFizz(int paramStartNumber, int paramEndNumber) {
        super(paramStartNumber, paramEndNumber);
    }


    public void pFizz(){
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("\nBerikut hanya Buzz yang akan ditampilkan \n");
    }
}
