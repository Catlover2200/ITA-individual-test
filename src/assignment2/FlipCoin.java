package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     *
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {

        int[] coinFlipValue = {0,1};
        int randomValue =  new Random().nextInt(coinFlipValue.length);
        return randomValue;
    }
}
