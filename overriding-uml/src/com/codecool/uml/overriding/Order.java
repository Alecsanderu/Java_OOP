package com.codecool.uml.overriding;

public class Order implements Orderable{
    private int id;
    String status;

    public Order(){
        this.id =  (int)(Math.random() * 1000) + 1;
        this.status = "New";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }


    @Override
    public boolean checkout() {
        this.status = "Checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "paid";
        return true;
    }
}
