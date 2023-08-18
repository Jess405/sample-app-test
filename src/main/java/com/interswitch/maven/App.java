package com.interswitch.maven;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//        Calculator.chooseOperation();
        UpperLowerCase uLCase= new UpperLowerCase();
        System.out.println(uLCase.wordToLowerCase("Jessica Ogwu"));
        System.out.println(uLCase.wordToUpperCase("Hello World!"));
        System.out.println(
                "New go-home feature by backboners suggested at " + LocalDateTime.now()
        );
    }
}
