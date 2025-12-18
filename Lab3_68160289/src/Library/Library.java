package Library;

public class Library {
    private Book[] book;

    public Library(Book[] book) {
        this.book = book;
    }

    public int searchBook(String wantB){
        for (int i = 0; i < book.length; i++) {
            if (book[i].getBookID().equals(wantB) || book[i].getTitle().equals(wantB)) {
                return i;
            }
        }
        return -1;
    }
    public void borrowBook(String wantB){
        int result = searchBook(wantB);
        if (result != -1) {
            if (book[result].getStatus()=='A'){
                System.out.println("can borrow");
                book[result].updateStatus();
            }else if (book[result].getStatus()=='U'){
                System.out.println("is borrowing Sorry!");
            }
        }else {
            System.out.println("Don't have this book");
        }
    }


    public void returnBook(String wantB){
        int result = searchBook(wantB);
        if (result != -1) {
            if (book[result].getStatus()=='A'){
                System.out.println("This book is not borrowed. Re-input again!.");
            }else if (book[result].getStatus()=='U'){
                System.out.println("Thank you, the return successful.");
                book[result].updateStatus();
            }
        }else {
            System.out.println("Don't have this book");
        }
    }
    public void showAllBook(){
        for (int i = 0; i < book.length; i++){
            System.out.println(book[i]);
        }
    }
}
