package day04;

import java.util.ArrayList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> col = new ArrayList<>();
        col.add("one");
        col.add("two");
        col.add("three");
        col.add("four");
        System.out.println(col.get(1));
        col.set(2,"3");
        System.out.println(col);
        col.add(1,"2");
        System.out.println(col);
        col.remove(2);
        System.out.println(col);
    }
}
