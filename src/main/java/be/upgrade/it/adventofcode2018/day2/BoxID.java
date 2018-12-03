package be.upgrade.it.adventofcode2018.day2;

import org.apache.commons.lang3.StringUtils;

public class BoxID {
    private String id;

    public BoxID(String id) {
        this.id = id;
    }

    public boolean containsDoubleChar(){
        return containsExactly(2);
    }

    public boolean containsTripleChar(){
        return containsExactly(3);
    }


    private boolean containsExactly(int times){
        char[] chars = id.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int countMatches = StringUtils.countMatches(id, chars[i]);
            if(countMatches == times){
                return true;
            }
        }
        return false;
    }
}
