package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class NameComparator implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {

        return o1.name.compareTo(o2.name);
    }
}
class productComparator implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        if(o1.price > o2.price){
            return +1;
        }
        return 0;
    }
}
public class GptQ3Comp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("av",35000));
        products.add(new Product("mobile",150000));
        Collections.sort(products,new productComparator());
        System.out.println(products);
    }
}
