package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class fileReader {
    public static void main(String[] args) {
        int min = new fileReader().findSmallestTemperature("weather.dat");
        System.out.println(min);

    }

    public int findSmallestTemperature(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/"+filename));
            int minSpreed = 1000;
            int minDay = 0;

            for (int i=2;i<lines.size()-1;i++){
                int day=Integer.parseInt(lines.get(i).substring(2,4).trim());
                int min=Integer.parseInt(lines.get(i).substring(12,14).trim());
                int max=Integer.parseInt(lines.get(i).substring(6,8).trim());

                int spreed = max-min;
                if (minSpreed>spreed){
                    minSpreed =spreed;
                    minDay = day;
                }
            }
            return minDay;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
