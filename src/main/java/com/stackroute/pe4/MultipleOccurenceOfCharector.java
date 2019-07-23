package com.stackroute.pe4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceOfCharector {
    public String findOccuence(String string,String inputData) {
        /* if given inputString is null */
        if(inputData==null)
        {
            return "please provide valid string";
        }
        else
        {
            /* get the instance of given pattern which you wanted to find */
    Pattern pattern= Pattern.compile(string);
            /* match the instance of given input data string */
        Matcher matcher=pattern.matcher(inputData);
        String result="";
        while(matcher.find())
        // store matched pattern index start value and end value
        {
            result=result+matcher.start()+"-"+matcher.end()+" ";
        }
        return result.trim();
    }
    }

}
