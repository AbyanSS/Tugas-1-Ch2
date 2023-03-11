import java.util.*;
import java.io.*;

public class App {

    private static Scanner input = new Scanner(System.in);
    private static int pilihan = -1;

    public static void main(String[] args) throws IOException{
        MainMenu menu = new MainMenu();
        menu.MainMenu();
    }

    public static void MainMenu() throws IOException{
        WriteFile tulis = new WriteFile();
        ModusFrek tulis2 = new ModusFrek();
        Kelas kls = new Kelas();



        try{
            ArrayList kelas = new ArrayList();
            ArrayList Mean = new ArrayList();
            ArrayList Median = new ArrayList();
            ArrayList Modus = new ArrayList();
            for (int i = 2; i <= 9; i++) {
                ArrayList<Integer> data = tulis.reader(i).orElse(new ArrayList<>());
                kelas.add(kls.namaKelas(i).orElse(""));
                Mean.add(tulis.hasil.mean(tulis.hasil.sum(data), tulis.hasil.count(data)));
                Median.add(tulis.hasil.median(data));
                Modus.add(tulis.hasil.modus(data, tulis.hasil.sum(data)));
                tulis.reader(i);
            }

            while(pilihan != 0) {
                System.out.println("------------------------------------------------------------");
                System.out.println("Aplikasi Pengolah Nilai Siswa");
                System.out.println("------------------------------------------------------------");
                System.out.println("Letakkan file csv dengan nama file data_sekolah di direktori");
                System.out.println("berikut: c://temp/direktori\n");
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
                        tulis2.frekuensiModus(9, kelas);
                        scsOutput();
                        // failOutput();
                        break;
                    case 2:
                        //Code goes hir
                        tulis.Hasil(kelas, Mean, Median, Modus);
                        scsOutput();
                        // failOutput();
                        break;
                    case 3:
                        //Code goes hir
                        tulis2.frekuensiModus(9, kelas);
                        tulis.Hasil(kelas, Mean, Median, Modus);
                        scsOutput();
                        // failOutput();
                        break;
                    case 0:
                        //Code goes hir
                        scsOutput();
                        // failOutput();
                        break;
                    default:
                        System.out.println("Inputan anda salah!!");
                        break;
                }
            }

        }catch(Exception e) {
            failOutput();
        }
        
    }

    public static void scsOutput() throws IOException {
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

    public static void failOutput() throws IOException {
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