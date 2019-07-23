package com.stackroute.pe4;

public class CharectorReplace {
    public String replaceCharector(String string)
    {
        String newString=string.replaceAll("d","f");
        String replacedString=newString.replaceAll("l","t");
        return replacedString;
    }
}
