import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWire {
    Service service = new Service();
    public void realdFile() {
        try {
            FileReader fileReader = new FileReader("phonebook.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                String realdfile[] = line.split(" , ");
                String number = realdfile[0];
                String name = realdfile[1];
                String gender = realdfile[2];
                String address = realdfile[3];

                Phonebook phonebook = new Phonebook(number, name, gender, address);
                service.addList(phonebook);

            }
            System.out.println("đã  đọc file ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile() {
        List<Phonebook> list = service.show();
        try {
            FileWriter fileWriter = new FileWriter("phonebook.txt");
            for (Phonebook st : list) {
                fileWriter.write(st.toString() + " \n");
            }
            System.out.println("ghi file thành công");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
