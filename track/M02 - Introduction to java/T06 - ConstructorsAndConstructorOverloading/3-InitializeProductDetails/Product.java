
class Product {

    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name;
        this.price = price;

    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);

    }
}
