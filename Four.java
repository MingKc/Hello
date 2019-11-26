package SeventhProblem;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] arr=new double[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextDouble();
		}
		arr=bubbleSort(arr);
		for(double d:arr){
			System.out.print(d+" ");
		}
	}
	
	
	public static double[] bubbleSort(double[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					double temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr; 
	}
}
