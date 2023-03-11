import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

public class ReadFile extends Hitung {
    String[] row = new String[0];
    ArrayList<Integer> list = new ArrayList();

    public Optional<ArrayList<Integer>> reader(int hitung) throws IOException {

        try {
            BufferedReader reader = null;
            String line = "";
            String regex = "[0-9]";
            String file = "C://Users/ARJ/IdeaProjects/dirData/data_sekolah.csv";
            reader = new BufferedReader(new FileReader(file));
            for (int i = 1; i < hitung; i++) {
                list.clear();
                line = reader.readLine();
                row = line.split(";");
                for (int j = 1; j < row.length; j++) {
                    if (row[j].matches(regex)) list.add(Integer.parseInt(row[j]));
                }
            }
        } catch (Exception e) {
            throw new IOException("File Not Found");
            //System.out.println("File Tidak Ditemiukan");
        }
        return Optional.ofNullable(list);
    }
}