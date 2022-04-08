package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialization {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee serial1 = (Employee) objectInputStream.readObject();
            Employee serial2 = (Employee) objectInputStream.readObject();

            System.out.println(serial1.id + " " + serial1.name);
            System.out.println(serial2.id + " " + serial2.name);

            objectInputStream.close();

            //  System.out.println("Serialization and Deserialization has successfully execute");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
