package com.store;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void setNameTest() {
        CISItem item = new CISItem("Old Name", "Room 101", 29.99, "Test Description");
        assertEquals("Old Name", item.getName());

        item.setName("New Name");
        assertEquals("New Name", item.getName());
    }

    @Test
    public void setAndGetWordCountTest() {
        ReadingItem book = new Book("Java Programming", "Library", 19.99, "A book about Java", 500);
        assertEquals(500, book.getWordCount());

        book.setWordCount(600);
        assertEquals(600, book.getWordCount());
    }

    @Test
    public void addBookTest() {
        Store store = new Store();
        Book book = new Book("Java Programming", "Library", 19.99, "A book about Java", 500);
        store.addBook(book);
        assertEquals(1, store.getItems("Book").size());
    }

    @Test
    public void addMagazineTest() {
        Store store = new Store();
        Magazine magazine = new Magazine("Tech Trends", "Magazine Rack", 5.99, "A tech magazine", 300);
        store.addMagazine(magazine);
        assertEquals(1, store.getItems("Magazine").size());
    }

    @Test
    public void addArduinoTest() {
        Store store = new Store();
        Arduino arduino = new Arduino("Arduino Uno", "Electronics Shelf", 35.50, "Microcontroller");
        store.addArduino(arduino);
        assertEquals(1, store.getItems("Arduino").size());
    }

    @Test
    public void updateAndGetPhonesTest() {
        Store store = new Store();
        Phone phone1 = new Phone("iPhone", "Room 101", 999.99, "Latest iPhone");
        Phone phone2 = new Phone("Samsung", "Room 102", 799.99, "Samsung Galaxy");
        store.addPhone(phone1);
        store.addPhone(phone2);

        store.updatePhonesLocation("Room 512");

        ArrayList<Phone> phones = store.getAllPhones();
        for (Phone phone : phones) {
            assertEquals("Room 512", phone.getLocation());
        }
    }

    @Test
    public void getItemsTest() {
        Store store = new Store();
        Book book = new Book("Java Programming", "Library", 19.99, "A book about Java", 500);
        Phone phone = new Phone("iPhone", "Room 101", 999.99, "Latest iPhone");
        store.addBook(book);
        store.addPhone(phone);

        ArrayList<CISItem> books = store.getItems("Book");
        assertEquals(1, books.size());

        ArrayList<CISItem> phones = store.getItems("Phone");
        assertEquals(1, phones.size());
    }

    @Test
    public void updateItemsTest() {
        Store store = new Store();
        Phone phone1 = new Phone("iPhone", "Room 101", 999.99, "Latest iPhone");
        Phone phone2 = new Phone("Samsung", "Room 102", 799.99, "Samsung Galaxy");
        store.addPhone(phone1);
        store.addPhone(phone2);

        store.updateItems("Phone", "location", "Room 511");

        ArrayList<Phone> phones = store.getAllPhones();
        for (Phone phone : phones) {
            assertEquals("Room 511", phone.getLocation());
        }
    }

    @Test
    public void showAllInfoTest() {
        Store store = new Store();
        Book book = new Book("Java Programming", "Library", 19.99, "A book about Java", 500);
        Phone phone = new Phone("iPhone", "Room 101", 999.99, "Latest iPhone");
        store.addBook(book);
        store.addPhone(phone);

        store.showAllInfo();
        assertTrue(true);
    }
}