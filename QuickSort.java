package home;

public class QuickSort {
	
	public static void sort(int[] arr,int low,int high) {
		
		int pi=divide(arr,low,high);
		
		
		if(low < pi-1 ) {
			sort(arr,low,pi-1);
		}
		
		 if(pi < high)
		{
			sort(arr,pi,high);
		}
	}
	
	public static int divide(int[] arr,int low,int high) {
		
		int pivot=arr[(low+high)/2];
		
		while(low <= high) 
		{
		
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot ) {
				high--;
			}
			if(low <= high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {15,9,7,13,12,16,4,18,11};
		
		int n=arr.length;
		
		QuickSort.sort(arr,0,n-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
