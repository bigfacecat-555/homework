package day06;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Emp> emps = new ArrayList<>();
        File file = new File(".");
        cheak(file,emps);
        System.out.println(emps.size());
        Collections.sort(emps, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.age -o1.age;
            }
        });
        System.out.println(emps);
    }

    public static void cheak(File file, ArrayList<Emp> arrayList) throws IOException, ClassNotFoundException {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.getName().endsWith(".emp")) {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f.getName()));
                    arrayList.add((Emp) ois.readObject());
                    cheak(f, arrayList);
                }
            }
        }
    }
}
