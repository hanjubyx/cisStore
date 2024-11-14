package com.store;

class Magazine extends ReadingItem {
    private String coverStory;

    public Magazine(String coverStory, String location, double price, String description, int wordCount) {
        super("Magazine", location, price, description, wordCount);
        this.coverStory = coverStory;
    }

    public String getCoverStory() {
        return coverStory;
    }

    public void setCoverStory(String coverStory) {
        this.coverStory = coverStory;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cover Story: " + coverStory);
    }
}