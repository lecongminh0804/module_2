package _16_IO_Text_File.exercise.ex_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String file = "D:\\codegym\\module2\\src\\_16_IO_Text_File\\exercise\\ex_2\\testRead.csv";
    public static List<Coutry> readCSV() throws IOException {
        List<Coutry> CoutryList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);

        String line;
        String Array[];
        Coutry coutry;
        while ((line = buffer.readLine()) != null){
            Array = line.split(",");
            int id = Integer.parseInt(Array[0]);
            String code = Array[1];
            String name = Array[2];

            coutry = new Coutry(id,code,name);
            CoutryList.add(coutry);
        }
        buffer.close();
        return CoutryList;
    }

    public static void main(String[] args) throws IOException {
        List<Coutry> coutryList = readCSV();
        for (Coutry coutry : coutryList){
            System.out.println(coutry);
        }
    }
}
