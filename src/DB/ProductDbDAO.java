package DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MBCNEWMAIN on 23.05.2016.
 */
public class ProductDbDAO implements DAO<Product> {
    private Connection connection;

    public ProductDbDAO() {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean create(Product product) {
        String sql =
                " INSERT INTO product (id, name, category, price)" +
                        " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getId());
            statement.setString(2, product.getName());
            statement.setString(3, product.getCategory());
            statement.setInt(4, product.getPrice());

            int rowsInserted = statement.executeUpdate();

            statement.close();
            return rowsInserted == 1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(int id) {
        try {
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
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {

        try {
            String sql =
                    "UPDATE product SET price = ?, name = ?, category = ? " +
                            " WHERE id = ? ";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, product.getPrice());
            statement.setString(2, product.getName());
            statement.setString(3, product.getCategory());
            statement.setInt(4, product.getId());

            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Product product) {
        try {
            String sql =
                    "DELETE FROM product WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getId());

            int rowsDeleted = statement.executeUpdate();

            System.out.println("Rows deleted: " + rowsDeleted);
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
