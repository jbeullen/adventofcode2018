package be.upgrade.it.adventofcode2018.day3;

import org.apache.commons.lang3.StringUtils;

public class Claim {
    private String input;

    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Claim(String input) {
        this.input = input;

        String[] split = StringUtils.split(input, " ");

        String idAsString = StringUtils.substringAfter(split[0], "#");
        id = Integer.parseInt(idAsString);

        String coordinatesString = StringUtils.substringBefore(split[2], ":");
        String[] coordinates = StringUtils.split(coordinatesString, ",");
        x = Integer.parseInt(coordinates[0]);
        y = Integer.parseInt(coordinates[1]);

        String[] dimensions = StringUtils.split(split[3], "x");
        width = Integer.parseInt(dimensions[0]);
        height = Integer.parseInt(dimensions[1]);

    }

    public int getId(){
        return id;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
