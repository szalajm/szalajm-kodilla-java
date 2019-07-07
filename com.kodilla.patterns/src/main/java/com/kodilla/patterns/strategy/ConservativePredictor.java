package com.kodilla.patterns.strategy;

public class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative Predictor] buy XYZ treasures";
    }
}
