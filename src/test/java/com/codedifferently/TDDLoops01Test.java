package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDLoops01Test {
    @Test
    public void oneToTenTest(){
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assertions.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
        TDDLoops01 numbers = new TDDLoops01();
        String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

        String actual = numbers.oddNumbers();
        //: Then

        Assertions.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void squaresTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void powersTest(){
        //: Given

        //: When

        //: Then
    }
}
