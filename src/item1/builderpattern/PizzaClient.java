package item1.builderpattern;

import static item1.builderpattern.NyPizza.Size.*;
import static item1.builderpattern.Pizza.Topping.*;


public class PizzaClient {
    public static void main(String[] args) {

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
    }
}
