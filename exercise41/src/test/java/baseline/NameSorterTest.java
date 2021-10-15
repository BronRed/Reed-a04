package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    @Test
    void readNamesTest() throws FileNotFoundException {
        NameSorter ns = new NameSorter();
        ArrayList<String> sortedList = new ArrayList<>();
        sortedList.add("Johnson, Jim");
        sortedList.add("Jones, Aaron");
        sortedList.add("Jones, Chris");
        sortedList.add("Ling, Mai");
        sortedList.add("Swift, Geoffrey");
        sortedList.add("Xiong, Fong");
        sortedList.add("Zarnecki, Sabrina");
        ns.readNames();
        assertEquals(sortedList, ns.names);
    }
}