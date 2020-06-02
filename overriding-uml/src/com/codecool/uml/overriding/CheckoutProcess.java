package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {
    @Override
    protected void action(Orderable item) {
        if (item.checkout()){
            System.out.println("item has been checked");
        } else {
            System.out.println("There are issues with checkout");
        }
    }
}
