package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int r;
		double pi=3.14,area;
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r=scn.nextInt();
		area = pi * r * r;
	System.out.println("area of circle:"+area);
	scn.close();

	}

}
