package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {
        String name = new FileReader().findSmallestTeamDifference("football.dat");
        System.out.println(name);
    }

    public String findSmallestTeamDifference(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/" + filename));
            int minDifference = 1000;
            String minName = null;


            for (int i = 1; i < lines.size(); i++) {
                if (i != 18) {
                    String name = lines.get(i).substring(7, 22).trim();
                    int min = Integer.parseInt(lines.get(i).substring(43, 45).trim());
                    int max = Integer.parseInt(lines.get(i).substring(50, 52).trim());

                    int spreed = Math.abs(max - min);
                    if (minDifference > spreed) {
                        minDifference = spreed;
                        minName = name;
                    }
                }

            }
            return minName;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
