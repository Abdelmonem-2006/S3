public class Customer extends User {
        public Customer(int userId, String username, String email) {
            super(userId, username, email);
        }

        public void placeOrder() {
            System.out.println(userId+" Placed his order");
        }
        public void placeOrder(int productId) {
            System.out.println(username + " placed an order for product ID: " + productId);
        }



        @Override

        public void getUserDetails() {
        System.out.println("Customer ID : "+userId);
        System.out.println("Customer Name : "+username);
        System.out.println("Customer Email : "+email);
        }
}
