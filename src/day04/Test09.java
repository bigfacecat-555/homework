package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        ArrayList<Emp> emps = new ArrayList<>();
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

            Emp emp = new Emp(name,age,gender,salary,sdf.parse(hiredate));
            emps.add(emp);
        }
        Calendar calendar = Calendar.getInstance();
        for (Emp e : emps
        ) {
            calendar.setTime(e.getHiredate());
            calendar.add(Calendar.MONTH,3);
            calendar.set(Calendar.WEEK_OF_MONTH,1);
            calendar.set(Calendar.DAY_OF_WEEK,6);
            Date date = calendar.getTime();
            System.out.println(sdf.format(date));
            System.out.println(e.toString());
        }

    }
}