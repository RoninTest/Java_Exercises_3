package com.ronin;

public class PremiumProduct extends Product{

    private double product_price;

    public PremiumProduct(String product_type, String product_color, int product_length, int product_width, int product_weight, double product_price) {
        super(product_type, product_color, product_length, product_width, product_weight);
        this.product_price=product_price;
    }


    @Override
    void showProductInfo() {

        System.out.println("Premium Product Type : " + getProduct_type());
        System.out.println("Premium Product Color : " + getProduct_color());
        System.out.println("Premium Product Length : " + getProduct_length());
        System.out.println("Premium Product Width : " + getProduct_width());
        System.out.println("Premium Product Weight : " + getProduct_weight());
        System.out.println("Premium Product Price : " + getProduct_price());

    }

    public double getProduct_price() {
        return product_price;
    }
}
