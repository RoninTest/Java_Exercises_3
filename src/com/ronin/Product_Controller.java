package com.ronin;

public class Product_Controller implements Controller {
    @Override
    public boolean isTypeAvailable(Product product) {

        return product.getProduct_type().length() >= 2;
    }

    @Override
    public boolean isLengthAvailable(Product product) {
        return product.getProduct_length() >= 0;
    }

    @Override
    public boolean isWidthAvailable(Product product) {
        return product.getProduct_width() >= 0;

    }

    @Override
    public boolean isWeightAvailable(Product product) {
        return product.getProduct_weight() >= 0;
    }

    @Override
    public boolean isProductPrice(PremiumProduct premiumProduct) {
        return !(premiumProduct.getProduct_price() < 0);
    }
}
