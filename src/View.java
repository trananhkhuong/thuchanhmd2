import javax.jws.soap.SOAPBinding;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class View implements Serializable {
Scanner scanner = new Scanner(System.in);
public int Menu(){
    System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
    System.out.println("Chọn chứ năng theo số ( để tiếp tục) ");
    System.out.println("1. Xem danh sách.");
    System.out.println("2. Thêm mới.");
    System.out.println("3. Cập nhật.");
    System.out.println("4. Xóa.");
    System.out.println("5. Tìm kiếm.");
    System.out.println("6. Thoát.");
    System.out.println("Chọn chứ năng : ");
    return checkChoice();
}
    private  int checkChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean checkChoice;
        int choice = 0;
        do {
            checkChoice = true;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checkChoice = false;
                System.err.println("---Please re-enter the number in the menu!!!---");
                System.out.println("Enter any key to continue !! Press Q to exit. ");
                String quit = scanner.nextLine();
                if (quit.equalsIgnoreCase("Q")){
                    //   menuUser();
                    break;
                }
            }
        } while (!checkChoice);
        return choice;
    }

    public Phonebook create(){
        System.out.println("Nhập số điện thoại:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Họ và Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        return new Phonebook(number, name, gender, address);
    }

    public void show (List<Phonebook> phonebooks){
        for (Phonebook com : phonebooks){
            System.out.println(com);
        }
    }
    public int inputPhone(){
        System.out.println("Nhập SĐT muốn sửa : ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int Phone() {
        System.out.println("Nhập tên cần tim");
        return Integer.parseInt(scanner.nextLine());
    }

}
