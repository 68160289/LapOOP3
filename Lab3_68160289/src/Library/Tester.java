package Library;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Book[] books = {
                new Book("100", "Programming", "John"),
                new Book("200", "Object-Oriented Programming", "May"),
                new Book("300", "Graphic", "Marry"),
                new Book("400", "Statistics", "Martin"),
                new Book("500", "Database", "John")
        };
        Library lib = new Library(books);
        lib.showAllBook();
        while (true) {
            System.out.println("<<< Enter the number what do you want to do ===>");
            System.out.println("1. Borrow a book.");
            System.out.println("2. Return a book.");
            System.out.println("3. Search a book.");
            System.out.println("q. Quit the system.");
            System.out.print("Select = ");

            String select = kb.nextLine();

            if (select.equals("1")) {
                System.out.print("Enter [id/title] of book : ");
                lib.borrowBook(kb.nextLine());
            } else if (select.equals("2")) {
                System.out.print("Enter [id/title] of book : ");
                lib.returnBook(kb.nextLine());
            } else if (select.equals("3")) {
                System.out.print("Enter [id/title] of book : ");
                String key = kb.nextLine();
                int index = lib.searchBook(key);
                if (index == -1) {
                    System.out.println("Don't have this book");
                } else {
                    System.out.println(books[index]);
                }
            } else if (select.equals("q")) {
                System.out.println("Thank you");
                break;
            } else {
                System.out.println("Input invalid, try again");
            }
        }
    }
}
