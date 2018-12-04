package be.upgrade.it.adventofcode2018.day3;

import be.upgrade.it.adventofcode2018.CommonUtils;

import java.util.Arrays;

public class NoMatterHowYouSliceIt {
    public static final String INPUT = "day3/input.txt";

    public static void main(String[] args) {
        String[] input = CommonUtils.resourceToStringList(INPUT);
        PieceOfFabric pieceOfFabric = new PieceOfFabric();
        Arrays.stream(input).map(s -> new Claim(s)).forEach(c -> pieceOfFabric.claim(c));
        int overlap = pieceOfFabric.calculateOverlap();

        System.out.println("Solution Part 1: "+overlap);
    }
}
