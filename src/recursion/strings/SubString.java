package recursion.strings;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String str="abc";
        subStringStr("",str);
        System.out.println(subStringStrList("",str).toString());;
    }

    private static void subStringStr(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        subStringStr(p+up.charAt(0),up.substring(1));
        subStringStr(p,up.substring(1));
    }

    private static ArrayList<String> subStringStrList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left=subStringStrList(p+up.charAt(0),up.substring(1));
        ArrayList<String> right=subStringStrList(p,up.substring(1));

        left.addAll(right);

        return left;
    }
}
