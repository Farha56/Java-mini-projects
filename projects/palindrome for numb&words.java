package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner s= new Scanner(System.in);
            System.out.println("Enter Value");
            String str = s.next();
            String reverse = new StringBuffer(str).reverse().toString();

            if(str.equals(reverse))
                System.out.println("Pallindrome");
            else
                System.out.println("Not Pallindrome");



    }
}