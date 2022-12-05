package com.ronin;

public class Main {

    public static void main(String[] args) {

        PremiumProduct premiumProduct=new PremiumProduct(
                "E"
                ,"Red",
                -15,
                10,
                -12,
                - 12.0);

        System.out.println("Product Info : ");
        premiumProduct.showProductInfo();

        Product_Controller uController=new Product_Controller();

        System.out.println("Product Controller is controlling ");

        if(!uController.isTypeAvailable(premiumProduct)){
            System.out.println("Product type can't be less than 2 character");
        }

        if(!uController.isLengthAvailable(premiumProduct)){
            System.out.println("Product length can't be less than 0 ");
        }

        if(!uController.isWidthAvailable(premiumProduct)){
            System.out.println("Product length can't be less than 0 ");
        }
        if (!uController.isWeightAvailable(premiumProduct)){
            System.out.println("Product length can't be less than 0 ");
        }
        if (!uController.isProductPrice(premiumProduct)){
            System.out.println("Product price can't be less than 0");
        }
    }




}
