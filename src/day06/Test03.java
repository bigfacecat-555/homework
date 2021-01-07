package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
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
            file.mkdir();
        }else {
            System.out.println("不存在，创建文件");
            file.mkdir();
        }

    }
}
