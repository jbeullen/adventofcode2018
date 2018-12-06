package be.upgrade.it.adventofcode2018.day5;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlchemicalReductionTest {
    private AlchemicalReduction alchemicalReduction = new AlchemicalReduction();

    @Test
    public void processReactions() {
        String output1 = alchemicalReduction.processReactions("aA");
        assertEquals(output1, "");

        String output2 = alchemicalReduction.processReactions("dabAcCaCBAcCcaDA");
        assertEquals(output2, "dabAaCBAcaDA");
    }

    @Test
    public void removeCombination() {
        String output1 = alchemicalReduction.removeCombination("Aa", new char[]{'a','A'});
        assertEquals(output1, "");

        String output2 = alchemicalReduction.removeCombination("dabAcCaCBAcCcaDA", new char[]{'a','A'});
        assertEquals(output2, "dbcCCBcCcD");

    }
}