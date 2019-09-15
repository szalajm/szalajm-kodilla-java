package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authentificator {
    public boolean isAutheticated(Long userId){
        Random random = new Random();
        return random.nextBoolean();
    }
}
