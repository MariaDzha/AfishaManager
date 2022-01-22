package ru.netology;

public class MovieManager {
    private Movie[] movies = new Movie[1];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public MovieManager() {
        this.limit = 10;
    }

    public void addMovie(Movie movie) {
        if (movies[0] == null) {;
            movies[0] = movie;
        } else {
            Movie[] newMovies = new Movie[movies.length + 1];
            System.arraycopy(movies, 0, newMovies, 0, movies.length);
            newMovies[newMovies.length - 1] = movie;
            movies = newMovies;
        }
    }

    public Movie[] getMovies() {
        int resultLength = limit;
        if (movies.length < limit) {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
