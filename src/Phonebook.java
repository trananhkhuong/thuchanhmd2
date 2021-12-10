import java.io.Serializable;

public class Phonebook implements Serializable {
    private int number;
    private String name;
    private String gender;
    private String address;

    public Phonebook(String number, String name, String gender, String address) {
    }

    public Phonebook(int number, String name, String gender, String address) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "SĐT =" + number +
                ", Họ và tên ='" + name + '\'' +
                ", Giới tính ='" + gender + '\'' +
                ", Địa chỉ ='" + address + '\'' +
                '}';
    }
}
