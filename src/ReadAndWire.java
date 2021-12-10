import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWire {
    public static List<Phonebook> readPhoneBook() {
        try {
            File file = new File("phonebook.csv");
            if (!file.isFile()){
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream("phonebook.csv");
            if (fileInputStream.available() != 0){
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (List<Phonebook>) objectInputStream.readObject();
            }
            return new ArrayList<>();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void writePhonebook(List<Phonebook> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("phonebook.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            fileOutputStream.close();
            objectOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
