package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    public static final String SESAM = "SESAM";
    public static final String NO_SESAM = "NO_SESAM";
    private final String bun;

    private final Integer burgers;

    public static final String STANDARD = "STANDARD";
    public static final String TYSIAC_WYSP = "TYSIAC_WYSP";
    public static final String BARBECUE = "BARBECUE";
    private final String sauce;

    public static final String CEBULA = "CEBULA";
    public static final String SALATA = "SALATA";
    public static final String BEKON = "BEKON";
    public static final String POMIDOR = "POMIDOR";
    public static final String OGOREK = "OGOREK";
    public static final String CHILI = "CHILI";
    public static final String SER = "SER";
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private Integer burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            if(bun.equals(SESAM) || bun.equals(NO_SESAM)) {
                return this;
            } else {
                throw new IllegalStateException("Bun should be: SEZAM or NOSEZAM");
            }
        }

        public BigmacBuilder burgers (Integer burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            if (sauce.equals(STANDARD) || sauce.equals(TYSIAC_WYSP) || sauce.equals(BARBECUE)) {
                return this;
            } else {
                throw new IllegalStateException("Item unavailable");
            }
        }

        public BigmacBuilder ingredients (String ingredient){
            ingredients.add(ingredient);
            if(ingredient.equals(SALATA) ||ingredient.equals(CEBULA) || ingredient.equals(POMIDOR)
                    || ingredient.equals(OGOREK) || ingredient.equals(SER)
                    || ingredient.equals(BEKON) || ingredient.equals(CHILI)) {
                return this;
            } else {
                throw new IllegalStateException("Item unavailable");
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers,sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final Integer burgers, final String sauce, List<String> ingredients ){
        this.bun= bun;
        this.burgers=burgers;
        this.sauce=sauce;
        this.ingredients= new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
