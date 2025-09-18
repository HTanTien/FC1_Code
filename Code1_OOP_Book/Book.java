package Code1_OOP_Book;

import java.util.Scanner;

public abstract class Book extends IBook {

    private String id;
    private String title;
    private double basePrice;

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter title: ");
        this.title = sc.nextLine();
        System.out.print("Enter base price: ");
        this.basePrice = sc.nextDouble();
    }

    public boolean updateBookById(String id) {
        if (!this.id.equals(id)) {
            return false;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new title: ");
        this.title = sc.nextLine();
        System.out.print("Enter new base price: ");
        this.basePrice = sc.nextDouble();
        return true;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Title: " + title + ", Base Price: " + basePrice);
    }

    public abstract double calculatePrice();
}
