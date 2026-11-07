package com.guru.grade;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score > 90) {
            System.out.println("Grade A");
        } 
        else if (score > 80) {
            System.out.println("Grade B");
        } 
        else if (score > 70) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}