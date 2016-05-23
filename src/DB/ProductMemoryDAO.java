package DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MBCNEWMAIN on 23.05.2016.
 */
public class ProductMemoryDAO implements DAO<Product> {
    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public boolean create(Product product) {
        products.put(product.getId(), product);
        return true;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {
        create(product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product.getId());
    }
}
