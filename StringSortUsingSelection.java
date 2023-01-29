package home;

import java.util.Scanner;

public class StringSortUsingSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner sc=new Scanner(System.in);
		
		String[] arr=new String[5];
		
		System.out.println("Enter Name ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		int min;
		String temp="";
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[min])<0) {
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		sc.close();
	}

}
