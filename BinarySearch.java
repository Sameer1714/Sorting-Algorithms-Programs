package home;

public class BinarySearch {
	
	public static void divide(int[] arr,int si,int ei) {
		
		if(si <ei) {
		int pi=partition(arr,si,ei);
		
		  divide(arr,si,pi-1);
		  divide(arr,pi+1,ei);
		}
	}
   public static int partition(int[] arr,int si,int ei) {
	   
	   int pivot=arr[ei];
	   int i=si-1;
	   
	   for(int j=si;j<ei;j++) {
		   if(arr[j] <pivot) {
			   i++;
			   
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
		   }
	   }
	   i++;
	   int temp=arr[i];
	   arr[i]=arr[ei];
	   arr[ei]=temp;
	   
	   return i;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,3,45,67,8,9,23};
		
		divide(arr,0,arr.length-1);
		
		int Search=45;
		int temp=0;
		int si=0,ei=arr.length-1;
		
		while(si <= ei) 
		{
		   int mid=(ei+si)/2;
		   
		   if(Search==arr[mid]) {
			   System.out.println("Element id found at "+mid+" position");
			   temp=1;
			   break;
		   }
		   else if(Search > arr[mid]) {
			   si=mid+1;
		   }
		   else {
			   ei=mid-1;
		   }
		   
		   mid=(ei+si)/2;
			
		}
		
		if(temp==0) {
			System.out.println("element is NOT found");
		}
	}

}
