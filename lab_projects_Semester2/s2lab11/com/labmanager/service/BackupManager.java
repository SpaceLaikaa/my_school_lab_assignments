package lab_projects_Semester2.s2lab11.com.labmanager.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BackupManager {
    public static boolean fileExists(Path path){
        return Files.exists(path);
    }

    public static void copyInputFile(Path sourcePath, Path destinationPath){
        try{
            if(Files.exists(destinationPath)){
                Files.delete(destinationPath);
            }
            Files.copy(sourcePath,destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
