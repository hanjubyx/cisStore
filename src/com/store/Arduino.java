package com.store;

class Arduino extends CISItem {

    public Arduino(String name, String location, double price, String description) {
        super(name, location, price, description);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Arduino Device: " + getName());
    }
}