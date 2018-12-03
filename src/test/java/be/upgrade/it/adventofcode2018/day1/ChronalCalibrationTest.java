package be.upgrade.it.adventofcode2018.day1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChronalCalibrationTest {
    private int[] test1 = {1, 1, 1};
    private int[] test2 = {1, 1, -2};
    private int[] test3 = {-1, -2, -3};

    @Test
    public void performFrequencyCalculation() {
        int i1 = ChronalCalibration.performStaticFrequencyCalculation(test1);
        int i2 = ChronalCalibration.performStaticFrequencyCalculation(test2);
        int i3 = ChronalCalibration.performStaticFrequencyCalculation(test3);

        assertEquals(i1, 3);
        assertEquals(i2, 0);
        assertEquals(i3, -6);

    }

    @Test
    public void processNextFrequencyChange() {
        ChronalCalibration chronalCalibration = new ChronalCalibration();

        assertEquals(chronalCalibration.getCurrentFrequency(), 0);

        chronalCalibration.processNextFrequencyChange(-1);
        assertEquals(chronalCalibration.getCurrentFrequency(), -1);

        chronalCalibration.processNextFrequencyChange(-6);
        assertEquals(chronalCalibration.getCurrentFrequency(), -7);
    }

    @Test
    public void wasFrequencyHitTwice() {
        ChronalCalibration chronalCalibration = new ChronalCalibration();
        assertEquals(chronalCalibration.wasFrequencyHitTwice(), false);

        chronalCalibration.processNextFrequencyChange(+1);
        assertEquals(chronalCalibration.wasFrequencyHitTwice(), false);
        chronalCalibration.processNextFrequencyChange(-1);
        assertEquals(chronalCalibration.wasFrequencyHitTwice(), true);
        assertEquals(chronalCalibration.getCurrentFrequency(), 0);


    }
}