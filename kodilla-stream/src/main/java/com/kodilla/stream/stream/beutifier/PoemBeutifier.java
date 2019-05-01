package com.kodilla.stream.stream.beutifier;

public class PoemBeutifier {
    public void beutify(String poem, PeomDecorator poemDecorator) {
       String result = poemDecorator.decorate(poem);
    }
}
