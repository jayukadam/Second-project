package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
String name;
String age;
String address;
Scanner scn = new Scanner(System.in);
System.out.println("name");
name=scn.nextLine();
System.out.println("age");
age=scn.nextLine();
System.out.println("========");
System.out.println("name:"+name);
System.out.println("age:"+age);


scn.close();


	}

}
