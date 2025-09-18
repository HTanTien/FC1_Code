
package Code1_OOP_Book;
import java.util.Scanner;
public class ReferenceBook extends Book{
    private String publisher;

    public ReferenceBook() {}

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter publisher: ");
        this.publisher = sc.nextLine();
    }

    @Override
    public boolean updateBookById(String id) {
        if (super.updateBookById(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new publisher: ");
            this.publisher = sc.nextLine();
            return true;
        }
        return false;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Publisher: " + publisher + ", Final Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2; // +20%
    }
}

