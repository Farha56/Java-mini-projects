package com.company;
public class Main {

    public static void main(String[] args) {

        String[] word={"l","e","v","e","l"};
        int count=0,j=4;


        for (int i = 0; i <2 ; i++) {

            if (word[i]==word[j]){
                count++;
                j--;
            }
        } //End Loop


        if (count==2){
            System.out.println("ITS A PALINDROME");
        }
        else {
            System.out.println("ITS NOT A PALINDROME");
        }

    }
}