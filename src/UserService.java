public class UserService {
    //Kelas ini bertugas mengelola pengguna, termasuk registrasi dan login
    private User[] users;
    private Integer userCount;//menyimpan jumlah pengguna yang terdaftar saat ini

    //Konstruktor
    //Konstruktor ini mengatur array users dengan kapasitas 100 pengguna dan mulai menghitung pengguna dari 0
    UserService(){
        users = new User[100];//membuat array yang bisa menampung hingga 100 pengguna
        userCount = 0;//menginisialisasi jumlah pengguna menjadi 0 saat pertama kali dibuat
    }

    //Method Register
    //method untuk mendaftarkan pengguna baru
    //memastikan tidak ada pengguna dengan username yang sama dan bahwa kapasitas belum penuh sebelum menambahkan pengguna baru
    public boolean register(String username, String password){
        if (userCount == users.length){//memeriksa apakah kapasitas pengguna sudah penuh.
            System.out.println("User Limit Reached");
            return false;
        }

        for (int i = 0; i<userCount; i++){//memeriksa apakah username sudah ada

            //Untuk memastikan bahwa username yang ingin didaftarkan belum pernah digunakan oleh pengguna lain
            //users[i].getUsername().equals(username) memeriksa apakah username dari pengguna yang sedang diperiksa sama dengan username yang ingin didaftarkan
            if (users[i].getUsername().equals(username)){
                System.out.println("Name Already Exist");
                return false;
            }
        }

        User newUser = new User(username, password);// //membuat pengguna baru
        users[userCount] = newUser;//menambahkan pengguna baru ke dalam array users
        userCount++;//meningkatkan jumlah pengguna terdaftar.
        System.out.println("Registration SuccessFull");
        return true;
    }

    //Method Login
    //memeriksa apakah kombinasi username dan password cocok dengan data pengguna yang sudah terdaftar
    public boolean login(String username, String password){
        for (User user : users){//mengecek setiap pengguna dalam array users

            //memeriksa apakah ada pengguna dengan username dan password yang cocok
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("Login Succes");
                System.out.println("Hello " + username);
                return true;//mengembalikan nilai benar jika login berhasil
            }
        }

        System.out.println("Cannot Login");
        return false;
    }
}
