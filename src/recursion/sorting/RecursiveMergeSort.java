package recursion.sorting;

import java.util.Arrays;

public class RecursiveMergeSort {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,1,3,5,9};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    

    private static int[] mergeSort(int[] arr) {
        if(arr.length==1)
            return arr;

        int mid=arr.length/2;

        int first[]=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int second[]=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second) {
        int i = 0,j = 0,ind=0;
        int res[]=new int[first.length+second.length];

        while(i<first.length && j<second.length){
            if(first[i]<second[j])
                res[ind++] = first[i++];
            else
                res[ind++] = second[j++];
        }

        while(i<first.length)
            res[ind++] = first[i++];

        while(j<second.length)
            res[ind++] = second[j++];

        return res;

    }


}
