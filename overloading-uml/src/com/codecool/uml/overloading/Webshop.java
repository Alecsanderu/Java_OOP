package com.codecool.uml.overloading;


import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SocketHandler;

public class Webshop {

    public static void main(String[] args) {
        //creating new warehouse
        System.out.println("This is a new Warehouse");
        Warehouse Codecool = new Warehouse();
        System.out.println("Warehouse \"Codecool\" created.");
        //ading suppliers
        System.out.println("Adding Suppliers");
        Supplier one = new Supplier("one", "laptop-uri");
        System.out.println(one.toString());
        Supplier two = new Supplier("two","mouse-uri");
        System.out.println(two.toString());
        //changeing supplier two details
        two.setName("two v2");
        two.setDescription("mouse-uri.v2");
        System.out.println("Supplier Two should be changed");
        System.out.println(two.toString());
        //creating product category
        ProductCategory laptopuri = new ProductCategory("laptopuri", "electorinice", "toate laptopurile");
        System.out.println(laptopuri.toString());
        //change details
        laptopuri.setDepartment("electronice V2");
        laptopuri.setDescription("toate laptopurile V2");
        System.out.println(laptopuri.toString());

        //fetured ...
        FeaturedProductCategory laptopsfeature = new FeaturedProductCategory();
        System.out.println(laptopsfeature.toString());
        System.out.println("Scheduling.");
        Date date1 = new Date(2020,06,02);
        Date date2 = new Date(2020,06,15);
        laptopsfeature.schedule(date1, date2);
        System.out.println(laptopsfeature.toString());






    }
}
