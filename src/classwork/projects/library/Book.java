package classwork.projects.library;

import java.util.ArrayList;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private double averageRating;
    private boolean isAvailable;
    private ArrayList<Double> ratings; // ratings for book

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
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

    public void calculateRating() {
        double sum = 0;
        for(double rating : ratings) {
            sum += rating;
        }
        System.out.println("Average rating for book: " + sum/ratings.size());
    }

    public void addRating(double rating) {
        ratings.add(rating);
    }

    // Method to display book details
    public void display() {
        System.out.println("Book: " + title + " | book id: " + bookId + " | author: " + author + " | rating: " + averageRating);
    }
}
