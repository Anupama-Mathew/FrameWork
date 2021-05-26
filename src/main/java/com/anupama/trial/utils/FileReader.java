package com.anupama.trial.utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


    class contentReader {
        public static void main(String[] args) {

            BufferedReader br = null;

            try {

                String sCurrentLine;

                br = new BufferedReader(new FileReader("C:\\Users\\Anupama Mathew\\Desktop\\Contentfile.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            }

        }


