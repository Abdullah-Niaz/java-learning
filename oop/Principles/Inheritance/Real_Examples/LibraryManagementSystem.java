package oop.Principles.Inheritance.Real_Examples;

class LibraryItem {
    protected String title;
    protected boolean checkoutStatus;

    public LibraryItem(String title) {
        this.title = title;
        this.checkoutStatus = false;
    }

    public void checkOut() {
        if (!checkoutStatus) {
            checkoutStatus = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        if (checkoutStatus) {
            checkoutStatus = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is not checked out.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Checked Out: " + checkoutStatus;
    }
}

class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        super(title);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Checked Out: " + checkoutStatus;
    }
}

class DVD extends LibraryItem {
    private String director;
    private String releaseDate;

    public DVD(String title, String director, String releaseDate) {
        super(title);
        this.director = director;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director + ", Release Date: " + releaseDate + ", Checked Out: " + checkoutStatus;
    }
}

class Magazine extends LibraryItem {
    private String issueDate;

    public Magazine(String title, String issueDate) {
        super(title);
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Issue Date: " + issueDate + ", Checked Out: " + checkoutStatus;
    }
}

// Example usage:
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", "2010-12-07");
        Magazine magazine1 = new Magazine("National Geographic", "September 2023");

        System.out.println(book1);
        System.out.println(dvd1);
        System.out.println(magazine1);

        book1.checkOut();
        dvd1.checkOut();
        magazine1.returnItem();
    }
}
