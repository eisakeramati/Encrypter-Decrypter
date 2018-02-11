package com.aut.midTermProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;

/**
 * Created by lenovo pc on 3/26/2017.
 */

/**
 * this class is used for reading from a file byte-wise and the rest of the work is done by other classes
 */
public class inputFileReader {

    /**
     * this array is the only field of the class
     * it is filled with the characters of the file that is read beofre
     */
    public byte[] Buffer;

    /**
     * this method catches the adress of the file in String form in the argument and after filling the byte array
     * @param string this string which is the argument is the adress of the file going to be read
     * @return this is the byte array returned that can hold the characters of the file in form of byte
     */
    public byte[] readFromFile(String string) {
        try {
            File F = new File(string);
            FileInputStream fis = new FileInputStream(F.getPath());
            Buffer = new byte[(int) F.length()];
            fis.read(Buffer);
            fis.close();
        }catch (IOException ex)
        {
            System.out.print(ex.getMessage());
        }

        return Buffer;
    }
}
