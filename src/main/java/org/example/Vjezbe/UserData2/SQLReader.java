package org.example.Vjezbe.UserData2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLReader {
    private static final String URL="jdbc:mysql://localhost:3306/sql_inventory";
    private static final String USERNAME="root";
    private static final String PASSWORD="deni00hena05";

    public List<Product> productsLoader() throws SQLException {
        List<Product> productList=new ArrayList<>();
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * , quantity_in_stock*unit_price AS price\n" +
                "FROM sql_inventory.products;");

        while (resultSet.next()){
            Product product =new Product();
            int productID=resultSet.getInt("product_id");
            product.setProductId(productID);
            String name = resultSet.getString("name");
            product.setName(name);
            int quantityInStock=resultSet.getInt("quantity_in_stock");
            product.setQuantitiINStock(quantityInStock);
            double unitPrice = resultSet.getDouble("unit_price");
            product.setUnitPrice(unitPrice);
            product.setPrice(resultSet.getDouble("price"));
            productList.add(product);
        }
        return productList;
    }
}
