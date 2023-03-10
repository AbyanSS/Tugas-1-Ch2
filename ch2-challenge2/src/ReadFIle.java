import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) {

        String csvFile = "C://Users/ARJ/IdeaProjects/dirData/data_sekolah.csv";
        String line = "";
        String csvDelimiter = ",";
        ArrayList<String[]> dataArrayList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] data = line.split(csvDelimiter);
                dataArrayList.add(data);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // print dataArrayList
        for (String[] row : dataArrayList) {
            for (String value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

    }


}
