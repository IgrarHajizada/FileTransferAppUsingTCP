import allServer.*;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to File Transfer App\n");
        MenuUtil.userNameAndSurname();
        MenuUtil.fileLocation();
        ClientOne.clientMethod();
    }
}
