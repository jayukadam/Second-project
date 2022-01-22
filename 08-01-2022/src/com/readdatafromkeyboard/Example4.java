package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
int length;
int breadth;
int area;
Scanner scn = new Scanner(System.in);
System.out.println("Enter the length");
length=scn.nextInt();
System.out.println("Enter the breadth");
breadth=scn.nextInt();
area=length*breadth;
System.out.println("======");
System.out.println(area);
scn.close();

	}

}
