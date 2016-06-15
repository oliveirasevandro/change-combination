package com.evandrooliveira.main;

import java.util.List;

/**
 * Created by eso on 15/06/16.
 */
public class ChangeCombination {

    public int calculate(int amount, List<Integer> coins) {

        if (amount == 0) {
            return 1;
        }

        if (coins.isEmpty() || amount < 0) {
            return 0;
        }

        final List<Integer> tail = coins.subList(1, coins.size());
        return calculate(amount - coins.get(0), coins) + calculate(amount, tail);
    }
}
