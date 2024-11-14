package com.store;

import java.util.ArrayList;

class Store {
    private final ArrayList<CISItem> cisItems;

    public Store() {
        this.cisItems = new ArrayList<>();
    }

    // Add a Book to the store
    public void addBook(Book book) {
        cisItems.add(book);
    }

    // Add a Phone to the store
    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }

    // Add a Magazine to the store
    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }

    // Add an Arduino to the store
    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }

    // Update location of all phones to a new location
    public void updatePhonesLocation(String location) {
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                ((Phone) item).setLocation(location);
            }
        }
    }

    // Get all phones in the store
    public ArrayList<Phone> getAllPhones() {
        ArrayList<Phone> phones = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    // Get items by type
    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> result = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {
                result.add(item);
            }
        }
        return result;
    }

    // Update items by type and property
    public void updateItems(String itemType, String property, String value) {
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {
                if (item instanceof Phone && property.equalsIgnoreCase("location")) {
                    ((Phone) item).setLocation(value);
                }
            }
        }
    }

    // Show information for all items in the store
    public void showAllInfo() {
        for (CISItem item : cisItems) {
            item.showInfo();
        }
    }
}