package com.stackroute.pe4;

public class CharectorReplace {
    public String replaceCharector(String string)
    {     //replace original string charector "d" with "f"
        String newString=string.replaceAll("d","f");
        //replace original string charector "d" with "f"
        String replacedString=newString.replaceAll("l","t");
        return replacedString;
    }
}
