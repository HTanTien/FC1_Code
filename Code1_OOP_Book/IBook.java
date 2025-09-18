package Code1_OOP_Book;

import java.util.ArrayList;

public class IBook {

    ArrayList<IBook> bookList = new ArrayList<>();

    public void addIBook(IBook ibook) {
        ibook.addIBook(ibook);
        bookList.add(ibook);
        System.out.println("Added");
    }

    public void updateIBook(String id) {
        for (IBook ibook : bookList) {
            if (ibook.getIBookId().equals(id)) {
                ibook.updateIBook(id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deleteBookById(String id) {
        for (IBook object : bookList) {
            if (id.equals(object.getIBookId())) {
                bookList.remove(object);
                System.out.println("Deleted ID: " + id);
            } else {
                System.out.println("Not found ID: " + id);
            }
        }

    }

    public IBook findBookById(String id) {
        for (IBook ibook : bookList) {
            if (ibook.getIBookId().equals(id)) {
                return ibook;
            }
        }
        System.out.println("Not found ID: " + id);
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (IBook ibook : bookList) {
                ibook.displayAllBooks();
            }
        }
    }

    private Object getIBookId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
