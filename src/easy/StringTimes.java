package easy;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {
        System.out.println("::");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        if (!str2.isBlank()){
            int length = str.length() - str.replaceAll(str2,"").length();
            System.out.println(length);
        }else {
            System.out.println("blank");
        }

    }
}
