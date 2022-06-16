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

    public String squares(){
        return "";
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}