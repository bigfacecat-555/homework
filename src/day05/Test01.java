package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            queue.offer(i);
        }
        for (Integer i:queue) {
            System.out.println(i);
        }
    }
}
