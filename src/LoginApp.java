import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        UserService userService = new UserService();//membuat objek UserService yang akan digunakan untuk registrasi dan login pengguna
        Scanner scan = new Scanner(System.in);//digunakan untuk membaca input dari pengguna

        while (true){//loop tak terbatas yang terus berjalan sampai dihentikan dengan break
            //menu pilihan kepada pengguna
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            int choice = scan.nextInt();//membaca pilihan pengguna dari input
            scan.nextLine();

            if (choice == 1){//memeriksa apakah pengguna memilih opsi 1
                //Jika ya, program meminta pengguna memasukkan username dan password
                System.out.print("Enter Your Username :");
                String username = scan.nextLine();
                System.out.print("Enter Your Password :");
                String password = scan.nextLine();
                userService.register(username, password);//lalu memanggil method register pada userService
            } else if (choice == 2) {
                System.out.print("Enter Your Username :");
                String username = scan.nextLine();
                System.out.print("Enter Your Password :");
                String password = scan.nextLine();
                userService.login(username, password);
            } else if (choice == 3) {// //memeriksa apakah pengguna memilih opsi 3
                //Jika ya
                break;// program keluar dari loop dengan menggunakan break
            }else {//menangani kasus di mana pengguna memasukkan pilihan yang tidak valid
                //Jika ya, program menampilkan pesan "Invalid Choice"
                System.out.println("Invalid Choice");
            }
        }
        scan.close();
    }
}
