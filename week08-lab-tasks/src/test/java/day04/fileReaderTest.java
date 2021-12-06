package day04;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class fileReaderTest {
    @Test
    void testFileReader() {
        String filename = "weather.dat";
        int result = new fileReader().findSmallestTemperature(filename);
        assertEquals(14, result);
    }

    @Test
    void testFileReaderFileNotExists() {
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> new fileReader().findSmallestTemperature("filename"));
        assertEquals("Cannot read file", err.getMessage());
    }
}