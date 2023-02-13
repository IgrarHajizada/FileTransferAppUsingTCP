import java.util.Scanner;

public class MenuUtil {
    public static void userNameAndSurname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and surname");
        System.out.print("Name: ");
        String userName = sc.nextLine();
        System.out.print("Surname: ");
        String userSurname = sc.nextLine();
        System.out.println("Hello " + userName + " " + userSurname);
    }

    public static String fileLocation() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nPlease note the link where the file you want to send is located");
        System.out.println("C:\\Users\\HP\\Desktop\\FileTransfer.txt");
        System.out.print("Location: ");
        String fileLocation = sc.nextLine();
        return fileLocation;
    }


    public static String[] ipAndPort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the ip and port of the person (server) you want to send this image to");
        System.out.println("Example: localhost:5678");
        System.out.print("\nIp and Port: ");
        String ipAndPort = sc.nextLine();

        String[] arr = ipAndPort.split(":");
        return arr;
    }
}
