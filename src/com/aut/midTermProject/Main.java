package com.aut.midTermProject;


import java.io.*;
import java.util.HashMap;

/**
 * the main is only used for running the program and it uses the strings in the args[] for its commands
 */
public class Main {

    public static void main(String[] args) throws MyException {


        inputFileReader in = new inputFileReader();
        coding t = new coding();
        simpleShiftCryptography s = new simpleShiftCryptography() {
            @Override
            public char[] encrypt() {
                return new char[0];
            }

            @Override
            public char[] decrypt() {
                return new char[0];
            }
        };
        complexShiftCryptography v = new complexShiftCryptography() {
            @Override
            public char[] encrypt() {
                return new char[0];
            }

            @Override
            public char[] decrypt() {
                return new char[0];
            }
        };

        outputFileReader out = new outputFileReader();
        //  out.writeToFile("C:\\test\\yos.txt", t.decoder(v.encrypt("jkltE7j", (t.encoder(in.readFromFile("C:\\test\\Data3.txt"))))));
        //out.writeToFile("C:\\test\\yes.txt", t.decoder(v.decrypt("jkltE7j", (t.encoder(in.readFromFile("C:\\test\\yos.txt"))))));


        String inputFileAd = "C:\\project\\begining.txt";
        String outputFileAd = "C:\\project\\result.txt";
        int key1 = 0;
        String key2 = "A";
        int temp = 0;
        int imp = 0;
        int makeSure = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-es")) {
                imp = 0;
            } else if (args[i].equals("-ds")) {
                imp = 1;
            } else if (args[i].equals("-ec")) {
                imp = 2;
            } else if (args[i].equals("-dc")) {
                imp = 3;
            }
        }


        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-i")) {
                temp++;
            }
        }
        if (temp == 0) {

            temp = 0;
            throw new MyException("There was no '-i' in your given statement");
        }


        for (int i = 0; i < args.length; i++) {

            if (args[i] != "-es" || args[i] != "-ec" || args[i] != "-ds" || args[i] != "-dc") {
                temp++;

            }
        }
        if (temp != args.length + 1) {
            temp = 0;
            throw new MyException("wrong statement");
        }

        for (int i = 0; i < args.length; i++) {

            for (int j = 0; j < args.length; j++) {
                if ((args[i].equals("-es") && args[j].equals("-ec")) || (args[i].equals("-es") && args[j].equals("-ds")) || (args[i].equals("-es") && args[j].equals("-dc")) || (args[i].equals("-ec") && args[j].equals("-ds")) || (args[i].equals("-es") && args[j].equals("-dc")) || (args[i].equals("-ds") && args[j].equals("-dc"))) {
                    temp++;

                }
            }
        }
        if (temp == (args.length) * (args.length) + 1) {
            temp = 0;
            throw new MyException("wrong statement");
        }


        if (imp == 0) {
            for (int i = 0; i < args.length; i++) {
                if (makeSure == 0) {
                    if (args[i].equals("-es")) {
                        key1 = Integer.parseInt(args[i + 1]);
                    }
                    for (int j = 0; j < args.length; j++) {
                        if (args[j].equals("-i")) {
                            inputFileAd = args[j + 1];
                        }
                    }
                    File file = new File(inputFileAd);
                    if (file.isFile()==true){
                    for (int k = 0; k < args.length; k++) {
                        if (args[k].equals("-o")) {
                            outputFileAd = args[k + 1];

                            out.writeToFile(outputFileAd, t.decoder(s.encrypt(key1, (t.encoder(in.readFromFile(inputFileAd))))));
                            makeSure = 1;
                        }

                    }}
                    else if (file.isDirectory()==true)
                    {
                        for (int k = 0; k < args.length; k++) {
                            if (args[k].equals("-o")) {
                                outputFileAd = args[k + 1];
                            }
                        }
                        File[] paths;
                        paths = file.listFiles();
                        int reTemp = 0;
                        while (reTemp<paths.length) {
                            String string = paths[reTemp].getPath();
                            out.writeToFile(outputFileAd, t.decoder(s.encrypt(key1, (t.encoder(in.readFromFile(string))))));
                            reTemp++;
                        }
                        makeSure=1;
                    }

                }
            }
        } else if (imp == 2) {
            for (int i = 0; i < args.length; i++) {
                if (makeSure == 0) {
                    if (args[i].equals("-ec")) {
                        key2 = args[i + 1];
                    }
                    for (int j = 0; j < args.length; j++) {
                        if (args[j].equals("-i")) {
                            inputFileAd = args[j + 1];

                        }
                    }
                    File file = new File(inputFileAd);
                    if (file.isFile()==true){
                    for (int k = 0; k < args.length; k++) {
                        if (args[k].equals("-o")) {
                            outputFileAd = args[k + 1];

                            out.writeToFile(outputFileAd, t.decoder(v.encrypt(key2, (t.encoder(in.readFromFile(inputFileAd))))));
                            makeSure = 1;
                        }

                    }}
                    else if (file.isDirectory()==true)
                    {

                        for (int k = 0; k < args.length; k++) {
                            if (args[k].equals("-o")) {
                                outputFileAd = args[k + 1];
                            }
                        }
                        File[] paths;
                        paths = file.listFiles();
                        int reTemp = 0;
                        while (reTemp<paths.length) {
                            String string = paths[reTemp].getPath();
                            out.writeToFile(outputFileAd, t.decoder(s.encrypt(key1, (t.encoder(in.readFromFile(string))))));
                            reTemp++;
                        }
                        makeSure=1;
                    }

                }
            }
        } else if (imp == 1) {
            for (int i = 0; i < args.length; i++) {
                if (makeSure == 0) {
                    if (args[i].equals("-ds")) {
                        key1 = Integer.parseInt(args[i + 1]);
                    }
                    for (int j = 0; j < args.length; j++) {
                        if (args[j].equals("-i")) {
                            inputFileAd = args[j + 1];

                        }
                    }
                    for (int k = 0; k < args.length; k++) {
                        if (args[k].equals("-o")) {
                            outputFileAd = args[k + 1];

                            out.writeToFile(outputFileAd, t.decoder(s.decrypt(key1, (t.encoder(in.readFromFile(inputFileAd))))));
                            makeSure = 1;
                        }

                    }

                }
            }
        } else if (imp == 3) {
            for (int i = 0; i < args.length; i++) {
                if (makeSure == 0) {
                    if (args[i].equals("-dc")) {
                        key2 = args[i + 1];
                    }
                    for (int j = 0; j < args.length; j++) {
                        if (args[j].equals("-i")) {
                            inputFileAd = args[j + 1];

                        }
                    }
                    for (int k = 0; k < args.length; k++) {
                        if (args[k].equals("-o")) {
                            outputFileAd = args[k + 1];

                            out.writeToFile(outputFileAd, t.decoder(v.decrypt(key2, (t.encoder(in.readFromFile(inputFileAd))))));
                            makeSure = 1;
                        }

                    }

                }
            }


        }

        for (int p = 0; p < args.length; p++) {

            if (args[p].equals("-r")) {
                File f = new File(inputFileAd);
                f.delete();
            }
        }

    }

}
