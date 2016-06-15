package com.evandrooliveira.main;

import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

/**
 * Created by eso on 15/06/16.
 */
public class ChangeCombinationTest {

    @Test
    public void onePossibleCombination() {

        assertEquals(1, new ChangeCombination().calculate(3, newArrayList(1)));
    }

    @Test
    public void twoPossibleCombinations() {

        assertEquals(2, new ChangeCombination().calculate(3, newArrayList(1, 2)));
    }

    @Test
    public void threePossibleCombinations() {

        assertEquals(3, new ChangeCombination().calculate(3, newArrayList(1, 2, 3)));
    }
}
