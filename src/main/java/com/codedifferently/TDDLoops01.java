package com.codedifferently;

public class TDDLoops01 {
    public String oneToTen(){
        String output ="oneToTen()\n"
                +"*** Output ***";
        for(int x=1; x<=10; x++){
            output += "\n"+x;
        }
        return output;
    }

    public String oddNumbers(){
        String output = "oddNumbers()\n"
                +"*** Output ***";
        for(int x =1; x < 20 ; x+=2){
            output += "\n"+x;
        }

        return output;
    }

    //Output the numbers from 1 to 25 squared using the above format.
    public String squares(){
        String output = "squares()\n"
                + "*** Output ***";
        for(int i = 1; i < 26; i++){
            output += "\n" + (i * i);
        }
        return output;
    }

    /*Take value of n and see if its even. Return a String
    if it is even or not.*/
    public String even(int n){
        String output = "even()\n"
                + "*** Output ***";
        return (n % 2 == 0) ? output + "\ntrue" : "\nfalse";
    }

    /*
    Return numbers from 1 to 100 raised to the power of n.
    */
    public String powers(int n){
        String output = "powers()\n"
                + "*** Output ***";
        for(int i = 1; i < 101; i++){
            output += "\n" + (Math.pow(i, n));
        }
        return output;
    }
}