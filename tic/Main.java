package tic;
import java.util.*;
public class Main {
	static int count=0;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//creating player object p1,p1 of players type
	Players p1=new Players();
	Players p2=new Players();
	//getting player1 and 2 names
	System.out.println("enter player 1 name");
	p1.name=sc.nextLine();
	//player 1 turn as x
	p1.ch="x";
			System.out.println("enter player 2 name");
			p2.name=sc.nextLine();
			//creating board
			Players.board();
			//printing board
			Players.printboard();
			int choice=1;
			while(choice!=0) {
			switch("x"){
			case "x":{
				System.out.println(p1.name+" your turn");
				//entering x in n position
				int n=Players.enter();
				count++;
				//for checking the condition
				int b=Players.check(n,"xxx");
				if(b==1) {
					System.out.println("game over "+p1.name +" won");
					choice=0;
					break;
				}
				else {
					//switching to player 2 "y"
				Players.ch="y";
				}
				//to check the match is draw
				if(count==9) {
					System.out.println("!!!!!!Match Draw!!!!!!");
					choice=0;
					break;
				}
			}
			case "y":{
				System.out.println(p2.name+" your turn");
				//entering y in n position
				int n=Players.enter();
				count++;
				//checking condition
				int b=Players.check(n,"yyy");
				if(b==1) {
					System.out.println("game over "+p2.name +" won");
					choice=0;
					break;
				}
				else {
					//switching to player 1 "x"
				Players.ch="x";
				}
				
			}
			}
			}
			sc.close();
}
}
