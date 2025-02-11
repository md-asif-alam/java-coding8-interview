import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
                new Product("Product A", 15.5),
                new Product("Product B", 20.5),
                new Product("Product C", 16.8)
        );

        list.stream().sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(product -> System.out.println(product.getName()+" "+product.getPrice()));

    }
}
