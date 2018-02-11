package com.aut.midTermProject;

import java.util.HashMap;

/**
 * Created by lenovo pc on 3/27/2017.
 */

/**
 * this class does not do much in the process of program it onlyholds and sets the
 * common features and fields inside it
 */
public abstract class BaseCryptography {

    /**
     * this constructor does a similar job like the cons of the other class like setting the hashmaps used
     * in the program
     */
    public BaseCryptography() {
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

    public static HashMap<Integer, Character> hashmap = new HashMap<>();
    public static HashMap<Character, Integer> hashMap = new HashMap<>();

    /**
     * these thw are the abstract methods which are completed in the extended class
     */
    public abstract char[] encrypt();
    public abstract char[] decrypt();

    /**
     * this method is just a normal method for printing all of an array members
     * @param c is the array gibven to it
     */
    public void print(char[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }


}
