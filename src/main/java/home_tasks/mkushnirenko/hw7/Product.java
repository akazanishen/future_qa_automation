package home_tasks.mkushnirenko.hw7;

public class Product {
    private int productId;
    private String productName;

    Product(int id, String name) {
        this.productId = id;
        this.productName = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}