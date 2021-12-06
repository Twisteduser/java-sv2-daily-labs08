package day05;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    @Test
    void testFindSmallestDifference() {
        String filename = "football.dat";
        assertEquals("Aston_Villa", new FileReader().findSmallestTeamDifference(filename));
    }

    @Test
    void testFindSmallestDifferenceFileNotExists() {
        IllegalStateException err = assertThrows(IllegalStateException.class,
                () -> new FileReader().findSmallestTeamDifference("filename"));
        assertEquals("Cannot read file", err.getMessage());
    }
}