package com.example.java;

import java.math.BigDecimal;

public class Main {

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

    }
}
