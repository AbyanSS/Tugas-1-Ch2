import java.io.*;
import java.util.*;

public class ModusFrek {
    ReadFile read = new ReadFile();

    public void frekuensiModus(int hasil, ArrayList kelas) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users/ARJ/IdeaProjects/dirData/data_modus.txt"));
            String file = "C://Users/ARJ/IdeaProjects/dirData/data_sekolah.csv";
            BufferedReader read = new BufferedReader(new FileReader(file));
            ReadFile readFile = new ReadFile();
            bw.write("Berikut Hasil Pengolahan Nilai: ");
            for (int i = 2; i <= hasil; i++) {
                Set<Integer> sets = new HashSet<>();
                ArrayList<Integer> L = readFile.reader(i).orElse(new ArrayList<>());
                L.stream().forEach(data -> {
                    sets.add(data);
                });

                Map<Integer, Integer> maps = maps(sets, L);

                Set<Map.Entry<Integer, Integer>> entrys = maps.entrySet();
                bw.write("\n");
                bw.write("\n" + kelas.get(i - 2) + "\n");
                bw.write("Nilai           |          Frekuensi");
                bw.write("\n");

                for (var entry : entrys) {
                    bw.write(entry.getKey() + "             |               " + entry.getValue() + "\n");
                }
            }
            bw.close();
        }catch (IOException e){
            System.out.println("File Modus tidak bisa di Di ubah");
        }
    }

    private Map<Integer, Integer> maps (Set<Integer> sets, ArrayList<Integer> L){
        Map<Integer, Integer> maps = new LinkedHashMap<>();
        sets.stream().forEach(setData->{
            Integer temp = 0;
            for (var classData : L) {
                if (setData.equals(classData)) {
                    temp++;
                }
            }
            maps.put(setData, temp);
        });
        return maps;
    }
}
