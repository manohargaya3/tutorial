package com.manohar.tutorial;

public class CountHighestNoOfRepetition {
    public static void main(String args[]){
        int[] input = {1, 1, 2, 1, 3, 1, 1, 1, 4, 5, 1, 1};
        int count = 0;
        int maxCount = 0;
        for(int i: input){
            if(i==1){
                count = count + 1;
            }
            else {
                if(maxCount<count)
                    maxCount = count;
                count = 0;
            }
            if(maxCount<count)
                maxCount = count;

        }
        System.out.println(maxCount);
    }
}
