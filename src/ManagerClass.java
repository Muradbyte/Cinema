import java.util.Scanner;
public class ManagerClass {
    static Scanner sc = new Scanner(System.in);
    static ServiceClass service = new ServiceClass();


    public static void main(String[] args) {

        while(true) {
            service.menu();
            int a = sc.nextInt();
            switch(a) {
                case 1:
                    service.list();
                    break;
                    case 2:
                        service.quit();
                        break;
            }


        }

    }
}
