package org.launchcode.studio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {
HashMap<Character,Integer> characterCounts = new HashMap<>();
String str = "test string";
char[] charsInString = str.toCharArray();
for(char character:charsInString){
    if(characterCounts.containsKey(character)){
        characterCounts.put(character,characterCounts.get(character)+1);
    }
    else{
        characterCounts.put(character,1);
    }
}
for(Map.Entry<Character,Integer> characterCountMap : characterCounts.entrySet()){
    System.out.println(characterCountMap.getKey()+ ": " +characterCountMap.getValue());
        }



    }
}
