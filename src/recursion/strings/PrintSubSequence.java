package recursion.strings;

import java.nio.file.DirectoryNotEmptyException;
import java.util.ArrayList;

public class PrintSubSequence {
    public static void main(String[] args) {
        int num[]={1,2,3};
        ArrayList<ArrayList<Integer>> res=subSequence(num);
        System.out.println(res.toString());
    }

    private static ArrayList<ArrayList<Integer>> subSequence(int[] num) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int val:num){
            int size=outer.size();
            for(int i=0;i<size;i++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(val);
                outer.add(inner);
            }
        }

        return outer;
    }


}
