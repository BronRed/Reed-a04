/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModifyText {
    String path;
    public void readAndReplace() throws IOException {
        //FW for output
        FileWriter fw = new FileWriter(path + "exercise45_output.txt");
        File inFile = new File(path + "exercise45_input.txt");
        try (Scanner sc = new Scanner(inFile)) {
            while (sc.hasNext()) {
                String isUtilize = sc.nextLine();
                //check if new string is "utilize" and replaces with "use"
                isUtilize = isUtilize.replaceAll("utilize", "use");
                fw.write(isUtilize);
                fw.write("\n");
            }
        }
        fw.close();
    }

    public File createFile(){
        return new File(path + "exercise45_output.txt");
    }
}
