package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList strarr = new ArrayList();
        strarr.add("one");
        strarr.add("two");
        strarr.add("three");
        test1(strarr);
        test2(strarr);
        test3(strarr);
        test4(strarr);
        test5(strarr);
        test6(strarr);
    }

    private static void test6(ArrayList strarr) {
        System.out.println(strarr.isEmpty());
    }

    private static void test5(ArrayList strarr) {
        System.out.println(strarr.size());
    }

    private static void test4(ArrayList strarr) {
        strarr.clear();
        System.out.println(strarr);
    }

    private static void test3(ArrayList strarr) {
        System.out.println(strarr.isEmpty());
    }

    private static void test2(ArrayList strarr) {
        System.out.println(strarr.contains("four"));
    }

    private static void test1(ArrayList strarr) {
        System.out.println(strarr.size());
    }
}
