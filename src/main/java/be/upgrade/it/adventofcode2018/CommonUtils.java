package be.upgrade.it.adventofcode2018;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CommonUtils {
    public static String[] resourceToStringList(String resource){
        try (Stream<String> stream = Files.lines(Paths.get(ClassLoader.getSystemResource(resource).toURI()))) {

            return stream.toArray(String[]::new);

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return new String[]{};
    }
}
