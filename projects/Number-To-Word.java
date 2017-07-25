package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String ones[] = {" zero", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
        };
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        int number,a,b,c;

        Scanner s=new Scanner(System.in);

        System.out.println("Please type a number");
        number=s.nextInt();

        a=number/100;
        b=number/10;
        c=number%10;

        if (number>=0 && number<10) {

            System.out.print(ones[c]);

        }

        else if (number>=10 && number<20) {

            System.out.print(ones[number]);

        }


        else if (number>=0 && number<=999){
            System.out.print(ones[number /100 % 10] + " HUNDRED " + tens[number / 10 % 10] + " " + ones[number % 10]);
        }




    }
}