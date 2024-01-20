package lesson11.classwork.library;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private int publishYear;

    public Book() {
    }

    public Book(String title, String author, int isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || !getClass().equals(o.getClass())) return false;
        Book book = (Book) o;
        if(!title.equals(book.title)) return false;
        if(!author.equals(book.getAuthor())) return false;
        if(isbn != book.isbn) return false;
        return publishYear == book.publishYear;
    }

    @Override
    public int hashCode() {
        int result = title == null ? 0 : title.hashCode();
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + isbn;
        result = 31 * result + publishYear;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", publishYear=" + publishYear +
                '}';
    }
}
