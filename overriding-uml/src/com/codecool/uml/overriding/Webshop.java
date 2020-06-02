package com.codecool.uml.overriding;

import java.sql.SQLOutput;

public class Webshop {

    public static void main(String[] args) {
	// write your code here

        //creating order
        Order firstOrder = new Order();
        System.out.println("Order status: " + firstOrder.status);
        System.out.println("Order id: " + firstOrder.getId());

        //checkout
        CheckoutProcess firstCheckout = new CheckoutProcess();
        firstCheckout.process(firstOrder);

        //pay
        PaymentProcess firstPayment = new PaymentProcess();
        firstPayment.process(firstOrder);

        //check status again
        System.out.println(firstOrder.getStatus());
    }
}
