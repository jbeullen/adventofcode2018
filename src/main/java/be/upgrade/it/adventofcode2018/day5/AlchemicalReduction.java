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
        String output = alchemicalReduction.processFullPolymerReactions(input);

        System.out.println("Solution Part 1: "+output.length());

        String shortest = input;
        for (int i = 0; i < 26; i++) {
            char[] chars = alchemicalReduction.calculateCombination(i);

            String clean = alchemicalReduction.removeCombination(input, chars);

            String out = alchemicalReduction.processFullPolymerReactions(clean);
            if(out.length() < shortest.length()){
                shortest = out;
            }
        }

        System.out.println("Solution Part 2: "+shortest.length());

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

    public String processFullPolymerReactions(String input){
        boolean keepGoing = true;
        String toProcess = input;
        while(keepGoing){
            String output = processReactions(toProcess);
            if(StringUtils.equals(output, toProcess)){
                keepGoing = false;
            } else {
                toProcess = output;
            }
        }

        return toProcess;
    }

    public String removeCombination(String input, char[] chars){
        String output = input;
        for (char c : chars) {
            output = StringUtils.remove(output, c);
        }
        return output;
    }

    public char[] calculateCombination(int i){
        int upperHash = 65+i;
        int lowerHash = upperHash+32;
        char[] chars = new char[2];
        chars[0] = (char) upperHash;
        chars[1] = (char) lowerHash;

        return chars;
    }
}
