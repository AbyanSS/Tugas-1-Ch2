import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);
    private static int pilihan = -1;
    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu(){

        while(pilihan != 0) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Aplikasi Pengolah Nilai Siswa");
            System.out.println("------------------------------------------------------------");
            System.out.println("Letakkan file csv dengan nama file data_sekolah di direktori");
            System.out.println("berikut: c://temp/direktori");
            System.out.println(" ");
            System.out.println("Pilih menu : ");
            System.out.println("1. Generate txt untuk menampilkan modus");
            System.out.println("2. Generate txt untuk menampilkan nilai rata-rata, median");
            System.out.println("3. Generate kedua file");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1:
                    //Code goes hir
                    scsOutput();
                    // failOutput();
                    break;
                case 2:
                    //Code goes hir
                    scsOutput();
                    // failOutput();
                    break;
                case 3:
                    //Code goes hir
                    scsOutput();
                    // failOutput();
                    break;
                case 0:
                    //Code goes hir
                    scsOutput();
                    // failOutput();
                    break;
                default:
                    System.out.println("Inputan anda salah, ");
                    break;
            }
        }
    }

    public static void scsOutput(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("------------------------------------------------------------");
        System.out.println("File telah di generate di C://temp/direktori");
        System.out.println("silahkan cek\n");
        System.out.println("0 Exit");
        System.out.println("1 Kembali ke main menu");
        pilihan = input.nextInt();
        if(pilihan == 1) {
            MainMenu();
        }else if (pilihan == 0){
            System.exit(0);
        }
    }

    public static void failOutput(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Aplikasi Pengolah Nilai Siswa");
        System.out.println("------------------------------------------------------------");
        System.out.println("File tidak ditemukan\n");
        System.out.println("0 Exit");
        System.out.println("1 Kembali ke main menu");
        pilihan = input.nextInt();
        if(pilihan == 1) {
            MainMenu();
        }else if (pilihan == 0){
            System.exit(0);
        }
    }


}