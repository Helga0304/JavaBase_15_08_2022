package com.hillel.lianova.lessons.homework2;

public class Main {
    public static void main(String[] args) {

//        byte byteVariable = 127;
//        byte byteVariable2 = -128;
//
//        System.out.println(127);
//        System.out.println(byteVariable);
//        System.out.println(byteVariable2);
//
//        byteVariable = 5;
//        System.out.println(byteVariable);
//
//        short shortVariable = 32100;
//        int intVariable = 2_000_000;
//        long longVariable = 86358237569766L;
//
//        float floatVariable = 1.43546436F;
//        double doubleVariable = 1.11111111111111111111;
//
//        System.out.println();
//        System.out.println(floatVariable);
//        System.out.println(doubleVariable);
//
//        char charVariable = 'A';
//        char charVariable2 = 65;
//        char charVariable3 = '\u0407';
//
//        System.out.println(charVariable);
//        System.out.println(charVariable2);
//        System.out.println(charVariable3);
//
//        boolean booleanVariableTrue = true;
//        boolean booleanVariableFalse = false;
//
//        System.out.println(booleanVariableTrue);
//        System.out.println(booleanVariableFalse);
//
//        System.out.println();
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String( "Hello");
//        String str4 = new String( "Hello");
//
//        System.out.println(str1==str2);
//        System.out.println(str1==str3);
//        System.out.println(str3==str4);


//        final int someVariable = 250;
//
//        final double VALUE_PI = 3.14;
//
//        byte someByte = 120;
//        short someShort = someByte;
//        long someLong = someShort;
//        long someLong1 = 2561861891596189L;
//
//        char charvalueA = 'A';
//
//        int intvalue = charvalueA;
//        System.out.println(intvalue);
//
//        double someDoubleValue = someByte;
//        System.out.println(someDoubleValue);
//
//        System.out.println();
//        System.out.println();
//
//        byte overValue1 = (byte) 127;
//        byte overValue2 = (byte) 128;
//        byte overValue3 = (byte) 129;
//        byte overValue4 = (byte) 130;
//        byte overValue5 = (byte) 131;
//
//        System.out.println(overValue1);
//        System.out.println(overValue2);
//        System.out.println(overValue3);
//        System.out.println(overValue4);
//        System.out.println(overValue5);
//
//        int intVariablex = 125;
//        System.out.println(intVariablex);
//
//        byte b = (byte) intVariablex;
//        System.out.println(b);
//
//        intVariablex = b;
//        System.out.println(intVariablex);


        double doubleLatitude = 48.8583701;
        double doubleLongitude = 2.2922926;

        System.out.println(doubleLatitude);
        System.out.println(doubleLongitude);

        System.out.println();
        System.out.println("Tour Eiffel it`s \u00B0 " + doubleLatitude );
        System.out.println("Tour Eiffel it`s \u00B0 " + doubleLongitude );

        System.out.println();
        System.out.println("Tour Eiffel it`s \u00B0 " + "latitude " + doubleLatitude + " longitude " + doubleLongitude );

    }
}

