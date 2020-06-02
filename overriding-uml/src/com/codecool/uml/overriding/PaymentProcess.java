package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {
    @Override
    protected void action(Orderable item) {
        if (item.pay()){
            System.out.println("item has been paid");
        } else {
            System.out.println("There are issues with payment");
        }
    }
}
