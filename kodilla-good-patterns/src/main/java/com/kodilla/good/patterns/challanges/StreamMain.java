package com.kodilla.good.patterns.challanges;
import java.util.*;
import java.util.stream.Collectors;

import com.kodilla.good.patterns.challanges.MovieStore;

public class StreamMain {
    public static void main(String[] args){
        String titles =
        MovieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!", "<<", ">>"));

        System.out.println(titles);
}
}