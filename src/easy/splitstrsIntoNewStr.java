package easy;

import java.util.Scanner;
///*********************************************
public class splitstrsIntoNewStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            while (s.length() >= 8) {
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }

            if (!s.isEmpty()) {
                s += "00000000"; // 补足零使长度达到8的倍数
                System.out.println(s.substring(0, 8));
            }
        }

    }
}

