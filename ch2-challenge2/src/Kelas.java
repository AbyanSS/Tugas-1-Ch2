import java.util.*;
import java.io.*;

public class Kelas {
    String[] row = new String[0];
    ArrayList<Integer> list = new ArrayList();
    public Optional<String> namaKelas (int hitung) throws IOException {
        BufferedReader reader = null;
        String line = "";
        String file = "C://Users/ARJ/IdeaProjects/dirData/data_sekolah.csv";
        reader = new BufferedReader(new FileReader(file));
        String Hasil = null;
        for (int i = 1; i < hitung; i++) {
            line = reader.readLine();
            row = line.split(";");
            Hasil = row[0];
        }
        return Optional.ofNullable(Hasil);
    }
}
