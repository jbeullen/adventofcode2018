package be.upgrade.it.adventofcode2018.day3;

import be.upgrade.it.adventofcode2018.CommonUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoMatterHowYouSliceIt {
    public static final String INPUT = "day3/input.txt";

    public static void main(String[] args) {
        String[] input = CommonUtils.resourceToStringList(INPUT);
        PieceOfFabric pieceOfFabric = new PieceOfFabric();
        List<Claim> claims = Arrays.stream(input).map(s -> new Claim(s)).collect(Collectors.toList());
        claims.stream().forEach(c -> pieceOfFabric.claim(c));
        int overlap = pieceOfFabric.calculateOverlap();

        System.out.println("Solution Part 1: "+overlap);

        for (Claim c: claims){
            if(pieceOfFabric.isClaimIntact(c)){
                System.out.println("Solution Part 2: "+c.getId());
                return;
            }
        }
    }
}
