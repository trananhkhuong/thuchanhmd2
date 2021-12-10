import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Service implements Serializable {
    List<Phonebook> phonebooks = new ArrayList<>();
    ReadAndWire readAndWire = new ReadAndWire();

    public Service(){
phonebooks = ReadAndWire.readPhoneBook();
    }

public void addPhone(Phonebook phonebook){
    phonebooks.add(phonebook);
    ReadAndWire.writePhonebook(phonebooks);
}

public void edit(int index, Phonebook phonebook){
    phonebooks.set(index, phonebook);
    ReadAndWire.writePhonebook(phonebooks);
}

public void delete(int index){
    phonebooks.remove(index);
    ReadAndWire.writePhonebook(phonebooks);
}

    public int findIndexByName(int phone) {
        for (int i = 0; i < phonebooks.size(); i++) {
            if (phonebooks.get(i).getNumber()== phone) {
                return i;
            }else {
                System.out.println("Không có số này trong danh bạ.");
            }
        }
        return -1;
    }
    public List<Phonebook> findAll(){
        return phonebooks;
    }
    public void search(int sđt) {
        for (int i = 0; i < phonebooks.size(); i++) {
            if (sđt == (phonebooks.get(i).getNumber())) {
                System.out.println(phonebooks.get(i));
            }
        }
    }
}
