package iuh;

import java.util.ArrayList;
import java.util.List;

public class Table  implements Component {
    private List<Component> products = new ArrayList<>();

    public void addProduct(Component product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        return products.stream().mapToDouble(Component::getPrice).sum();
    }
}
