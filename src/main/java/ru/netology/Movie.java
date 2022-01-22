package ru.netology;

public class Movie {
    private int movieID;
    private String name;
    private String genre;
    private String img;

    public Movie(int movieID, String name, String genre, String img) {
        this.movieID = movieID;
        this.name = name;
        this.genre = genre;
        this.img = img;
    }
}
