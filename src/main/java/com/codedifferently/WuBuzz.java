package com.codedifferently;

public class WuBuzz {
    /**
     * Write a short program that prints each number from 1 to n on a new line.
     *
     * For each multiple of 3, print "Wu" instead of the number.
     *
     * For each multiple of 5, print "Tang" instead of the number.
     *
     * For numbers which are multiples of both 3 and 5, print "WuTang Forever" instead of the number.
     * Example :
     * 1
     * 2
     * Wu
     * 4
     * Tang
     * Wu
     * 7
     * 8
     * Wu
     * Tang
     * 11
     * Wu
     * 13
     * 14
     * WuTang Forever
     */

    public String wuTangClan(int n){
        StringBuilder output = new StringBuilder();
        for(int i = 1; i <= n; i++){
            output.append(checkNumber(i)).append("\n");
        }
        return output.toString();
    }

    private String checkNumber(int number){
        if(isMultipleOfThree(number) && isMultipleOfFive(number))
            return "WuTang Forever";
        else if(isMultipleOfThree(number))
            return "Wu";
        else if(isMultipleOfFive(number))
            return "Tang";
        else
            return number+"";
    }

    private Boolean isMultipleOfThree(int number){
        return number % 3 == 0;
    }

    private Boolean isMultipleOfFive(int number){
        return number % 5 == 0;
    }
}
