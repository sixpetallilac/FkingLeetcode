package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class ZhishuYinzi {
    public static void main(String[] args) {
//          这句话是关于正整数和其质因子的一个数学事实。
//          它意味着对于任何一个正整数，
//          它的所有质因子中至多只有一个是大于它的平方根的。
//
//          这是因为如果一个数有两个大于其平方根的质因子，
//          那么这两个质因子相乘将会得到一个比原数更大的数，
//          这与这两个数是原数的因子相矛盾。
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 输入的正整数
        printPrimeFactors(number);
        scanner.close();

        }
    private static void printPrimeFactors(int number) {
        for (int factor = 2; factor * factor <= number; factor++) {
            while (number % factor == 0) {
                // 打印质因子并更新数值
                System.out.print(factor + " ");
                number /= factor;
            }
        }
        // 如果最后的数值大于1，那么它本身也是一个质因子
        if (number > 1) {
            System.out.print(number);
        }
    }
}
