import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int returnResult = lonelyInt(a);
        System.out.println(returnResult);
    }

    public static int lonelyInt(int[] a){
        int value = 0;

        for(int v : a){
            value = value ^ v;
        }

        return value;
    }
}
