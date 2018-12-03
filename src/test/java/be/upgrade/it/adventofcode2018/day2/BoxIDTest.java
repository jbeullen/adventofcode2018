package be.upgrade.it.adventofcode2018.day2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxIDTest {
    private String input1 = "abcdef";
    private String input2 = "bababc";
    private String input3 = "abbcde";
    private String input4 = "abcccd";
    private String input5 = "aabcdd";
    private String input6 = "abcdee";
    private String input7 = "ababab";

    @Test
    public void containsDoubleChar() {
        assertEquals(new BoxID(input1).containsDoubleChar(), false);
        assertEquals(new BoxID(input2).containsDoubleChar(), true);
        assertEquals(new BoxID(input3).containsDoubleChar(), true);
        assertEquals(new BoxID(input4).containsDoubleChar(), false);
        assertEquals(new BoxID(input5).containsDoubleChar(), true);
        assertEquals(new BoxID(input6).containsDoubleChar(), true);
        assertEquals(new BoxID(input7).containsDoubleChar(), false);
    }

    @Test
    public void containsTripleChar() {

        assertEquals(new BoxID(input1).containsTripleChar(), false);
        assertEquals(new BoxID(input2).containsTripleChar(), true);
        assertEquals(new BoxID(input3).containsTripleChar(), false);
        assertEquals(new BoxID(input4).containsTripleChar(), true);
        assertEquals(new BoxID(input5).containsTripleChar(), false);
        assertEquals(new BoxID(input6).containsTripleChar(), false);
        assertEquals(new BoxID(input7).containsTripleChar(), true);
    }
}