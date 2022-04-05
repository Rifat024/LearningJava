package FileHandling;

import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("H:\\Files\\file1.txt");
            fileWriter.write("My name is Rifat Bin Siraj.");
            fileWriter.close();
            System.out.println("Successfully write in file");
        }
        catch (Exception e)
        {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
