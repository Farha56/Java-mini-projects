package com.company;
public class Main {

    public static void main(String[] args) {

        String[] word={"l","e","v","e","l"};
        int j=4;
        boolean isPalindrome=true;



        for (int i = 0; i <2 ; i++) {

            if (word[i]!=word[j]){
                isPalindrome=false;
                break;
            }

            j--;

        } //End Loop


        if (isPalindrome) System.out.println("ITS A PALINDROME");
        else System.out.println("ITS NOT A PALINDROME");


    }
}