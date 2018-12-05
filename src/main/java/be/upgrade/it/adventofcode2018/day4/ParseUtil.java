package be.upgrade.it.adventofcode2018.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseUtil {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\[(\\d{4}+-\\d{2}+-\\d{2}+) (\\d{2}+:\\d{2}+)\\] (Guard #(\\d{4}) begins shift)|(falls asleep)|(wakes up)");
        Matcher matcher = p.matcher("[1518-08-05 00:34] Guard #3499 begins shift");
        boolean b = matcher.matches();
        System.out.println(b+" "+matcher.group(1)+" "+matcher.group(2)+" "+matcher.group(3)+" "+matcher.group(4)+" "+matcher.group(5));
    }
}
