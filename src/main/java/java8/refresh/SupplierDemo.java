package java8.refresh;

import java.util.function.Supplier;

//NO INPUT, RETURNS OUTPUT OF SPECIFIED TYPE
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {return "Holla";};

        System.out.println(supplier.get());
    }
}
