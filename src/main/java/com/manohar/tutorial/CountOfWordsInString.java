package com.manohar.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class CountOfWordsInString {

    public static void main(String args[]){
        String input = "this is what we know about this and this is awesome";
        Map<String, Integer> outPut = new HashMap<String, Integer>();
        String[] inputValues = input.split(" ");
        for(String inputValue : inputValues){
            if(outPut.containsKey(inputValue)){
                outPut.put(inputValue, outPut.get(inputValue)+1);
            }
            else {
                outPut.put(inputValue,1);
            }
        }
        System.out.println(outPut);
        int count = 0;
        String result = "";
        for(Map.Entry<String, Integer> outPutValue: outPut.entrySet()){
            if(count < outPutValue.getValue()){
                result = outPutValue.getKey();
                count = outPutValue.getValue();
            }
        }
        System.out.println(result);
    }
}
