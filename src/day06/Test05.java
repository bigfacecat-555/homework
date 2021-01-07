package day06;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        File file = new File(s);
    }

    public static void deleteFiles(File file){
        if (file.isFile()){
            file.delete();
        }else {
            File[] files = file.listFiles();
            if (files == null){
                file.delete();
            }else {
                for (File f: files) {
                    deleteFiles(f);
                }
                file.delete();
            }
        }
    }
}
