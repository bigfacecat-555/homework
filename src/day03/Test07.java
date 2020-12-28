package day03;

import day02.Person;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Emp> empArr = new ArrayList();
        empArr.add(new Emp("张三",25,"男",5000,2006,2,15));
        empArr.add(new Emp("李四",21,"女",5200,2010,1,15));
        empArr.add(new Emp("王六",22,"男",6000,2013,6,30));


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入要添加员工人数:");
        int num = scanner1.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("请输入员工信息");
            System.out.println("名字:");
            String name = scanner.nextLine();
            System.out.println("性别:");
            String gender = scanner.nextLine();
            System.out.println("年龄:");
            int age = scanner1.nextInt();
            System.out.println("薪资:");
            int salary = scanner1.nextInt();
            System.out.println("年:");
            int year =scanner1.nextInt();
            System.out.println("月:");
            int mon = scanner1.nextInt();
            System.out.println("日:");
            int date =scanner1.nextInt();
            Emp newemp =new Emp(name,age,gender,salary,year,mon,date);
            for (int j = 0; j < empArr.size(); j++) {
                if (empArr.contains(newemp)){
                    System.out.println("已有此人");
                }else {
                    empArr.add(newemp);
                }
            }

        }

        for (int j = 0; j < empArr.size(); j++) {
            System.out.println(empArr.get(j));
        }
    }
}
