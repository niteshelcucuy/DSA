package recursion;

public class BinarySearchRotate {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{6,7,8,9,1,2,3,4,5},3,0,8));
    }

    static int findIndex(int[] arr, int target, int s, int e) {
        if(s>e)
            return -1;
        int m=s+(e-s)/2;

        if(arr[m]==target)
            return m;

        if(arr[s]<=arr[m]){
            if(arr[s]<=target && arr[m]>=target)
                return  findIndex(arr,target,s,m-1);
            else
                return findIndex(arr,target,m+1,e);
        }

        if(target>=arr[m] && target<=arr[e])
            return findIndex(arr,target,m+1,e);
        else
            return findIndex(arr, target, s, m-1);

    }
}

