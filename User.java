public class User {
        protected int userId;
        protected String username;
        protected String email;

        public User(int userId, String username, String email) {
            this.userId = userId;
            this.username = username;
            this.email = email;
        }

        public void getUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        }

}
