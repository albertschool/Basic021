package com.videxedge;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void q1(){
        Random rnd = new Random();
        int num = rnd.nextInt(9999) + 1;
        System.out.println(""+num);
        if (num/1000 > 0) {
            System.out.println("4 digits");
        } else if (num/100 > 0) {
            System.out.println("3 digits");
        } else if (num/10 > 0) {
            System.out.println("2 digits");
        } else {
            System.out.println("1 digit");
        }
    }

    public static void q2(){
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int num1, diff;
        System.out.println ("Enter int number(0-200):");
        num1 = input.nextInt();
        if (0<=num1 && num1<=200) {
            diff = rnd.nextInt(6) + 1;
            System.out.println(""+diff);
            System.out.print((char) num1+",");
            System.out.print((char) (num1+diff)+",");
            System.out.println((char) (num1+2*diff));
        } else {
            System.out.println("Wrong input number!");
        }
    }

    public static void q3(){
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        String shape;
        int value;
        System.out.println ("Enter card shape(spade/heart/diamond/club):");
        shape = input.nextLine();
        if (shape.equals("spade") || shape.equals("heart") || shape.equals("diamond") || shape.equals("club")) {
            value = rnd.nextInt(13) + 2;
            System.out.println(""+value);
            if (value == 14) {
                System.out.println("Ace "+shape);
            } else if (value == 13) {
                System.out.println("King "+shape);
            } else if (value == 12) {
                System.out.println("Queen "+shape);
            } else if (value == 11) {
                System.out.println("Jack "+shape);
            } else {
                System.out.println(shape+" "+value);
            }
        } else {
            System.out.println("Wrong card shape!");
        }
    }

    public static void q4(){
        Random rnd = new Random();
        int currentYear = LocalDate.now().getYear();
        int checkedYear = rnd.nextInt(currentYear) + 1;
        System.out.println(""+checkedYear);
        if (checkedYear%400==0 || (checkedYear%4==0 && checkedYear%100!=0)) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Not leap year");
        }
    }

    public static void q5(){
        Random rnd = new Random();
        int cube1 = rnd.nextInt(6) + 1;
        int cube2 = rnd.nextInt(6) + 1;
        System.out.println(""+cube1+":"+cube2);
        if (cube1==cube2) {
            System.out.println("It's a double!");
        } else {
            System.out.println("It's not a double!");
        }
    }

    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
//        q4();
//        q5();
    }
}
