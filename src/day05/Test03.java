package day05;

import day04.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        ArrayList<day04.Emp> emps = new ArrayList<>();
        System.out.println("请输入要输入员工数量:");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int num = scanner1.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("名字:");
            String name = scanner.nextLine();
            System.out.println("性别:");
            String gender = scanner.nextLine();
            System.out.println("入职时间:");
            String hiredate = scanner.nextLine();
            System.out.println("年龄:");
            int age = scanner1.nextInt();
            System.out.println("工资:");
            int salary = scanner1.nextInt();

            day04.Emp emp = new Emp(name,age,gender,salary,sdf.parse(hiredate));
            emps.add(emp);
        }
        System.out.println(emps);
        Collections.sort(emps, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                int a = o2.getHiredate().compareTo(o1.getHiredate());
                return a;
            }
        });
        System.out.println(emps);
    }
}
