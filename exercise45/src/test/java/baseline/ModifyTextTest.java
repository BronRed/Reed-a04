/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brian Reed
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ModifyTextTest {
    @Test
    void createFileTest(){
        ModifyText mt = new ModifyText();
        mt.path = "data/";
        File file = mt.createFile();
        assertTrue(file.exists());
    }
}