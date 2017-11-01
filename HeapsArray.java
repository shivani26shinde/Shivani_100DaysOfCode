# MinHeap and MaxHeap Implementation using arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class Heaps
{
	static int[] array = new int[]{6,3,2,6,1,8,1};
	
	// Maximum Heap
	public static void MaxHeapSort(int[] array){
		int len = array.length;
		for(int i=len/2; i>=0;i--){
			maxHeapify(array, i, len);
		}
		for(int i=len-1;i>=0;i--){
			swap(i,0);
			maxHeapify(array, 0, i);
		}
	}
	public static void maxHeapify(int[] array, int i, int len){
		int left = 2*i+1;
		int right = 2*i+2;
		int max = i;
		if(left < len && array[left] > array[i]){
			max = left;
		}
		if(right < len && array[right] > array[max]){
			max = right;
		}
		if(max != i){
			swap(max, i);
			maxHeapify(array, max, len);
		}
		return;
	}
	
	// Minimum Heap
	public static void MinHeapSort(int[] array){
		int len = array.length;
		for(int i=len/2; i>=0;i--){
			minHeapify(array, i, len);
		}
		for(int i=len-1;i>=0;i--){
			swap(i,0);
			minHeapify(array, 0, i);
		}
	}	
	public static void minHeapify(int[] array, int i, int len){
		int left = 2*i+1;
		int right = 2*i+2;
		int max = i;
		if(left < len && array[left] < array[i]){
			max = left;
		}
		if(right < len && array[right] < array[max]){
			max = right;
		}
		if(max != i){
			swap(max, i);
			minHeapify(array, max, len);
		}
		return;
	}
	
	// Swapping
	public static void swap(int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		MaxHeapSort(array);
		System.out.println(Arrays.toString(array));
		MinHeapSort(array);
		System.out.println(Arrays.toString(array));
	}
}