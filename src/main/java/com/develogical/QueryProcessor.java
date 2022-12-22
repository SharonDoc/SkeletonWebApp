package com.develogical;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("name")) {
            return "SharonTest";
        }

      if(query.contains("what is")) {

       //   String intValue = query.replaceAll("[^0-9]", "");
          String[] strArray= query.split(" ");
          int[] integerArray =new int[strArray.length];
          return String.valueOf((integerArray [0] + integerArray[1]));

      }

        return "";
    }

//Which of the following numbers is the largest: 70, 4, 48?
    
}
