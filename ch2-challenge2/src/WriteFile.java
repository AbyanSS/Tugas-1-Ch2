import java.io.*;
import java.util.ArrayList;

public class WriteFile extends ReadFile{
    ReadFile read = new ReadFile();
    public Hitung hasil = new Hitung();

    public void Hasil(ArrayList kelas, ArrayList Mean, ArrayList Median, ArrayList Modus) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users/ARJ/IdeaProjects/dirData/datameanmedian.txt"));
            bw.write("Berikut Hasil Pengolahan Nilai : ");
            bw.write("\n");
            bw.write("\n");
            bw.write("Berikut Hasil Sebaran Data Nilai");
            for (int i = 2; i <= 9; i++) {
                bw.write("\n");
                bw.write("\n");
                bw.write("\nKelas   :   " + kelas.get(i - 2));
                bw.write("\n");
                bw.write("\nMean    :   " + Mean.get(i - 2));
                bw.write("\nMedian  :   " + Median.get(i - 2));
                bw.write("\nModus   :   " + Modus.get(i - 2));
                bw.write("\n");
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            throw new IOException("File cannot be generated");
        }
    }
}
