package easy;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSettest {//SET不可重复不可重复
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("next:");
        int num = sc.nextInt();
        TreeSet tr = new TreeSet();

        for (int i = 0; i<num ;i++){
            int cache = sc.nextInt();
            if (cache<=500 && cache>=1){
                tr.add(cache);
            }else {
                return;
            }
        }
        Iterator iterator = tr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
