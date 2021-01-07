package day06;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File(".");
        getAllName(file);
    }

    public static void getAllName(File file){
        File[] files = file.listFiles();
        for (File f:files) {
            if (f.isDirectory()){
                getAllName(f);
            }else {
                System.out.println(f.getName());
            }
        }
    }
}
