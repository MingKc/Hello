package SeventhProblem;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list: ");
		int n=input.nextInt();
		int[] list=new int[n];
		for(int i=0;i<list.length;i++){
			list[i]=input.nextInt();
		}
		if(isSorted(list)){
			System.out.println("The list is already sorted");
		}else{
			System.out.println("The list is not sorted");
		}
	}
	
	public static boolean isSorted(int[] list){
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list.length-i-1;j++){
				if(list[j]>list[j+1]){
					return false;
				}
			}
		}
		return true;
	}
	
}
