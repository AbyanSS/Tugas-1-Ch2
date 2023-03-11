import java.util.ArrayList;

public class Hitung {
    public int modus(ArrayList<Integer> row,double sum){
        int angkaMax=-1;
        int angkaSisa=-1;
        for (int i =1;i< row.size();i++){
            int number = Integer.parseInt(String.valueOf(row.get(i)));
            sum +=number;
            int count =0;
            for(int j=0;j< row.size();j++){
                if(row.get(i) == row.get(j)){
                    count++;
                }
                if(count>angkaSisa){
                    angkaMax= Integer.parseInt(String.valueOf(row.get(i)));
                    angkaSisa=count;
                }
            }
        }
        return angkaMax;
    }
    public int count(ArrayList<Integer> x){
        int count=0;
        for(int i =1;i<x.size();i++) {
            count = count+ 1;
        }
        return count;
    }
    public int sum(ArrayList<Integer> x){
        int jumlah = x.stream().reduce(0, Integer::sum);

        return jumlah;
    }
    public double mean(double sum, double count){

        double rataRata = sum/(count-1);
        return rataRata;
    }
    public double median(ArrayList<Integer> row){
        double median=0;
        if(row.size() % 2 ==1){
            median = Integer.parseInt(String.valueOf(row.get((row.size()-1) / 2)));
        }
        else {
            double angka1 = (Integer.parseInt(String.valueOf(row.get((row.size()-1) / 2))));
            double angka2 =(Integer.parseInt(String.valueOf(row.get((row.size()-1) / 2-1))));
            median=(angka1+angka2)/2;
        }
        return median;
    }
}
