package org.example.Vjezbe.Pool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product>{

    @Override
    public Product create(Product entry) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products=new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM sql_store.products;");
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Product product=new Product();
                product.setProductId(resultSet.getLong("product_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantityInStock(resultSet.getInt("quantity_in_stock"));
                product.setPrice((resultSet.getBigDecimal("unit_price")));
                products.add(product);
            }
        }catch (SQLException e){
            System.err.println("Pukla konekcija");
        }
        return products;
    }

    @Override
    public Product get(long primaryKey) {
        try{
            ConnectionPool connectionPool=ConnectionPool.getInstance();
            Connection connection=connectionPool.getConnection();
            connectionPool.releseConnectin(connection);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * " +
                    "FROM sql_store.products WHERE product_id=?");
            preparedStatement.setLong(1,primaryKey);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                Product product=new Product();
                product.setProductId(resultSet.getLong("product_id"));
                product.setName(resultSet.getString("name"));
                product.setQuantityInStock(resultSet.getInt("quantity_in_stock"));
                product.setPrice((resultSet.getBigDecimal("unit_price")));
                return product;
            }
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Product update(Product entry) {
        return null;
    }

    @Override
    public void delete(long primaryKey) {

    }
}
