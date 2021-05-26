package com.anupama.trial.utils;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
public class DataGenerator {
    // display a random 5 digit number
    public static void main(String[] args){

        Random random =new Random();
        int nextInt =random.nextInt(10000);
        System.out.println("The Random 5 digit number is:"+nextInt*5);
    }
}
