package com.stackroute.pe4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceOfCharector {
    public String findOccuence(String string,String inputData) {
        if(inputData==null)
        {
            return "please provide valid string";
        }
        else
        {
    Pattern pattern= Pattern.compile(string);
        Matcher matcher=pattern.matcher(inputData);
        String result="";
        while(matcher.find())
        {
            result=result+matcher.start()+"-"+matcher.end()+" ";
        }
        return result.trim();
    }
    }

}
