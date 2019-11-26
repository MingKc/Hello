package SeventhProblem;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				continue;
			}
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]=0;
				}
			}
		}
		System.out.println("The number of distinct number is "+(10-count));
		System.out.print("The distinct numbers are: ");
		for(int s:arr){
			if(s!=0){
				System.out.print(s+" ");
			}
		}
	}
}
