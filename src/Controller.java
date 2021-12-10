import java.awt.*;
import java.util.Scanner;

public class Controller {
public static void Menu(){
    Service service = new Service();
    View view = new View();
    ReadAndWire readAndWire = new ReadAndWire();
    while (true){
        int choice = view.Menu();
        switch (choice){
            case 1:
                view.show(service.findAll());
                break;
            case 2:
                service.addPhone(view.create());
                break;
            case 3:
                int index = service.findIndexByName(view.inputPhone());
                if (index != -1){
                    service.edit(index, view.create());
                }
                break;
            case 4:
                int delete = service.findIndexByName(view.inputPhone());
                if (delete != -1){
                    service.delete(delete);
                }
                break;
            case 5:
                service.search(view.Phone());
                break;
            case 6:
                readAndWire.realdFile();
                break;
            case 7:
                readAndWire.writeToFile();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Không có chức năng này");
                new Menu();
        }

    }
}
}
