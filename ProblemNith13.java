package test;

import java.util.Scanner;
class Location{
	public int row,column;
	public double maxValue;
}

public class ProblemNith13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array:");
		int m=input.nextInt();
		int n=input.nextInt();
		double[][] a=new double[m][n];
		System.out.println("Enter the array:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=input.nextDouble();
			}
		}
		Location p=locateLargest(a);
		System.out.println("The location of the largest element is "+p.maxValue+" at ("+p.row+", "+p.column+")");
	
	}
	
	public static Location locateLargest(double[][] a){
		Location  l=new Location();
		l.row=0;
		l.column=0;
		l.maxValue=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]>l.maxValue){
					l.maxValue=a[i][j];
					l.row=i;
					l.column=j;
				}
			}
		}
		return l;
	}
}
