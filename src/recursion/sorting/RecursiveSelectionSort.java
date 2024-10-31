package recursion.sorting;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
       int arr[]={1,4,2,3,9,6,5,8,7};

       selection(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int start, int end, int max) {
        if(end<0)
            return;
        if(start<=end){
            if(arr[start]>arr[max])
                selection(arr,start+1,end,start);
            else
                selection(arr,start+1,end,max);
        }
        else{
            swap(arr,max,end);
            selection(arr,0,end-1,0);
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
