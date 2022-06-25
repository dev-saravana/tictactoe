package tic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Players {
	static Scanner sc=new Scanner(System.in);
String name;
//ch(turn) is shared between objects(p1 and p2) so it is static
static String ch;
//c[] board is shared between objects(p1 and p2) so it is static
static String c[]=new String[9];
static void board() {
	for(int i=1;i<=9;i++) {
		c[i-1]=String.valueOf(i);
	}
}
static void printboard() {
	
System.out.println(c[0]+"|"+c[1]+"|"+c[2]+"|");
System.out.println("------");
System.out.println(c[3]+"|"+c[4]+"|"+c[5]+"|");
System.out.println("------");
System.out.println(c[6]+"|"+c[7]+"|"+c[8]+"|");
}
//Entering in Board
static int enter() {
	System.out.println("enter the number");
	int n=sc.nextInt();
	try {
	if(n>9||n<1||c[n-1]=="x"||c[n-1]=="y") {
		throw new InputMismatchException();
	}
	
	c[n-1]=ch;
	printboard();
	}
	catch(InputMismatchException e) {
		System.out.println("enter valid choice");
		enter();
	}
	return n-1;
}
//checking conditions
static int check(int n,String xy) {
	int i=0;
	switch(n) {
	case 0:{
		if(xy.equals(c[0]+c[1]+c[2])||xy.equals(c[0]+c[3]+c[6])||xy.equals(c[0]+c[4]+c[8])) {
			return 1;		
		}
		}
	case 1:{
		if(xy.equals(c[1]+c[0]+c[2])||xy.equals(c[1]+c[4]+c[7])) {
			return 1;		
		}
		}
	case 2:{
		if(xy.equals(c[2]+c[1]+c[0])||xy.equals(c[2]+c[5]+c[8])||xy.equals(c[2]+c[4]+c[6])) {
			return 1;		
		}
		}
	case 3:{
		if(xy.equals(c[0]+c[3]+c[6])||xy.equals(c[3]+c[4]+c[5])) {
			return 1;		
		}
		}
	case 4:{
		if(xy.equals(c[0]+c[4]+c[8])||xy.equals(c[2]+c[4]+c[6])||xy.equals(c[3]+c[4]+c[5])||xy.equals(c[1]+c[4]+c[7])) {
			return 1;		
		}
		}
	case 5:{
		if(xy.equals(c[3]+c[4]+c[5])||xy.equals(c[2]+c[5]+c[8])) {
			return 1;		
		}
		}
	case 6:{
		if(xy.equals(c[0]+c[3]+c[6])||xy.equals(c[6]+c[7]+c[8])||xy.equals(c[6]+c[4]+c[2])) {
			return 1;		
		}
		}
	case 7:{
		if(xy.equals(c[6]+c[7]+c[8])||xy.equals(c[1]+c[4]+c[7])) {
			return 1;		
		}
		}
	case 8:{
		if(xy.equals(c[6]+c[7]+c[8])||xy.equals(c[8]+c[5]+c[2])||xy.equals(c[0]+c[4]+c[8])) {
			return 1;		
		}
		}
	}
	return i;
}
}
