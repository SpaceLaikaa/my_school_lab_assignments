package lab_projects_Semester2.s2lab14.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class DataReader {

    public ArrayList<ProductRecord> readData(Path dataPath){
        ArrayList<ProductRecord> records = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(dataPath)){
            String line;

            while((line = br.readLine())!=null){
                if (line.trim().isEmpty()){continue;}

                String[] dataList = line.trim().split(",");
                String product = dataList[0];
                String category = dataList[1];
                String quantity = dataList[2];
                String price = dataList[3];

                try{
                    if (Integer.parseInt(quantity)<0 && Double.parseDouble(price)<0);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Price or Quantity can not be lower than 0");
                }
                records.add(new ProductRecord(product,category,Integer.parseInt(quantity),Double.parseDouble(price)));

            }


        } catch (IOException e){
            System.out.println("Cannot find readable data file path");
        }
        return records;
    }

}
