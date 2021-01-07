package day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void getEmp(File file, ArrayList<Emp> arrayList) throws IOException, ClassNotFoundException {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.getName().endsWith(".emp")) {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f.getName()));
                    arrayList.add((Emp) ois.readObject());
                    getEmp(f, arrayList);
                }
            }
        }
    }

    public static HashMap getMap (ArrayList<Emp> emps){
        HashMap<String, Emp> stringEmpHashMap = new HashMap<>();
        for (Emp e : emps) {
            stringEmpHashMap.put(e.getName(),e);
        }
        return stringEmpHashMap;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(".");
        ArrayList<Emp> emps = new ArrayList<>();
        getEmp(file,emps);
        HashMap empMap = getMap(emps);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Set<Map.Entry<String, Emp>> empMaps = empMap.entrySet();
        int i =0;
        for (Map.Entry<String, Emp> e:empMaps) {
            if (e.getKey().equals(s)){
                System.out.println(e.getValue());
                i++;
            }
        }
        if (i == 0){
            System.out.println("查无此人");
        }
    }


}


























