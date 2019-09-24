import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		double[] list1={1.0,2.0,3.0,5.3};
		int[] arr={0,1,8,5};
		seletionSort(list1);
		System.out.println(linearSearch(arr, 5));
		System.out.println(BinarySearch(arr, 0));
		System.out.println(Arrays.toString(list1));
		
		
	}
	
	public static int linearSearch(int[] list,int key){
		for(int i=0;i<list.length;i++){
			if(key==list[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int[] list,int key){
		int low =0;
		int high =list.length-1;
		while(high>=low){
			int mid=(low+high)/2;
			
			if(key<list[mid]){
				high=mid-1;
			}else if(key==list[mid]){
				return mid;
			}else{
				low=mid+1;
			}
		}
		
		return -low-1;
	}
	
	
	public static void seletionSort(double[] list){
			for(int i=0;i<list.length-1;i++){
				double currentMix=list[i];
				int currentMinIndex=i;
				
				for(int j=i+1;j<list.length;j++){
					if(currentMix>list[j]){
						currentMix=list[j];
						currentMinIndex=j;
					}
				}
				
				if(currentMinIndex!=i){
					list[currentMinIndex]=list[i];
					list[i]=currentMix;
				}
			}
			
			
	}
	
}
