package recursion.sorting;

import java.util.Arrays;

public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int arr[]={4,5,2,1,3};
        QuickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void QuickSort(int[] arr, int lower, int upper) {
        if(lower>upper)
            return;

        int start=lower, end=upper;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];

        while(start<=end){
            while (arr[start]<pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }

        QuickSort(arr,lower,end);
        QuickSort(arr,start,upper);
    }
}
