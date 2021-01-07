package day06;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File(".");
        getAllName(file);
    }

    public static void getAllName(File file){
        File[] files = file.listFiles();
        for (File f:files) {
            if (f.isDirectory()){
                System.out.println(f.getName());
                getAllName(f);
            }else {
                System.out.println(f.getName());
            }
        }
    }
}
