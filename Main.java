package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.println("Write binary number as 8 elements ");
int MyArr[] = new int [8];
for (int i=0; i < MyArr.length; i++) {
    MyArr[i] = in.nextInt();
}
if (MyArr[0]>0)
    MyArr[0] = 0;
    else MyArr[0] = 1;


System.out.println("MyArray");
for (int i=0; i<MyArr.length; i++) {
    System.out.print(MyArr[i] + "");
}
System.out.println();
}

    }
