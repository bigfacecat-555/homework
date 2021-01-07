package day06;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\day06\\myfile.txt");
        file.createNewFile();
        System.out.println(file.getName());
        System.out.println(file.length());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-yy HH:mm:ss");
        System.out.println(simpleDateFormat.format(file.lastModified()));
        file.deleteOnExit();
    }
}
