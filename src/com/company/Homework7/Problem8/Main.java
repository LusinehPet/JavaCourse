package com.company.Homework7.Problem8;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movie[] movies = getMovies();
        Movie[] bestMovies = getBestMovies(movies);

        for (int i = 0; i < bestMovies.length; i++) {
            Movie movie = bestMovies[i];
            System.out.println(movie.getTitle());
        }
    }

    public static Movie[] getMovies() {
        Movie[] movies = new Movie[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String title = scanner.nextLine();
            Movie movie = new Movie(title, random.nextInt(10));
            movies[i] = movie;
        }
        return movies;
    }

    public static Movie[] getBestMovies(Movie[] movies) {
        Movie bestMovie = movies[0];
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() > bestMovie.getRating()) {
                bestMovie = movies[i];

            }
        }
        int count = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() == bestMovie.getRating()) {
                count++;
            }

        }

        Movie[] bestMovies = new Movie[count];
        int j = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() == bestMovie.getRating()) {
                bestMovies[j] = movies[i];
                j++;
            }
        }
        return bestMovies;
    }
}



