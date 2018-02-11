package com.aut.midTermProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lenovo pc on 3/26/2017.
 */

/**
 * this class is individually created for writing the results of the code into a file
 */
public class outputFileReader {

    /**
     * this method catches the adress of the destination of the place that the file is going to be writen
     * @param string the adress destination of the file
     * @param ch is the array of characters that is going to be writen in the end of the process
     */
    public void writeToFile(String string, char[] ch) {
        try {
            OutputStream out = new FileOutputStream(string , true);
            for (int i = 0; i < ch.length; i++) {
                out.write((char) ch[i]);
            }
            out.close();

        }catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
}
