package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate) {};

    @Override
    public String toString() {
        return "Featured Product Category ID: " + this.getId() + ", name: " + this.getName() +
                ", department: " + this.getDepartment() + ", description: " + this.getDescription() +
                ", start date: " + this.startDate + ", end date: " + this.endDate;
    }
}
