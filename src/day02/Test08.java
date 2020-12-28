package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入要添加员工人数:");
        int num = scanner1.nextInt();
        Person[] people = new Person[num];
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
            Person newperson=new Person(name,age,gender,salary);
            people[i] = newperson;
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
    }
}
