package Code1_OOP_Book;
import java.util.Scanner;
public class TextBook extends Book{
    private String subject;

    public TextBook() {}

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject: ");
        this.subject = sc.nextLine();
    }

    @Override
    public boolean updateBookById(String id) {
        if (super.updateBookById(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new subject: ");
            this.subject = sc.nextLine();
            return true;
        }
        return false;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject + ", Final Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.1; 
    }
}

