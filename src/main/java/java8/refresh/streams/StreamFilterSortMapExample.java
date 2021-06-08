package java8.refresh.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterSortMapExample {

    public static void main(String[] args) {
        List<Product> filteredProduct =  getProducts().stream().filter(product -> {
            return product.getPrice() > 10;
        }).collect(Collectors.toList());

        System.out.println(filteredProduct);
        System.out.println("----------------------");

        //sorted products example
        getProducts().stream().sorted((o1,o2) -> {
            return (int) (o1.getPrice() - o2.getPrice());
        }).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------------");

        //streams map - to map one type of object to another. uses the Function functional inerface, take one input and returns the same or different output
        List<String> productNames = getProducts().stream().map(product -> product.getName()).collect(Collectors.toList());
        productNames.forEach(System.out::println);
    }

    private static List<Product> getProducts(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "apple", 10f));
        list.add(new Product(1, "orange", 5f));
        list.add(new Product(1, "kiwi", 100f));
        list.add(new Product(1, "banana", 3f));
        list.add(new Product(1, "apricot", 50f));
        return list;
    }
}

class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}