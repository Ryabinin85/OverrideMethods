import java.util.Objects;

public class Book {
    private final String bookTitle;
    private int published;
    private final Author author;
    public Book(String bookTitle, Author author, int published) {
        this.bookTitle = bookTitle;
        this.published = published;
        this.author = author;
    }
    public void setPublished(int published) {
        this.published = published;
    }
    public int getPublished() {
        return published;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("Название книги: %-25s Автор: %s  Год издания: %-5s\n", bookTitle, author, published );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return published == book.published && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, published, author);
    }
}
