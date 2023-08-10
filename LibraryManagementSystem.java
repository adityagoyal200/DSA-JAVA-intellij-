import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}

class Patron {
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patron: " + name;
    }
}

class LibrarySystem {
    private Map<Book, Patron> library;

    public LibrarySystem() {
        library = new HashMap<>();
    }

    public void addBook(Book book, Patron patron) {
        library.put(book, patron);
    }

    public void removeBook(Book book) {
        library.remove(book);
    }

    public void updatePatron(Book book, Patron patron) {
        library.replace(book, patron);
    }

    public void printLibrary() {
        System.out.println("Library Contents:");
        for (Map.Entry<Book, Patron> entry : library.entrySet()) {
            Book book = entry.getKey();
            Patron patron = entry.getValue();
            System.out.println(book + " - " + patron);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Library Management System ====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Patron");
            System.out.println("4. Print Library Contents");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter patron name: ");
                    String patronName = scanner.nextLine();

                    Book newBook = new Book(title, author);
                    Patron newPatron = new Patron(patronName);
                    librarySystem.addBook(newBook, newPatron);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String removeTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String removeAuthor = scanner.nextLine();

                    Book removeBook = new Book(removeTitle, removeAuthor);
                    librarySystem.removeBook(removeBook);
                    System.out.println("Book removed successfully!");
                    break;
                case 3:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String updateAuthor = scanner.nextLine();
                    System.out.print("Enter patron name: ");
                    String updatedPatronName = scanner.nextLine();

                    Book updateBook = new Book(updateTitle, updateAuthor);
                    Patron updatedPatron = new Patron(updatedPatronName);
                    librarySystem.updatePatron(updateBook, updatedPatron);
                    System.out.println("Patron updated successfully!");
                    break;
                case 4:
                    librarySystem.printLibrary();
                    break;
                case 0:
                    System.out.println("Exiting Library Management System...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
