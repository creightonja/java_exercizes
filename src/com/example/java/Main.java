package com.example.java;

import java.math.BigDecimal;

//Using primitive variable types

public class Main {

    static boolean bDef;

    public static void main(String[] args) {
	    System.out.println("Hello from IDEA!");
        String aString = "Jason";
        int myVar = 1;
        System.out.println("Your name is " + aString);
        System.out.println(myVar);


        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;
        float f = 1f;
        double d = 1d;
        System.out.println("Byte: "+ b);
        System.out.println("Short: "+ sh);
        System.out.println("int: "+ i);
        System.out.println("Long: "+ l);
        System.out.println("Float: "+ f);
        System.out.println("Double: "+ d);

        double value = .012d;
        double psum = value + value + value;
        System.out.println(psum);

        String strValue = Double.toString(value);
        System.out.println(strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bigSum);

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println(intValue2);

        long longValue1 = intValue1;
        System.out.println(longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println(shortValue1);

        //Smaller memory type will convert to 0 when unsupported by range
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println(byteValue);

        //Narrowing to int from a float or double will truncate all remainder.  Output = 3.
        double doubleValue = 3.9999999d;
        int intValue4 = (int) doubleValue;
        System.out.println(intValue4);

        int intValue5 = 56;
        int intValue6 = 42;

        //Math library
        int result1 = intValue5 + intValue6;
        System.out.println("Addition: " + result1);

        int result2 = intValue5 - intValue6;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue5 * intValue6;
        System.out.println("Mulitplying: " + result3);

        double result4 = (double) intValue5 / intValue6;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue5 % intValue6;
        System.out.println("Remainder: " + result5);

        double aDoubleValue = -3.99999999;
        long rounded = Math.round(aDoubleValue);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(aDoubleValue);
        System.out.println("Absolute: " + absValue);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = !b1;
        int i1 = 0;
        boolean b4 = (i1 != 0);

        System.out.println("Value of b1 is: " + b1);
        System.out.println("Value of b2 is: " + b2);
        System.out.println("Value of b3 is: " + b3);
        System.out.println("Value of b4 is: " + b4);
        System.out.println("Default value of boolean bDef: " + bDef);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed: " + parsed);

        //Single characters are a primitive data type, strings are not
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        //Character library command
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        //Java string matching conditionals use special libary
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1.equals(s2)){
            System.out.println("Match");
        } else {
            System.out.println("No Match");
        }

        //Ternary operator var = condition ? trueValue : falseValue
        String isTrue = (b1) ? "It is True" : "It is False";
        String isFalse = (!b1) ? "It is True" : "It is False";
        System.out.println(isTrue);
        System.out.println(isFalse);

    }
}
