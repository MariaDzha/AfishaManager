package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {
    @Test
    public void getMoviesOverLimit() {
        Movie movie1 = new Movie(1, "Bloodshot", "action movie", "img1");
        Movie movie2 = new Movie(2, "Onward", "cartoon", "img2");
        Movie movie3 = new Movie(3, "Hotel Beograd", "comedy", "img3");
        Movie movie4 = new Movie(4, "The Gentlemen", "action movie", "img4");
        Movie movie5 = new Movie(5, "The Invisible Man", "horror", "img5");
        Movie movie6 = new Movie(6, "Trolls World Tour", "cartoon", "img6");
        Movie movie7 = new Movie(7, "Number One", "comedy", "img7");

        MovieManager movieManager = new MovieManager(3);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);
        movieManager.addMovie(movie4);

        Movie[] lastMovies = movieManager.getMovies();
        int expected = 3;
        int actual = lastMovies.length;
        assertEquals(expected, actual);
    }

    @Test
    public void getMoviesOverLimitNoArgConstructor() {
        Movie movie1 = new Movie(1, "Bloodshot", "action movie", "img1");
        Movie movie2 = new Movie(2, "Onward", "cartoon", "img2");
        Movie movie3 = new Movie(3, "Hotel Beograd", "comedy", "img3");
        Movie movie4 = new Movie(4, "The Gentlemen", "action movie", "img4");
        Movie movie5 = new Movie(5, "The Invisible Man", "horror", "img5");
        Movie movie6 = new Movie(6, "Trolls World Tour", "cartoon", "img6");
        Movie movie7 = new Movie(7, "Number One", "comedy", "img7");
        Movie movie8 = new Movie(8, "King’s Man", "action movie", "img8");
        Movie movie9 = new Movie(9, "Nightmare Alley", "drama", "img9");
        Movie movie10 = new Movie(10, "Spider-Man", "action movie", "img10");
        Movie movie11 = new Movie(11, "The 355", "action movie", "img11");

        MovieManager movieManager = new MovieManager();
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        movieManager.addMovie(movie3);
        movieManager.addMovie(movie4);
        movieManager.addMovie(movie5);
        movieManager.addMovie(movie6);
        movieManager.addMovie(movie7);
        movieManager.addMovie(movie8);
        movieManager.addMovie(movie9);
        movieManager.addMovie(movie10);
        movieManager.addMovie(movie11);

        Movie[] lastMovies = movieManager.getMovies();
        int expected = 10;
        int actual = lastMovies.length;
        assertEquals(expected, actual);
    }

    @Test
    public void getMoviesBelowLimit() {
        Movie movie1 = new Movie(1, "Bloodshot", "action movie", "img1");
        Movie movie2 = new Movie(2, "Onward", "cartoon", "img2");
        MovieManager movieManager = new MovieManager(3);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);
        Movie[] lastMovies = movieManager.getMovies();
        int expected = 2;
        int actual = lastMovies.length;
        assertEquals(expected, actual);
    }
}