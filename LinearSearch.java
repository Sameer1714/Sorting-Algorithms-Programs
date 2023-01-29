package home;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,3,45,67,89,5};
		
		int Search=45;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==Search) {
				System.out.println("Element is found "+i+" at position");
				temp=1;
			}
		}
		if(temp==0) {
			System.out.println("Element is Not found");
		}
		
	}

}
