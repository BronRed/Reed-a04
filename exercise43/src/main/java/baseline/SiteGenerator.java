/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;
import java.io.*;

public class SiteGenerator {
    String name;
    String author;
    String path;

    //creating website folder
    public String website() {
        //website directory
        String directory = path + name;
        File folder = new File(directory);
        //actually making website folder
        folder.mkdirs();
        return directory;
    }

    //creating JS folder
    public String JSFolder() {
        //JS directory
        String directory = path + name + "/js";
        File folder = new File(directory);
        //making folder
        folder.mkdirs();
        return directory;
    }

    //creating CSS folder
    public String CSSFolder() {
        //CSS directory
        String directory = path + name + "/css";
        File folder = new File(directory);
        //making folder
        folder.mkdirs();
        return directory;
    }

    //creating HTML file and contents
    public String HTMl() throws IOException {
        //HTML directory
        String directory = path + name + "/index.html";
        //contents of HTML
        String html = "<title> " + name + " </title>\n<meta> " + author + " </meta>";
        File file = new File(directory);
        //write info to file
        FileWriter fw = new FileWriter(file);
        fw.write(html);
        fw.close();
        return directory;
    }
}
