/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

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
        int k=0;
        String[] keys = new String[map.size()];
        Integer[] values = new Integer[map.size()];
        Integer[] tempValues = new Integer[map.size()];
        String[] tempKeys = new String[map.size()];
        //make arrays for keys and values of map
        for (Entry<String, Integer> entry : map.entrySet()){
            keys[k] = entry.getKey();
            values[k++] = entry.getValue();
        }
        //copy array values and reverse sort
        System.arraycopy(values, 0, tempValues, 0, values.length);
        Arrays.sort(values, Collections.reverseOrder());
        //make sure keys and values arrays are matched still
        for(int i=0; i<map.size();i++){
            int value = values[i];
            for(int j=0; j<tempValues.length;j++){
                if(value == tempValues[j]){
                    tempKeys[i] = keys[j];
                    break;
                }
            }
        }
        //print the histogram
        for(int i=0;i<map.size();i++){
            int value = map.get(tempKeys[i]);
            System.out.printf("%-10s ", tempKeys[i]+":");
            for(int j=0; j<value; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
