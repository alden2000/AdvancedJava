package org.example.Vjezbe.Pool;

import org.example.Vjezbe.FileInOut.Competitors;

import java.io.FileWriter;
import java.util.List;

public class ProductDemo {
    public static void main(String[] args) {
        ProductDao productDao=new ProductDao();
        List<Product> products = productDao.getAll();
        for (Product product:products){
            System.out.println(product);
        }
        System.out.println();
        Product product;
        product=productDao.get(5);
        System.err.println(product);

        ProductDao productDao1=new ProductDao();
        List<Product> products1 = productDao1.getAll();

        try {
            FileWriter fileWriter = new FileWriter("Output2.txt");
            for (Product i : products1) {
                fileWriter.write(i + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
