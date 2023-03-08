public class Fizz extends FizzBuzz {//inheritance

    public Fizz(String word) {
        super(word);
    }

    public void pFizz(){
        System.out.println("\n\nBerikut hanya fizz yang akan ditampilkan");
        for (int i = 1; i <= Main.n; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
