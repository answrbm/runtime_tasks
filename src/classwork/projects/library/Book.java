package classwork.projects.library;

public class Book {

    private int id;
    private String title;
    private String author;
    private double rating;
    private int ratingQuantity; // quantity of ratings for book

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book: " + title + " | book id: " + id + " | author: " + author);
    }
}
