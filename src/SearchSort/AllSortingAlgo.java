package SearchSort;

import java.util.Arrays;


public class AllSortingAlgo {
    public static void main(String[] args) {

        int arr[]={9,3,6,5,1,2,7,8,4};
        int len = arr.length;

        //BubbleSort(arr, len);
        //SelectionSort(arr,len);
        //InsertionSort(arr,len);
        //CyclicSort(arr,len);

        System.out.println(Arrays.toString(arr));
    }

    //only when 0 to N, or 1 to N or predefined contionus ranges
    private static void CyclicSort(int[] arr, int len) {
        int ind=0;
        while(ind<len){
            if(arr[ind]-1==ind)
                ind++;
            else
                swap(arr,ind,arr[ind]-1);
        }
    }

    private static void InsertionSort(int[] arr, int len) {
        for(int i=0;i<len-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
//9,3,6,5,1,2,7,8,4
    private static void SelectionSort(int[] arr, int len) {
        for(int i=0;i<len;i++){
            int last=len-i-1;
            int maxInd=maxIndex(arr,last);
            swap(arr,maxInd,last);
        }
    }

    private static int maxIndex(int[] arr, int last) {
        int max=0;

        for(int i=0;i<=last;i++)
            if(arr[i]>arr[max])
                max=i;
        return max;

    }

    private static void BubbleSort(int[] arr, int len) {

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr,j,j+1);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
