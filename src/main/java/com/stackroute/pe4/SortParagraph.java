package com.stackroute.pe4;
import java.util.StringTokenizer;
public class SortParagraph {
    public String[] paragraphSortArray(String string) {

        String paragraph[] = new String[8];
        int tokenCount = 0;

            StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
       // created paragraph array
            while (stringTokenizer.hasMoreTokens()) {
                paragraph[tokenCount] = stringTokenizer.nextToken();
                tokenCount++;
            }
                for (int i = 0; i < tokenCount; i++) {
                    for (int j = i + 1; j < tokenCount; j++) {
                        if (paragraph[j].compareToIgnoreCase(paragraph[i]) < 0) {
                            String t = paragraph[i];
                            paragraph[i] = paragraph[j];
                            paragraph[j] = t;
                        }
                    }
                }

        return paragraph;

    }

}
