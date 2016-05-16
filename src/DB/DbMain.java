package DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 CREATE TABLE product (id integer PRIMARY KEY, name varchar(20), category varchar(20), price integer);

 INSERT INTO product VALUES
 (1, 'Elephant', 'African animal', 1000000),
 (2, 'Ostrich', 'Australian bird', 20000),
 (3, 'Lion', 'African animal', 500000),
 (4, 'Hipo', 'African animal', 850000);
 */
public class DbMain {
    private Connection connection;

    public DbMain(Connection connection) {
        this.connection = connection;
    }

    public List<Product> findAllProducts() throws Exception {
        Statement statement = connection.createStatement();
        String sql = "SELECT id, name, category, price FROM product";
        ResultSet resultSet = statement.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            Product product = new Product(id, name, category, price);
            products.add(product);
        }
        resultSet.close();
        statement.close();
        return products;
    }

    public Product findById(int id) throws Exception {
        Statement statement = connection.createStatement();
        String sql =
                "SELECT name, category, price " +
                        " FROM product" +
                        " WHERE id=" + id;
        ResultSet resultSet = statement.executeQuery(sql);
        Product result = null;
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            result = new Product(id, name, category, price);
        }
        resultSet.close();
        statement.close();
        return result;
    }

    public Map<String, Integer> findNameAndPrice() throws Exception {
        Statement statement = connection.createStatement();
        String sql = "SELECT name, price FROM product";
        ResultSet resultSet = statement.executeQuery(sql);
        Map<String, Integer> nameAndPrice = new HashMap<>();
        while (resultSet.next()) {
            String name = resultSet.getString(1);
            int price = resultSet.getInt(2);
            nameAndPrice.put(name, price);
        }
        resultSet.close();
        statement.close();
        return nameAndPrice;
    }


    public static void main(String[] args) throws Exception {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres");

        DbMain main = new DbMain(connection);
        System.out.println(main.findNameAndPrice());
        System.out.println(main.findAllProducts());
        System.out.println(main.findById(3));

        String s = String.format("my message is %s and %s, but my number is %d", "ASD","QWE", 120);
        System.out.println(s);

        connection.close();
    }
}
