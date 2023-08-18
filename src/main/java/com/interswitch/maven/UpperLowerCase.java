package com.interswitch.maven;

public class UpperLowerCase {
    public String wordToUpperCase(String text){
        if(null !=text && !text.isEmpty()){
            String[] words=text.split(" ");
            return words[0].toUpperCase();
        }
        throw new IllegalArgumentException("Word cannot be empty or null");
    }

    public String wordToLowerCase(String text){
        if(null !=text && !text.isEmpty()){
            String[] words=text.split(" ");
            return words[0].toLowerCase();
        }
        throw new IllegalArgumentException("Word cannot be empty or null");
    }
}
