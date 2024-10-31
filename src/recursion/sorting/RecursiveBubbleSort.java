package recursion.sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,1,3,5,9};
        int len=arr.length;
        bubble(arr,0,len-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int s, int e) {
        if(e==0)
            return;
        if(s<e){
            if(arr[s]>arr[s+1])
                swap(arr,s,s+1);
            bubble(arr,s+1,e);
        }
        bubble(arr,0,e-1);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
