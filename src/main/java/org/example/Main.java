package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterLogIn;
        String Age;
        System.out.println("enterLogIn");
        System.out.println("Age");
        enterLogIn = scanner.nextLine();
        System.out.println("");
        Age =scanner.nextLine();
        System.out.println("input your details: " +enterLogIn);
       System.out.println("input your age: "+Age);

    }
}