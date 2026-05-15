package lab_projects_Semester2.s2lab11.com.labmanager.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

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

    public static long getFileSize(Path path){
        try{
            return Files.size(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void appendLog(Path logPath, String message){
        try{
            String logMessage = LocalDateTime.now() + " - " + message;

            Files.writeString(
                    logPath,
                    logMessage + System.lineSeparator(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
