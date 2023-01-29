package home;

import java.util.Scanner;

public class StringSortUsingBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String[] arr=new String[5];
		
		System.out.println("Enter Name ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		String temp=""; int flag=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j].compareTo(arr[j+1])>0) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==1) {
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		sc.close();
		
	}

}
