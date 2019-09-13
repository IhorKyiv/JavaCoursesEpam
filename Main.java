package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       // System.out.print(in.nextLine());
        System.out.println("Write the line as binary number");
        String LineBin = in.nextLine();
        int LineDex = Integer.parseInt(LineBin, 2);
        System.out.println(LineDex);
    }
}


