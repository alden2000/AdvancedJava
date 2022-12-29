package org.example.Vjezbe.UserData2;

public class Product {
    private int productId;
    private String name;
    private int quantitiINStock;
    private double UnitPrice;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantitiINStock() {
        return quantitiINStock;
    }

    public void setQuantitiINStock(int quantitiINStock) {
        this.quantitiINStock = quantitiINStock;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", quantitiINStock=" + quantitiINStock +
                ", UnitPrice=" + UnitPrice +
                ", price=" + price +
                '}';
    }
}
