public class Book {
    String title;
    String author;
    double price;

    Book() {
        System.out.println("Default Constructor: No data provided");
    }

    Book(String t, String a) {
        title = t;
        author = a;
        System.out.println("Title: " + title + ", Author: " + author);
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Wings of Fire", "A.P.J Abdul Kalam");
        Book b3 = new Book("The Alchemist", "Paulo Coelho", 399.0);
    }
}
