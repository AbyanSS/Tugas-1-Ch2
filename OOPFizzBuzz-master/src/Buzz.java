public class Buzz extends FizzBuzz {//inheritance

    public Buzz(String word) {
        super(word);
    }

    public void pBuzz(){
        System.out.println("\n\nBerikut hanya Buzz yang akan ditampilkan");
        for (int i = 1; i <= Main.n; i++) {
            if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
