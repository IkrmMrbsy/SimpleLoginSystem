public class UserService {
    private User[] users;
    private Integer userCount;

    UserService(){
        users = new User[100];
        userCount = 0;
    }

    public boolean register(String username, String password){
        if (userCount == users.length){
            System.out.println("User Limit Reached");
            return false;
        }

        for (int i = 0; i<userCount; i++){
            if (users[i].getUsername().equals(username)){
                System.out.println("Name Already Exist");
                return false;
            }
        }

        User newUser = new User(username, password);
        users[userCount] = newUser;
        userCount++;
        System.out.println("Registration SuccessFull");
        return true;
    }

    public boolean login(String username, String password){
        for (User user : users){
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("Login Succes");
                System.out.println("Hello " + username);
                return true;
            }
        }
        System.out.println("Cannot Login");
        return false;
    }
}
