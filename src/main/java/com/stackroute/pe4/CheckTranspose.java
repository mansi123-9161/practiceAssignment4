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
//        for(int i=0;i<transpose.length;i++)
//        {
//            List<String> listValue= Arrays.asList(transpose[i].split(" "));
//            Collections.reverse(listValue);
//          //  Object[] objArr = listValue.toArray();
//            // Iterating and converting to String
//          //  for (Object obj : objArr) {
//            //result[i++] = (String)obj;
//            result=result+String.join(" ",listValue)+" ";
//            }
//
//       // return result.toString();
//        return result.trim();
//    }
        // this method trasposes the input string
        String res = "";
        for (int i = 0; i < transpose.length; i++) {
            List<String> transposedString = Arrays.asList(transpose[i].split(""));
            Collections.reverse(transposedString);
            res = res + String.join("", transposedString) + " ";
        }
        return res.trim();
    }
}
