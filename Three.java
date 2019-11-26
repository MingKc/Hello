package SeventhProblem;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] grade=new int[n];
		String[] name=new String[n];
		for(int i=0;i<n;i++){
			grade[i]=input.nextInt();
			name[i]=input.next();
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(grade[j]<grade[j+1]){
					int temp=grade[j];
					grade[j]=grade[j+1];
					grade[j+1]=temp;
					String s=name[j];
					name[j]=name[j+1];
					name[j+1]=s;
				}
				
			}
			
		}
		
		for(int i=0;i<n;i++){
			System.out.println(name[i]);
		}
	}
}
