package com.evandrooliveira.main;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by eso on 15/06/16.
 */
public class ChangeCombinationTest {

    @Test
    public void onePossibleCombination() {

        assertEquals(1, new ChangeCombination().function(3, Lists.newArrayList(1)));
    }

    @Test
    public void twoPossibleCombinations() {

        assertEquals(2, new ChangeCombination().function(3, Lists.newArrayList(1, 2)));
    }

    @Test
    public void threePossibleCombinations() {

        assertEquals(3, new ChangeCombination().function(3, Lists.newArrayList(1, 2, 3)));
    }
}
