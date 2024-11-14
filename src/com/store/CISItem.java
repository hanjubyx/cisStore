package com.store;

class CISItem {
    private String name;
    private String location;
    private double price;
    private String description;

    public CISItem(String name, String location, double price, String description) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInfo() {
        System.out.println("Item Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }
}