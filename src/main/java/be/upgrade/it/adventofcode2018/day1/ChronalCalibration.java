package be.upgrade.it.adventofcode2018.day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ChronalCalibration {
    public static final String INPUT_FILE = "day1/input1.txt";

    public static void main(String[] args) {
        int[] input = {};
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(INPUT_FILE).toURI()))) {

            input = stream.mapToInt(Integer::parseInt).toArray();

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        int i = ChronalCalibration.performStaticFrequencyCalculation(input);
        System.out.println("Result for first part of puzzle:"+i);


        ChronalCalibration chronalCalibration = new ChronalCalibration();

        int j = 0;
        while (!chronalCalibration.wasFrequencyHitTwice()){
            chronalCalibration.processNextFrequencyChange(input[j]);
            j++;
            if(j > input.length - 1){
                j = 0;
            }
        }

        System.out.println("Result for second part of puzzle:"+chronalCalibration.getCurrentFrequency());

    }

    public static int performStaticFrequencyCalculation(int[] input){
        return IntStream.of(input).sum();
    }

    private int currentFrequency = 0;
    private List<Integer> previousFrequencies = new ArrayList<>();

    public void processNextFrequencyChange(int i){
        previousFrequencies.add(currentFrequency);
        currentFrequency += i;
    }

    public boolean wasFrequencyHitTwice(){
        return previousFrequencies.contains(currentFrequency);
    }

    public int getCurrentFrequency() {
        return currentFrequency;
    }
}
