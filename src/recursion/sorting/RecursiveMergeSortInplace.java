package recursion.sorting;

import java.util.Arrays;

public class RecursiveMergeSortInplace {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,1,3,5,9};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInplace(int[] arr, int start, int end) {
        if(end-start==1)
            return;
        int mid=start+(end-start)/2;

        mergeSortInplace(arr,start,mid);
        mergeSortInplace(arr,mid,end);

        merger(arr,start,mid,end);

    }
    //0 1 2 3 4 5 6 7
    private static void merger(int[] arr, int start, int mid, int end) {
        int first =start, second=mid, ind=0;
        int merged[]=new int[end-start];

        while(first<mid && second<end){
            if(arr[first]<arr[second])
                merged[ind++]=arr[first++];
            else
                merged[ind++]=arr[second++];
        }

        while(first<mid)
            merged[ind++]=arr[first++];
        while(second<end)
            merged[ind++]=arr[second++];

        for(int i=0;i<merged.length;i++)
            arr[start+i]=merged[i];
    }

}
