package home;

public class SortingTask {

	public static void main(String[] args) {
		
		int[] arr= {10,23,4,56,65,3,45};
		BubleSort(arr);
		
		int arr1[]= {12,34,54,233,45,6,89,7};
		SelectionSort(arr1);
		
		int[] arr2= {34,54,67,89,7,56,4,34,56};
		InsertionSort(arr2);
		
		int[] arr3= {46,8,54,23,67,9,75};
		MergeSort(arr3,0,arr.length-1);
		System.out.println("\nMerge Sort : ");
		print(arr3);
		
		int[] arr4= {35,56,7,54,64,43,67,89,90,899,23,1};
		QuickSort(arr4,0,arr4.length-1);
		System.out.println("\nQuick Sort : ");
		print(arr4);
		
		int[] b= {35,7,79,89,864,45,677,64,56,78,90};
		int s=90;
		QuickSort(b, 0,b.length-1);//Required Sorted Array
		System.out.println("\nBinearySearch : ");
		print(b);
		BinearySearch(b,s);
	}

	private static void BinearySearch(int[] arr, int s) {
		
		int si=0,ei=arr.length-1;
		while(si<=ei) {
			int mid=si+(ei-si)/2;
			
			if(arr[mid]==s) {
				System.out.println("\n"+s+" found at index : "+mid);
				break;
			}
			else if(arr[mid] < s) {
				si=mid+1;
			}
			else {
				ei=mid-1;
			}
		}
	}

	private static void QuickSort(int[] arr,int si,int ei) {
		if(si < ei) {
		int pind=partition(arr,si,ei);
		
		QuickSort(arr, si, pind-1);
		QuickSort(arr, pind+1, ei);
		}
	}

	private static int partition(int[] arr, int si, int ei) {
		int pivot=arr[ei];
		int i=si-1;
		for(int j=si;j<ei;j++) {
			if(arr[j]<pivot) {
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

	private static void MergeSort(int[] arr, int si, int ei) {
		
		if(si>=ei) {
			return;
		}
		
		int mid=si+(ei-si)/2;
		
		MergeSort(arr, si, mid);
		MergeSort(arr, mid+1, ei);
		
		Conqure(arr,si,mid,ei);
	}

	private static void Conqure(int[] arr, int si, int mid, int ei) {
		
		int[] temp=new int[ei-si+1];
		int ind1=si;
		int ind2=mid+1;
		int i=0;
		
		while(ind1 <= mid && ind2 <= ei) {
			if(arr[ind1]<=arr[ind2]) {
				temp[i++]=arr[ind1++];
			}
			else {
				temp[i++]=arr[ind2++];
			}
		}
		while(ind1 <=si) {
			temp[i++]=arr[ind1++];
		}
		while(ind2<=ei) {
			temp[i++]=arr[ind2++];
		}
		
		for(int j=0,k=si;j<temp.length;j++,k++) {
			arr[k]=temp[j];
		}
		
		
	}

	private static void InsertionSort(int[] arr2) {
		System.out.println("\nInsertion Sort");
		for(int i=1;i<arr2.length;i++) {
			int j=i,temp=arr2[i];
			 while(j>0&& arr2[j-1]>temp) {
				 arr2[j]=arr2[j-1];
				 j--;
			 }
			 arr2[j]=temp;
		}
		print(arr2);
	}

	private static void SelectionSort(int[] arr) {
		System.out.println("\nSelection Sort : ");
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		print(arr);
	}

	private static void BubleSort(int[] arr) {
		System.out.println("Bubble Sort : ");
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		print(arr);
	}

	private static void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
