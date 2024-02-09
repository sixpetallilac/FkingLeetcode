package easy;

import java.util.Scanner;

public class AStringLength {
    void leetcode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input:");
        String str =sc.nextLine();
        int length = str.length();
        int i = str.lastIndexOf(" ");
        int get = length-i;
        System.out.println(get);
    }
    public static void main(String[] args) {
        AStringLength a = new AStringLength();
        a.leetcode();
        System.out.println();
        String s = "aaa";
        int length = s.length();
        System.out.println(length);
    }
}