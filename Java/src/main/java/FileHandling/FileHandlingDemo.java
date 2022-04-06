package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {

        try {
            File file1 = new File("H:\\Files\\file1.txt");
            if (file1.createNewFile())
                System.out.println("File created="+file1.getName());
            else
                System.out.println("File already exist");
        }
        catch (IOException e)
        {
            System.out.println("An exception Occurred");
            e.printStackTrace();
        }
        File file2 = new File("H:\\Files\\file3.txt");
        if (file2.exists()){
            System.out.println("File Name="+file2.getName());
            System.out.println("File Path="+file2.getAbsolutePath());
            System.out.println("File Can Read="+file2.canRead());
            System.out.println("File can write="+file2.canWrite());
            System.out.println("File length="+file2.length());
        }
        else
            System.out.println("File is not exist");
    }
}
