package com.musala.javacourse181112;

public class FutureAgeCalculator {
    public static void main(String[] args) {
        int age=0;
        int addYears=5;

        age=Integer.parseInt(args[0]);

        System.out.println("Age:"+age+"\nAdded Age:"+addYears);
        System.out.println("Result:"+(age+addYears));
System.exit(0);

    }

}