package home;

public class QuickByAC {
	
	public static void sort(int[] arr,int low,int high) {
		
		if(low < high) {
		int pind=partition(arr,low,high);
		
		sort(arr,low,pind-1);
		sort(arr,pind+1,high);
		}
	}

	public static int partition(int[] arr,int low,int high) {
		
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			
			if(arr[j]<pivot) {
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,23,34,45,67,5,6,4,1};
		
		sort(arr,0,arr.length-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
