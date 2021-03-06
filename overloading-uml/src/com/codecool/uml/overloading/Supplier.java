package com.codecool.uml.overloading;

public class Supplier {
    private static int id = 0;
    private String name;
    private String description;

    public Supplier(){};

    public Supplier(String name, String description){
        id++;
        this.name = name;
        this.description = description;
    };

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Supplier id: " + this.id + ", name: " + this.name + ", description: " + this.description;
    }
}
