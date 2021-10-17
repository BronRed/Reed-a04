/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
    //hashmap with word and # times it was used
    HashMap<String, Integer> map = new HashMap<>();

    public HashMap<String, Integer> readFile() throws FileNotFoundException {
        File file = new File("data/exercise46_input.txt");
        try (Scanner sc = new Scanner(file)) {
            //read through file and add words to hashmap
            while (sc.hasNext()) {
                String input = sc.nextLine();
                String[] arr = input.split(" ");
                for (String key : arr) {
                    if (map.containsKey(key)) {
                        //count number of times a word has been used in hashmap
                        int value = map.get(key);
                        value++;
                        map.put(key, value);
                    } else {
                        map.put(key, 1);
                    }
                }
            }
        }
        return map;
    }

    public void printMap(){
        //print out hashmap
        System.out.print(map);
    }
}
