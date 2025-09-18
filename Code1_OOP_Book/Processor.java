package Code1_OOP_Book;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("\n===== BOOK MENU =====");
            System.out.println("1. Add a TextBook");
            System.out.println("2. Add a ReferenceBook");
            System.out.println("3. Update a Book by ID");
            System.out.println("4. Delete a Book by ID");
            System.out.println("5. Find a Book by ID");
            System.out.println("6. Display all Books");
            System.out.println("7. Find the most expensive Book");
            System.out.println("8. Count TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    TextBook tb = new TextBook();
                    tb.addBook();
                    bookList.addBook(tb);
                    break;
                case 2:
                    ReferenceBook rb = new ReferenceBook();
                    rb.addBook();
                    bookList.addBook(rb);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String upId = sc.nextLine();
                    if (!bookList.updateBookById(upId)) {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String delId = sc.nextLine();
                    if (bookList.deleteBookById(delId)) {
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    String findId = sc.nextLine();
                    Book found = bookList.findBookById(findId);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book expensive = bookList.findMostExpensiveBook();
                    if (expensive != null) {
                        System.out.println("Most expensive book:");
                        expensive.displayDetails();
                    } else {
                        System.out.println("No books available!");
                    }
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
