package com.mertbahtiyar.javalearning;

public class Variables {
    public static void main(String[] args) {

        //Variables
        //integer-long
        int age = 20;

        System.out.println(10 * age);
        System.out.println(age / 5);

        int int1 = 5;
        int int2 =11;
        System.out.println(int2 / int1);

        long long1 = 10;
        System.out.println(long1 / 5);

        //double-float

        double double1 = 5.0;
        double double2 = 11.0;

        System.out.println(double2 / double1);

        float float1 = 10.0f;

        double pi = 3.14;
        int r = 5;
        System.out.println(2 * pi * r);

        //string

        String name = "Mert";
        //name = 40 hata verir, değişken tipi hatası
        String surname = "Bahtiyar";
        System.out.println(name + " " + surname);
        String fullname = name + " " + surname;
        System.out.println(fullname);

        //boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        // final - değeri sabit hale getirir.

        final int myInteger = 5;
        System.out.println("myInteger: " + myInteger);
        //myInteger = 4;   --     final den dolayı hata verir.
        //System.out.println("myInteger: " + myInteger);
    }
}
