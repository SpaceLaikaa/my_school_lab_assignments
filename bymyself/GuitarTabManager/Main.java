package bymyself.GuitarTabManager;

import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {

    public String[] FileLocator(String Path){
        Scanner reader = null;
        String[] mainTxtParts = new String[5];

        try{
            reader = new Scanner(Paths.get(Path));
            while(reader.hasNext()){
                String line = reader.nextLine();
                if(line.isEmpty())continue;
                if(line.startsWith("Group"))continue;

                mainTxtParts = line.split(",".trim());


            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){reader.close();}
        }

        return mainTxtParts;
    }


    public void main(String[] args){
        String path = "/Users/ardaa/Desktop/Notes/songs.txt";

    }
}
