package com.mycompany.project;

public class bike {
    String regNo, brand;
    public bike(String regNo, String brand)
    {
        this.regNo = regNo;
        this.brand = brand;
    }
    public String display()
    {
        return("Bike - Registration No - " + regNo + ", " + "Brand - " + brand + " ");
    }
}
