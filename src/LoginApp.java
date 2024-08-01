import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1){
                System.out.print("Enter Your Username :");
                String username = scan.nextLine();
                System.out.print("Enter Your Password :");
                String password = scan.nextLine();
                userService.register(username, password);
            } else if (choice == 2) {
                System.out.print("Enter Your Username :");
                String username = scan.nextLine();
                System.out.print("Enter Your Password :");
                String password = scan.nextLine();
                userService.login(username, password);
            } else if (choice == 3) {
                break;
            }else {
                System.out.println("Invalid Choice");
            }
        }
        scan.close();
    }
}
