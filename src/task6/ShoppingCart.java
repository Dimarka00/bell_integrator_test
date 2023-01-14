package task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Basket {

    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int quantity) {
        products.put(product, quantity);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
        } else {
            System.out.println("Такого продукта нет");
        }
    }

    public void clear() {
        products.clear();
    }

    public List<String> getProducts() {
        return products.keySet().stream().toList();
    }

    public int getProductQuantity(String product) {
        return products.get(product);
    }
}
