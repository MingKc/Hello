package SeventhProblem;


import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10000];
		int i=0;
		while(input.hasNext()){
			int temp=input.nextInt();
			if(temp==0){
				break;
			}
			arr[i++]=temp;
		}
		
		for(int a=0;a<i-1;a++){
			for(int b=0;b<i-a-1;b++){
				if(arr[b]>arr[b+1]){
					int s=arr[b];
					arr[b]=arr[b+1];
					arr[b+1]=s;
				}
			}
		}
		
		for(int j=0;j<i;j++){
			int count=1;
			if(arr[j]==0){
				continue;
			}
			for(int m=j+1;m<i;m++){
				if(arr[j]==arr[m]){
					count++;
					arr[m]=0;
				}
			}
			if(count>1){
				
				System.out.println(arr[j]+" occurs "+count+" times");
			}else{
				System.out.println(arr[j]+" occurs "+count+" time");
				
			}
		}
	}
}
