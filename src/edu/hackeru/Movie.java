package edu.hackeru;

import java.util.Arrays;

/**
 * Created by hackeru on 20/03/2017.
 */
public class Movie {
    //properties
    private String title;
    private String image;
    private int releaseYear;
    private double rating;
    private String[] genre;

    //Constructors:
    //empty Constructor
    public Movie() {
    }
    //full Constructor
    public Movie(String title, String image, int releaseYear, double rating, String[] genre) {
        this.title = title;
        this.image = image;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
    }

    //Getters And Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", genre=" + Arrays.toString(genre) +
                '}';
    }
}
