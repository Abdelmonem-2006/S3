public class Admin extends User {
    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    public void updateProduct() {
    }

    @Override
    public void getUserDetails() {
        System.out.println("Admin ID : "+userId);
        System.out.println("Admin Name : "+username);
        System.out.println("Admin Email : "+email);
    }



}
