package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckTranspose
{
    public String givenTranspose(String string)
    {
        String[] transpose=string.split(" ");
        String result=null;
        // this method transposes the input string
        String res = "";
        for (int i = 0; i < transpose.length; i++) {
            //converting string array to arrayList
            List<String> transposedString = Arrays.asList(transpose[i].split(""));
            //transposing each word in list using Collections.reverse()
            Collections.reverse(transposedString);
            //after reversing words,adding them in string using String.join()
            res = res + String.join("", transposedString) + " ";
        }
        return res.trim();
    }
}
