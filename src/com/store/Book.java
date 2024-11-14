package com.store;

class Book extends ReadingItem {
    private String title;

    public Book(String title, String location, double price, String description, int wordCount) {
        super("Book", location, price, description, wordCount);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Title: " + title);
    }
}