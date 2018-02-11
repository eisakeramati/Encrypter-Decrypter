package com.aut.midTermProject;

/**
 * Created by lenovo pc on 3/27/2017.
 */

/**
 * this is the first cryptography class that does it's job with the simple algorythm
 * which is called the simple shift cryptography the name is called shift because it actually uses
 * a shifting method to crypt the characters
 */
public abstract class simpleShiftCryptography extends BaseCryptography {

    /**
     * the first method of the class catches the char array encoded by the methods of coding class
     * then shifts the characters of the array by a number given in the argument according to the
     * hashmaps of the father class
     * @param key is the number given for the shifting
     * @param chars is the encoded array given by the coding class's methods
     * @return the shifted array is then returned by the method for further use
     */
    public char[] encrypt(int key, char[] chars) {
        char[] finEncrypt = new char[chars.length];
        for (int i = 0; i < chars.length-1; i++) {
            int temp = hashMap.get(chars[i]);

            if (temp >= 52 && temp <= 63) {
                finEncrypt[i] = hashmap.get(temp);
            } else {
                if (temp < 26 && temp >= 0) {
                    int temp1 = temp - key;
                    if (temp1 < 0) {
                        temp1 += 26;
                        finEncrypt[i] = hashmap.get(temp1);
                    } else {
                        finEncrypt[i] = hashmap.get(temp1);
                    }
                }
                if (temp > 25 && temp < 52) {
                    int temp1 = temp - key;
                    if (temp1 < 26) {
                        temp1 += 26;
                        finEncrypt[i] = hashmap.get(temp1);

                    } else {
                        finEncrypt[i] = hashmap.get(temp1);
                    }
                }

            }
        }
        finEncrypt[finEncrypt.length-1]=chars[chars.length-1];
        return finEncrypt;
    }


    /**
     * this method is used to do the reverse job of the above method that actually catches the encoded array the it
     * shifts it back by the number given in the argument so that the array members are normally set again ready to be
     * written in a file
     * @param key is the key for shifting back
     * @param chars is the array given to be shifted-back
     * @return the shifted-back array
     */
    public char[] decrypt(int key, char[] chars) {

        char[] findecrypt = new char[chars.length];
        for (int i = 0; i < chars.length-1; i++) {
            int temp = hashMap.get(chars[i]);
            if (temp >= 52 && temp <= 63) {

                findecrypt[i] = hashmap.get(temp);
            } else {
                if (temp < 26 && temp >= 0) {

                    int temp1 = temp + key;
                    if (temp1 > 25) {
                        temp1 -= 26;
                        findecrypt[i] = hashmap.get(temp1);

                    } else {
                        findecrypt[i] = hashmap.get(temp1);
                    }
                }
                if (temp > 25 && temp < 52) {

                    int temp1 = temp + key;
                    if (temp1 > 51) {
                        temp1 -= 26;
                        findecrypt[i] = hashmap.get(temp1);
                    } else {
                        findecrypt[i] = hashmap.get(temp1);
                    }
                }


            }
        }
        findecrypt[findecrypt.length-1]=chars[chars.length-1];
        return findecrypt;
    }

}
