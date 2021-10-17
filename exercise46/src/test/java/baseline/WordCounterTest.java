/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {
    @Test
    void readFileTest() throws FileNotFoundException {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("badger", 7);
        test.put("mushroom", 2);
        test.put("snake", 1);
        WordCounter wc = new WordCounter();
        HashMap test2 = wc.readFile();
        assertEquals(test, test2);
    }
}