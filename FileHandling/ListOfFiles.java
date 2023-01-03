import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
public class ListOfFiles {
   public static void main(String args[]) throws IOException {
      File directoryPath = new File("C:\\Users\\abithsinghs\\Documents\\Task");
      FilenameFilter textFilefilter = new FilenameFilter(){
         public boolean accept(File dir, String name) {
            String lowercaseName = name.toLowerCase();
            if (lowercaseName.endsWith(".txt")) {
               return true;
            } else {
               return false;
            }
         }
      };
      FilenameFilter jpgFilefilter = new FilenameFilter(){
         public boolean accept(File dir, String name) {
            String lowercaseName = name.toLowerCase();
            if (lowercaseName.endsWith(".jpg")) {
               return true;
            } else {
               return false;
            }
         }
      };
      FilenameFilter pdfFilefilter = new FilenameFilter(){
          public boolean accept(File dir, String name) {
             String lowercaseName = name.toLowerCase();
             if (lowercaseName.endsWith(".pdf")) {
                return true;
             } else {
                return false;
             }
          }
       };
       FilenameFilter pngFilefilter = new FilenameFilter(){
           public boolean accept(File dir, String name) {
              String lowercaseName = name.toLowerCase();
              if (lowercaseName.endsWith(".png")) {
                 return true;
              } else {
                 return false;
              }
           }
        };
      //List of all the text files
      String textFilesList[] = directoryPath.list(textFilefilter);
      System.out.println("List of the text files in the specified directory:");
      for(String fileName : textFilesList) {
         System.out.println(fileName);
      }
      String imageFilesList[] = directoryPath.list(jpgFilefilter);
      System.out.println("List of the jpeg files in the specified directory:");
      for(String fileName : imageFilesList) {
         System.out.println(fileName);
      }
      String pdfFilesList[] = directoryPath.list(pdfFilefilter);
      System.out.println("List of the pdf files in the specified directory:");
      for(String fileName : pdfFilesList) {
         System.out.println(fileName);
      }
      String pngFilesList[] = directoryPath.list(pngFilefilter);
      System.out.println("List of the png files in the specified directory:");
      for(String fileName : pngFilesList) {
         System.out.println(fileName);
      }
   }
}