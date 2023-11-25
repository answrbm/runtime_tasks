package classwork.projects.library;

import java.util.ArrayList;

public class Book {

    private final int bookId;
    private final String title;
    private final String author;
    private double averageRating;
    private boolean isAvailable;
    private final ArrayList<Double> ratings; // ratings for book

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.ratings = new ArrayList<>();
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void calculateRating() {
        double sum = 0;
        for(double rating : ratings) {
            sum += rating;
        }
        averageRating = sum/ratings.size();
        System.out.println("Average rating for book: " + averageRating);
    }

    public void addRating(double rating) {
        calculateRating();
        ratings.add(rating);
        System.out.println("New rating was added for book");
    }

    // Method to display book details
    public void display() {
        System.out.println("Book: " + title + " | book id: " + bookId + " | author: " + author + " | rating: " + averageRating);
    }
}
