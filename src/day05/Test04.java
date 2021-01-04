package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        HashMap<String, Integer> stu = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入科目:");
            String subject = scanner.nextLine();
            System.out.println("请输入成绩:");
            int grade = scanner1.nextInt();
            stu.put(subject, grade);
        }
        System.out.println(stu.get("物理"));
        stu.replace("化学", 96);
        stu.remove("英语");

        Set<String> strings = stu.keySet();
        for (String s : strings) {
            System.out.println(s);
        }

        Set<Map.Entry<String, Integer>> entries = stu.entrySet();
        for (Map.Entry<String, Integer> e:entries) {
            System.out.println(e);
        }

        Collection<Integer> values = stu.values();
        for (Integer i : values) {
            System.out.println(i);
        }


    }
}
