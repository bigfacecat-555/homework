package day06;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String input = scanner.nextLine();
        String[] s = input.split("\\.");
        File file = new File(input);

        if (file.exists()){
            System.out.println("已经存在，创建副本");
            int index = 0;
            while (file.exists()){
                index++;
                file = new File(s[0]+"_副本"+index+"."+s[1]);
            }
            file.createNewFile();
        }else {
            System.out.println("不存在，创建文件");
            file.createNewFile();
        }
        
    }
}
