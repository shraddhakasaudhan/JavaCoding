package com.algo;

public class QuickSort {

	public static int partition(int arr[] , int lb, int ub) {
		int pivot=arr[ub];
		int i=lb-1;
		for(int j=lb ;j<ub;j++) {
			if(arr[j]<pivot) { // {6, 4 ,5 ,3, 9, 8}
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[ub]=temp;

		return i;
	}

	public static void quickSort(int arr[]  ,int lb  ,int ub) {
		if(lb<ub) {
			int loc=partition(arr,lb ,ub);
			quickSort(arr, lb, loc-1);
			quickSort(arr, loc+1, ub);
		}

	}
	public static void main(String args[]) {
		int arr[]= {6, 4 ,5 ,3, 9, 8};
		int n=arr.length;
		quickSort(arr, 0, n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"   ");

		}
		System.out.println();


	}

}


