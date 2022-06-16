package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class TDDLoops01Test {
    TDDLoops01 numbers;

    @BeforeEach
    public void init(){
        numbers = new TDDLoops01();
    }

    @Test
    public void oneToTenTest(){
        //: Given
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
        String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

        String actual = numbers.oddNumbers();
        //: Then

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void squaresTest(){
        //: Given
        String expected =
                "squares()\n*** Output ***" +
                        "\n1\n4\n9\n16\n25\n36\n" +
                        "49\n64\n81\n100\n121\n144\n" +
                        "169\n196\n225\n256\n289\n324\n" +
                        "361\n400\n441\n484\n529\n576\n625";
        //: When
        String actual = numbers.squares();
        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void evenTest(){
        //: When
        String expected = "even()\n*** Output ***" + "\ntrue";
        String actual = numbers.even(2);
        //: Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void powersTest(){
        //: When
        String expected = "powers()\n*** Output ***";
        for(int i = 1; i < 101; i++){
            expected += "\n" + ((double) i);
        }
        String actual = numbers.powers(1);
        //: Then
        Assertions.assertEquals(expected, actual);
    }
}
