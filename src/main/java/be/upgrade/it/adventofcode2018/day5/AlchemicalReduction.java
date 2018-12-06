package be.upgrade.it.adventofcode2018.day5;

import be.upgrade.it.adventofcode2018.CommonUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AlchemicalReduction {
    public static final String INPUT = "day5/input.txt";
    public static void main(String[] args) {
        String input = CommonUtils.resourceToStringList(INPUT)[0];

        AlchemicalReduction alchemicalReduction = new AlchemicalReduction();
        boolean keepGoing = true;
        String toProcess = input;
        while(keepGoing){
            String output = alchemicalReduction.processReactions(toProcess);
            if(StringUtils.equals(output, toProcess)){
                keepGoing = false;
            } else {
                toProcess = output;
            }
        }

        System.out.println("Solution Part 1: "+toProcess.length());

    }

    public String processReactions(String input){

        char[] chars = input.toCharArray();
        List<Integer> indexTracker = new ArrayList<>();

        for (int i = 0; i < chars.length - 1; i++) {
            int first = new Character(chars[i]).hashCode();
            int second = new Character(chars[i+1]).hashCode();
            int diff = first - second;

            if(diff == 32 | diff == -32){
                chars[i] = ' ';
                chars[i+1] = ' ';
            }
        }
        return StringUtils.remove(new String(chars), ' ');
    }
}
