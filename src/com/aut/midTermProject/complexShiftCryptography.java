package com.aut.midTermProject;

/**
 * Created by lenovo pc on 3/27/2017.
 */

/**
 * same as the simple shift class this class is used for encryption and decryption
 * but the algorythm is different in this class it actually catches a string and acoording to that string's members
 * and their place in the hashmap it shifts each character in a different number
 *
 */
public abstract class complexShiftCryptography extends BaseCryptography {

    /**
     * this is the encryption method with it's string as the key for encryption and the char array
     * does exactly what is described above and returns the encrypted array readied for being written
     * @param string is the given key as a string
     * @param chars is the character array ready to be encrypted
     * @return the encrypted array
     */
    public char[] encrypt(String string, char[] chars) {
        char[] key = string.toCharArray();
        char[] finEncrypt = new char[chars.length];
        for (int i = 0; i < chars.length - 1; i++) {
            int temp2;
            if (finEncrypt.length > key.length)
                temp2 = hashMap.get(key[i % key.length]);
            else {
                temp2 = hashMap.get(key[i]);
            }
            int temp = hashMap.get(chars[i]);

            int temp1 = temp - temp2;
            if (temp1 < 0) {
                temp1 += 64;
                finEncrypt[i] = hashmap.get(temp1);
            } else {
                finEncrypt[i] = hashmap.get(temp1);
            }


        }
        finEncrypt[finEncrypt.length - 1] = chars[chars.length - 1];
        return finEncrypt;
    }

    /**
     * this method does the reverse job of the encrypt method so the same description might be sufficient
     * @param string is the key that is used for shifting back
     * @param chars is the array decrypted ready for being wrtitten
     * @return the final array
     */
    public char[] decrypt(String string, char[] chars) {
        char[] key = string.toCharArray();
        char[] findecrypt = new char[chars.length];
        for (int i = 0; i < chars.length - 1; i++) {
            int temp = hashMap.get(chars[i]);
            int temp2;
            if (findecrypt.length > key.length)
                temp2 = hashMap.get(key[i % key.length]);
            else {
                temp2 = hashMap.get(key[i]);
            }


            int temp1 = temp + temp2;
            if (temp1 > 63) {
                temp1 -= 64;
                findecrypt[i] = hashmap.get(temp1);

            } else {
                findecrypt[i] = hashmap.get(temp1);
            }

        }
        findecrypt[findecrypt.length - 1] = chars[chars.length - 1];
        return findecrypt;
    }


}
