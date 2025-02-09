
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("Java", "HeadFirst", 200),
                new Book("Python", "Srivastav", 150),
                new Book("JavaScript", "Jhon Doe", 100)
        );

        bookList.stream().filter(book -> book.getPrice() > 100)
                .forEach(book -> System.out.println(book.getTitle() + " " + book.getAuthor()));
    }
}
