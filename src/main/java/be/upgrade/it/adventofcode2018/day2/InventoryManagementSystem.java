package be.upgrade.it.adventofcode2018.day2;

import be.upgrade.it.adventofcode2018.CommonUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryManagementSystem {
    public static final String INPUT = "day2/input.txt";

    public static void main(String[] args) {
        String[] input = CommonUtils.resourceToStringList(INPUT);
        List<BoxID> collect = Arrays.stream(input).map(s -> new BoxID(s)).collect(Collectors.toList());

        int doubles = 0;
        int triples = 0;
        for (BoxID b: collect){
            if(b.containsDoubleChar()){
                doubles++;
            }
            if(b.containsTripleChar()){
                triples++;
            }
        }

        int checksum = doubles * triples;

        System.out.println("Solution Part 1: "+checksum);


        for (String s1:input){
            for (String s2: input){
                int count = 0;
                int wrongIndex = 0;
                char[] chars1 = s1.toCharArray();
                char[] chars2 = s2.toCharArray();

                for (int i = 0; i < chars1.length; i++) {
                    if(chars1[i] != chars2[i]){
                        count++;
                        wrongIndex = i;
                    }
                }

                if(count == 1){
                    StringBuffer b = new StringBuffer(s1);
                    b.deleteCharAt(wrongIndex);
                    System.out.println("Solution Part 2: "+b.toString());
                    return;
                }
            }
        }
    }
}
