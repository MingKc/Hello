package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Eleven16 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int x=(int)(Math.random()*10);
		int y=(int)(Math.random()*10);
		System.out.print("What is "+x+" + "+y+"? ");
		int temp=input.nextInt();
		int t=x+y;
		while(t!=temp){
			if(list.contains(temp)){
				System.out.println("You already entered "+temp);
			}else{
				System.out.print("Wrong answer. Try again. What is "+x+" + "+y+"?");
				list.add(temp);
			}
			temp=input.nextInt();
		}
		System.out.println("You got it!");
	}
}

