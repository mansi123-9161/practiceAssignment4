package com.stackroute.pe4;

public class OccurenceOfCharector {
    public int countOccurence(String string){
        int stringLength=string.length();
        int stringWithoutThatCharector=string.replaceAll("a","").length();
        int charectorCount=stringLength-stringWithoutThatCharector;
        return charectorCount;
    }
}
