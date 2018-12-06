package be.upgrade.it.adventofcode2018.day5;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlchemicalReductionTest {

    @Test
    public void processReactions() {
        AlchemicalReduction alchemicalReduction = new AlchemicalReduction();
        String output1 = alchemicalReduction.processReactions("aA");
        assertEquals(output1, "");

        String output2 = alchemicalReduction.processReactions("dabAcCaCBAcCcaDA");
        assertEquals(output2, "dabAaCBAcaDA");
    }
}