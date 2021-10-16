/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name;
        String author;
        String CSS;
        String JS;

        //prompt for site name
        System.out.print("Site name: ");
        name = sc.nextLine();
        //prompt for author name
        System.out.print("Author: ");
        author = sc.nextLine();
        //prompt for JavaScript folder
        System.out.print("Do you want a folder for JavaScript? ");
        JS = sc.nextLine();
        //prompt for CSS folder
        System.out.print("Do you want a folder for CSS? ");
        CSS = sc.nextLine();

        SiteGenerator site = new SiteGenerator();
        site.name = name;
        site.author = author;
        //get path
        site.path = "data/";
        //create website folder
        System.out.println("Created " + site.website());
        //create HTML file
        System.out.println("Created " + site.HTMl());
        //create JS folder
        if(JS.equals("y"))
            System.out.println("Created " + site.JSFolder());
        //create CSS folder
        if(CSS.equals("y"))
            System.out.println("Created " + site.CSSFolder());
    }
}

