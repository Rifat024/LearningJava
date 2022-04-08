package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        try {
            Employee serial1 = new Employee(100, "rifat");
            Employee serial2 = new Employee(101, "Siraj");

            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serial1);
            objectOutputStream.writeObject(serial2);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Serialization and Deserialization has successfully execute");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
