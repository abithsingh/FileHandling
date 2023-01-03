import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileHandle {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        String fName="";
        String path="";
        String fullPath="";
        File directoryPath = new File("C:\\Users\\abithsinghs\\Documents\\Files");
        FilenameFilter textFilefilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(".pdf") || lowercaseName.endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        FilenameFilter audioFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(".mp3")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        FilenameFilter videoFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(".m4a")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        String textFilesList[] = directoryPath.list(textFilefilter);
        if(textFilesList.length>=1){
              path="C:\\Users\\abithsinghs\\Documents\\Files\\";
              fName="document";
              path = path+fName;
            File file = new File(path);

            boolean bool = file.mkdir();

        }
        System.out.println("Documents");
        for (String fileName : textFilesList) {
            
            Path temp = Files.move
                    (Paths.get("C:\\Users\\abithsinghs\\Documents\\Files\\"+fileName),
                            Paths.get(path+"\\"+fileName));


        }

        String audioFilesList[] = directoryPath.list(audioFilter);
        if(audioFilesList.length>=1){
            path="C:\\Users\\abithsinghs\\Documents\\Files\\";
            fName="audio";
            path = path+fName;
            File file = new File(path);
            boolean bool = file.mkdir();
        }
        System.out.println("Audio:");
        for (String fileName : audioFilesList) { Path temp = Files.move
                (Paths.get("C:\\Users\\abithsinghs\\Documents\\Files\\"+fileName),
                        Paths.get(path+"\\"+fileName));
        }

        String videoFilesList[] = directoryPath.list(videoFilter);
        if(videoFilesList.length>=1){
            path="C:\\Users\\abithsinghs\\Documents\\Files\\";
            fName="video";
            path = path+fName;
            File file = new File(path);

            boolean bool = file.mkdir();

        }
        System.out.println("Video:");
        for (String fileName :videoFilesList) {
        	 Path temp = Files.move
                     (Paths.get("C:\\Users\\abithsinghs\\Documents\\Files\\"+fileName),
                             Paths.get(path+"\\"+fileName));
        }
    }
}