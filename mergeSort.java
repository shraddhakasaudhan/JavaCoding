//mergeSortCode
package com.algo;

public class MergeSort {
	
	public  static void conquer(int arr[], int lb, int mid ,int ub) {
		int merged[]=new int[ub-lb+1];
		int i=lb;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ub) {
			if(arr[i]<=arr[j]) {
				merged[k]=arr[i];
				i++;
				k++;
				}
			else {
				merged[k]=arr[j];
				j++;
				k++;
				
			}
		}
		while(i<=mid) {
			merged[k]=arr[i];
			i++;
			k++;
			
		}
		while(j<=ub) {
			merged[k]=arr[j];
			j++;
			k++;
		}
		for(int x=0, y=lb; x<merged.length;x++,y++) {
			arr[y]=merged[x];
		}
	}
	public static void divide(int arr[] ,int lb, int ub ) {
		if(lb>=ub) {
			return;
		}
		int mid=lb+(ub-lb)/2;
	   divide (arr,lb,mid);
	   divide(arr,mid+1,ub);
	   conquer(arr,lb,mid,ub);
	}
	public static void main(String args[]) {
		int arr[]= {5, 3 , 9, 2, 1, 6, 8};
		int n=arr.length;
		divide(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
