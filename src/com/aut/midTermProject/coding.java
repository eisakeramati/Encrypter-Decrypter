package com.aut.midTermProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

/**
 * Created by lenovo pc on 3/26/2017.
 */

/**
 * this cclass is the heart of this project the most important of them all
 * this class's duty is to encode and decode the given array of bytes 6bit to 6bit of it
 */
public class coding {

    /**
     * this integer is used for determining the fact that after reading from a file in form of 6bit
     * at the end of the stream no bit is going to be left unused and by using OPP's features
     * a way of solving this problem is created by this integer
     */
    public int imp;


    /**
     * this constructor sets the two hashmaps that are used in the methods of the class
     */
    public coding() {
        hashmap.put(0, 'A');
        hashmap.put(26, 'a');
        hashmap.put(1, 'B');
        hashmap.put(27, 'b');
        hashmap.put(2, 'C');
        hashmap.put(3, 'D');
        hashmap.put(4, 'E');
        hashmap.put(5, 'F');
        hashmap.put(6, 'G');
        hashmap.put(7, 'H');
        hashmap.put(8, 'I');
        hashmap.put(9, 'J');
        hashmap.put(10, 'K');
        hashmap.put(11, 'L');
        hashmap.put(12, 'M');
        hashmap.put(13, 'N');
        hashmap.put(14, 'O');
        hashmap.put(15, 'P');
        hashmap.put(16, 'Q');
        hashmap.put(17, 'R');
        hashmap.put(18, 'S');
        hashmap.put(19, 'T');
        hashmap.put(20, 'U');
        hashmap.put(21, 'V');
        hashmap.put(22, 'W');
        hashmap.put(23, 'X');
        hashmap.put(24, 'Y');
        hashmap.put(25, 'Z');
        hashmap.put(28, 'c');
        hashmap.put(29, 'd');
        hashmap.put(30, 'e');
        hashmap.put(31, 'f');
        hashmap.put(32, 'g');
        hashmap.put(33, 'h');
        hashmap.put(34, 'i');
        hashmap.put(35, 'j');
        hashmap.put(36, 'k');
        hashmap.put(37, 'l');
        hashmap.put(38, 'm');
        hashmap.put(39, 'n');
        hashmap.put(40, 'o');
        hashmap.put(41, 'p');
        hashmap.put(42, 'q');
        hashmap.put(43, 'r');
        hashmap.put(44, 's');
        hashmap.put(45, 't');
        hashmap.put(46, 'u');
        hashmap.put(47, 'v');
        hashmap.put(48, 'w');
        hashmap.put(49, 'x');
        hashmap.put(50, 'y');
        hashmap.put(51, 'z');
        hashmap.put(52, '0');
        hashmap.put(53, '1');
        hashmap.put(54, '2');
        hashmap.put(55, '3');
        hashmap.put(56, '4');
        hashmap.put(57, '5');
        hashmap.put(58, '6');
        hashmap.put(59, '7');
        hashmap.put(60, '8');
        hashmap.put(61, '9');
        hashmap.put(62, '+');
        hashmap.put(63, '/');

        hashMap.put('A', 0);
        hashMap.put('B', 1);
        hashMap.put('C', 2);
        hashMap.put('D', 3);
        hashMap.put('E', 4);
        hashMap.put('F', 5);
        hashMap.put('G', 6);
        hashMap.put('H', 7);
        hashMap.put('I', 8);
        hashMap.put('J', 9);
        hashMap.put('K', 10);
        hashMap.put('L', 11);
        hashMap.put('M', 12);
        hashMap.put('N', 13);
        hashMap.put('O', 14);
        hashMap.put('P', 15);
        hashMap.put('Q', 16);
        hashMap.put('R', 17);
        hashMap.put('S', 18);
        hashMap.put('T', 19);
        hashMap.put('U', 20);
        hashMap.put('V', 21);
        hashMap.put('W', 22);
        hashMap.put('X', 23);
        hashMap.put('Y', 24);
        hashMap.put('Z', 25);
        hashMap.put('a', 26);
        hashMap.put('b', 27);
        hashMap.put('c', 28);
        hashMap.put('d', 29);
        hashMap.put('e', 30);
        hashMap.put('f', 31);
        hashMap.put('g', 32);
        hashMap.put('h', 33);
        hashMap.put('i', 34);
        hashMap.put('j', 35);
        hashMap.put('k', 36);
        hashMap.put('l', 37);
        hashMap.put('m', 38);
        hashMap.put('n', 39);
        hashMap.put('o', 40);
        hashMap.put('p', 41);
        hashMap.put('q', 42);
        hashMap.put('r', 43);
        hashMap.put('s', 44);
        hashMap.put('t', 45);
        hashMap.put('u', 46);
        hashMap.put('v', 47);
        hashMap.put('w', 48);
        hashMap.put('x', 49);
        hashMap.put('y', 50);
        hashMap.put('z', 51);
        hashMap.put('0', 52);
        hashMap.put('1', 53);
        hashMap.put('2', 54);
        hashMap.put('3', 55);
        hashMap.put('4', 56);
        hashMap.put('5', 57);
        hashMap.put('6', 58);
        hashMap.put('7', 59);
        hashMap.put('8', 60);
        hashMap.put('9', 61);
        hashMap.put('+', 62);
        hashMap.put('/', 63);


    }

    /**
     * these two hasmaps that are actually the reverse form of eachother are used in the methods
     */
    public static HashMap<Integer, Character> hashmap = new HashMap<>();
    public static HashMap<Character, Integer> hashMap = new HashMap<>();

    /**
     * this method catches the byte array given by the inputfilereader class's method and then reads it in
     * a 6bit 6bit manner described before
     * @param buffer is the byte array given by the inputfilereader class's method
     * @return returns the encoded form of that array to the rest of the code
     */
    public char[] encoder(byte[] buffer) {


        if ((buffer.length) % 3 == 0) {
            imp = 0;
        } else if ((buffer.length) % 3 == 1) {
            imp = 1;
        } else {
            imp = 2;
        }


        int[] bitArray = new int[(buffer.length) * 8];
        int counter = 0;
        for (int i = 0; i < buffer.length; i++) {

           int n;
            if (buffer[i]<0)
                n = buffer[i]+256;
            else
                n=buffer[i];
            String string = Integer.toBinaryString(n);
            int b = Integer.parseInt(string);
           // System.out.print(b);
            bitArray[counter] = b / (int) Math.pow(10, 7);
            b = b % (int) Math.pow(10, 7);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 6);
            b = b % (int) Math.pow(10, 6);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 5);
            b = b % (int) Math.pow(10, 5);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 4);
            b = b % (int) Math.pow(10, 4);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 3);
            b = b % (int) Math.pow(10, 3);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 2);
            b = b % (int) Math.pow(10, 2);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 1);
            b = b % (int) Math.pow(10, 1);
            counter++;
            bitArray[counter] = b / (int) Math.pow(10, 0);
            b = b % (int) Math.pow(10, 0);
            counter++;


        }

        int temp = bitArray.length;

        int change = 0;
        int map = 0;
        int sub = 5;
        int sub1 = 1;
        int sub2 = 3;
        char[] m;
        if ((bitArray.length) % 6 != 0) {
            m = new char[((bitArray.length) / 6) + 1];
        } else {
            m = new char[((bitArray.length) / 6)];
        }
        int n = 0;

        while (temp > 0) {
            if (temp == 2 && imp == 1) {
                for (int i = bitArray.length-2; i < bitArray.length; i++) {
                    map += bitArray[i] * Math.pow(2, sub1);
                    sub1 -= 1;
                }
            }
           else if (temp == 4 && imp == 2) {
                for (int i = bitArray.length-4; i < bitArray.length; i++) {
                    map += bitArray[i] * Math.pow(2, sub2);
                    sub2 -= 1;
                }
            } else {
                for (int i = change; i < change + 6; i++) {
                    map += bitArray[i] * Math.pow(2, sub);
                    sub -= 1;

                }
            }


            char t = hashmap.get(map);
            temp -= 6;
            change += 6;
            sub = 5;
            sub1 = 1;
            sub2 = 3;
            m[n] = (char) hashmap.get(map);
            n++;
            map = 0;

        }


        return m;
    }


    /**
     * this method does the reverse job of the other method of the class means it catcehs the encoded decrypted array and
     * instead of the so called 6but reading it gives the array members a normal 8bit look which is readied for the
     * outputfilewriter's class methods to write it in a file
     * @param encoded
     * @return
     */
    public char[] decoder(char[] encoded) {
        int[] bitArray1;
        if (imp == 1) {
            bitArray1 = new int[(encoded.length) * 6 - 4];
        } else if (imp == 2) {
            bitArray1 = new int[(encoded.length) * 6 - 2];
        } else {
            bitArray1 = new int[(encoded.length) * 6];
        }
        int counter1 = 0;
        for (int i = 0; i < encoded.length - 1; i++) {
            int n1 = hashMap.get(encoded[i]);
            String string = Integer.toBinaryString(n1);
            int b = Integer.parseInt(string);
            bitArray1[counter1] = b / (int) Math.pow(10, 5);
            b = b % (int) Math.pow(10, 5);
            counter1++;
            bitArray1[counter1] = b / (int) Math.pow(10, 4);
            b = b % (int) Math.pow(10, 4);
            counter1++;
            bitArray1[counter1] = b / (int) Math.pow(10, 3);
            b = b % (int) Math.pow(10, 3);
            counter1++;
            bitArray1[counter1] = b / (int) Math.pow(10, 2);
            b = b % (int) Math.pow(10, 2);
            counter1++;
            bitArray1[counter1] = b / (int) Math.pow(10, 1);
            b = b % (int) Math.pow(10, 1);
            counter1++;
            bitArray1[counter1] = b / (int) Math.pow(10, 0);
            b = b % (int) Math.pow(10, 0);
            counter1++;


        }
        if (imp == 1) {
            for (int i = encoded.length - 1; i < encoded.length; i++) {
                int n1 = hashMap.get(encoded[i]);
                String string = Integer.toBinaryString(n1);
                int b = Integer.parseInt(string);
                bitArray1[counter1] = b / (int) Math.pow(10, 1);
                b = b % (int) Math.pow(10, 1);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 0);
                b = b % (int) Math.pow(10, 0);
                counter1++;

            }
        } else if (imp == 2) {
            for (int i = encoded.length - 1; i < encoded.length; i++) {
                int n1 = hashMap.get(encoded[i]);
                String string = Integer.toBinaryString(n1);
                int b = Integer.parseInt(string);
                bitArray1[counter1] = b / (int) Math.pow(10, 3);
                b = b % (int) Math.pow(10, 3);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 2);
                b = b % (int) Math.pow(10, 2);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 1);
                b = b % (int) Math.pow(10, 1);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 0);
                b = b % (int) Math.pow(10, 0);
                counter1++;
            }
        } else {
            for (int i = encoded.length - 1; i < encoded.length; i++) {
                int n1 = hashMap.get(encoded[i]);
                String string = Integer.toBinaryString(n1);
                int b = Integer.parseInt(string);
                bitArray1[counter1] = b / (int) Math.pow(10, 5);
                b = b % (int) Math.pow(10, 5);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 4);
                b = b % (int) Math.pow(10, 4);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 3);
                b = b % (int) Math.pow(10, 3);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 2);
                b = b % (int) Math.pow(10, 2);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 1);
                b = b % (int) Math.pow(10, 1);
                counter1++;
                bitArray1[counter1] = b / (int) Math.pow(10, 0);
                b = b % (int) Math.pow(10, 0);
                counter1++;
            }
        }
          /*  System.out.print("     ");
            for (int i = 0; i < bitArray1.length; i++)
                System.out.print(bitArray1[i]);*/

        int permin = 7;
        int ch = 0;
        int count = 0;
        int noBin = 0;
        int end = bitArray1.length;
        char[] fin = new char[(bitArray1.length) / 8];


        while (end > 0) {
            for (int i = ch; i < ch + 8; i++) {
                noBin += bitArray1[i] * Math.pow(2, permin);
                permin--;
            }

            ch += 8;
            end -= 8;
            permin = 7;
            fin[count] = (char) noBin;
            count++;
            noBin = 0;


        }
        /*    System.out.print("    ");
            for (int u = 0; u < fin.length; u++)
                System.out.print(fin[u]);*/
            return fin;

    }
}


