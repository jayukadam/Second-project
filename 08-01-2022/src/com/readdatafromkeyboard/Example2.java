package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
int num1;
int num2;
int sum;
Scanner scn= new Scanner(System.in);
System.out.println("Enter first value:");
num1=scn.nextInt();
System.out.println("Enter second value:");
num2=scn.nextInt();
sum=num1+num2;
System.out.println("======");
System.out.println(sum);
scn.close();



	}

}
