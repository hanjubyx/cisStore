package com.store;

class ReadingItem extends CISItem {
    private int wordCount;

    public ReadingItem(String name, String location, double price, String description, int wordCount) {
        super(name, location, price, description);
        this.wordCount = wordCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Word Count: " + wordCount);
    }
}