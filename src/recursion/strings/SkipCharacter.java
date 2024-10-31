package recursion.strings;

public class SkipCharacter {
    public static void main(String[] args) {
        String str="asdasdasd";
        String str2="asdfgqwertzxcvbqwertasdfgzxcvqwerzxcv";
        System.out.println(skip(str,""));
        System.out.println(skipQWERT(str2,""));
        System.out.println(skipQWERnotQWERT(str2,""));
    }

    private static String skipQWERnotQWERT(String str, String res) {
        if(str.isEmpty())
            return res;
        if(str.startsWith("qwer") && !str.startsWith("qwert"))
            return skipQWERnotQWERT(str.substring(4),res);
        else
            return skipQWERnotQWERT(str.substring(1),res+str.charAt(0));
    }

    private static String skipQWERT(String str, String res) {
        if(str.isEmpty())
            return res;
        if(str.startsWith("qwert"))
            return skipQWERT(str.substring(5),res);
        else
            return skipQWERT(str.substring(1),res+str.charAt(0));
    }

    private static String skip(String str,String res) {
        if(str.isEmpty())
            return res;

        char ch=str.charAt(0);
        if(ch == 'a')
            return skip(str.substring(1),res);
        else
            return skip(str.substring(1),res+ch);
    }
}
