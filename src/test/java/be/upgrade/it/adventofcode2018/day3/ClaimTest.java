package be.upgrade.it.adventofcode2018.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClaimTest {
    private static final String INPUT = "#123 @ 3,2: 5x4";

    private Claim claim;



    @Before
    public void setup(){
        claim = new Claim(INPUT);
    }

    @Test
    public void getId() {
        assertEquals(claim.getId(), 123);
    }

    @Test
    public void getWidth() {
        assertEquals(claim.getWidth(), 5);
    }

    @Test
    public void getHeight() {
        assertEquals(claim.getHeight(), 4);
    }

    @Test
    public void getX() {
        assertEquals(claim.getX(), 3);
    }

    @Test
    public void getY() {
        assertEquals(claim.getY(), 2);
    }
}