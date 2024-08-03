public class User {
    //Kelas ini digunakan untuk membuat objek yang berisi data terkait pengguna

    //Ada dua Variable
    private String username;//variabel menyimpan informasi username
    private String password;//variabel menyimpan informasi password

    //Konstruktor
    //untuk menginisialisasi objek baru dengan memberikan nilai awal pada variabel username dan password
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    //Method Getter
    //Memastikan informasi username dan password tetap terkontrol dan tidak bisa diubah sembarangan dari luar kelas User
    //Ada dua yaitu getUsername dan getPassword
    //Method ini digunakan untuk mengambil nilai variabel username dan password
    public String getUsername(){
        return username;//mengembalikan nilai dari variabel username
    }

    public String getPassword(){
        return password;//mengembalikan nilai dari variabel password
    }
}
