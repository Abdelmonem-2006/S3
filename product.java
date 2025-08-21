public class product {
    private int productId;
    private String name;
    private double price;
    private int stock;
    private String category;

    public product(int productId, String name, double price, int stock, String category) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        setStock(stock);
        this.category = category;
    }


    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCategory() {
        return category;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
            this.price = 0;
        } else
            this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Stock cannot be negative.");
            this.stock = 0;
        } else
            this.stock = stock;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isInStock() {
        if (stock > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stock && quantity > 0) {
            stock -= quantity;
            return true;
        } else
            return false;
    }

    public void addStock(int quantity) {
        if (quantity > 0)
            stock += quantity;
        else
            System.out.println("Invalid Operation");
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + "\nName: " + name + "\nPrice: " + price + "\nStock: " + stock + "\nCategory: " + category;
    }
}