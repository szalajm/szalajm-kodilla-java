package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate (ArrayList<Integer> numbers) {
        int temporaryNumber = 0;

        for(int n=0; n<numbers.size(); n++){
            temporaryNumber = numbers.get(n);
            if(temporaryNumber % 2 !=0) {
                numbers.remove(n);
            }

        }
    }
}
