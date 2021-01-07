package day06;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
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
        System.out.println(emps);
        for (Emp e:emps) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(e.getName()+".emp"));
            oos.writeObject(e);
        }

    }
}
