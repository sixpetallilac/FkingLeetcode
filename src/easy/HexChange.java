package easy;

import java.util.Scanner;

public class HexChange {
    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        while(in.hasNextLine()){
////            String s = in.nextLine();    //读入数字
//            String s ="Oxf760";
//            s = s.toUpperCase();
//            int count = 0;    //记录转换后的数字
//
//            for(int i=0; i < s.length()-2; i++){
//                //由于前面两位是'0x'，故从第三位开始
//                char tc = s.charAt(i+2);
//                int t = 0;    //记录字母转换成的数值
//                //将字母转换为数值
//                if(tc>='0' && tc<='9')
//                    t = tc - '0';
//                    //字母'A'/'a'~'F''f'对应数字10~15
//                else if(tc>='A' && tc<='F')
//                    t = tc - 'A' + 10;//+10?
////                else if(tc>='a' && tc<='f')
////                    t = tc - 'a' +10;
//                //计算加和
//                count += t * Math.pow(16, s.length()-i-3);
//            }//-3?
////            上面的代码就是用了math。pow  的api ，然后char把对应的位置转换成了16进制中的对应10进制数字，然后对应的乘以权重，for循环中把这些权重加起来
////            Math.pow(base, exponent) 是一个Java API，用于计算一个数的指数幂。
//            System.out.println(count);

        String str = "OxAA";
        str = str.toUpperCase();
        //count int rec
        int count = 0;

        for (int i = 0;i<str.length()-2;i++){
            int cache = 0;
            char c = str.charAt(i + 2);
            if (c>='0'&& c<='9'){
                //数值转换
                cache = c - '0';
            }else if (c>='A'&&c<='F'){
                cache = c - 'A'+10;
            }
            count += cache * Math.pow(16,str.length()-i-3);
        }
        System.out.println(count);

        }
    }
//}
