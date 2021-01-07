package day06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("note.txt");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            if (s.equals("exit")){
                fileWriter.close();
                break;
            }

            fileWriter.write(s);
            fileWriter.write("\n");

        }
    }
}
