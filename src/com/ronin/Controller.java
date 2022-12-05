package com.ronin;

interface Controller {

    boolean isTypeAvailable(Product product);
    boolean isLengthAvailable(Product product);
    boolean isWidthAvailable(Product product);
    boolean isWeightAvailable(Product product);

    boolean isProductPrice(PremiumProduct premiumProduct);

}
