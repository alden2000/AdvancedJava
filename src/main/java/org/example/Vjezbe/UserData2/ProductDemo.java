package org.example.Vjezbe.UserData2;

import java.sql.SQLException;
import java.util.List;

public class ProductDemo {
    public static void main(String[] args) throws SQLException {
        SQLReader sqlReader=new SQLReader();
        List<Product> products= sqlReader.productsLoader();
        products.forEach(System.out::println);
    }
}
