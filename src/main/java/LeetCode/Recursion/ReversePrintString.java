package LeetCode.Recursion;

public class ReversePrintString {
    public static void printStr(String str, int n) {
        if (n == str.length())
            return;
        printStr(str, n + 1);
        System.out.print(str.charAt(n));
    }
}
