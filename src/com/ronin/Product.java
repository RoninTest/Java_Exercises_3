package com.ronin;

abstract class Product {

    private final String product_type;
    private final String product_color;
    private final int product_length;
    private final int product_width;
    private final int product_weight;

    public Product(String product_type, String product_color, int product_length, int product_width, int product_weight) {
        this.product_type = product_type;
        this.product_color = product_color;
        this.product_length = product_length;
        this.product_width = product_width;
        this.product_weight = product_weight;
    }

    abstract void showProductInfo();

    public String getProduct_type() {
        return product_type;
    }

    public String getProduct_color() {

        return product_color;
    }

    public int getProduct_length() {

        return product_length;
    }

    public int getProduct_width() {

        return product_width;
    }

    public int getProduct_weight() {

        return product_weight;
    }
}
