package day06;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Test07 test07 = new Test07();
		test07.copy2(s);

	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public void copy1(String name) throws IOException {
		int a;
		String[] n = name.split("\\.");
		File file = new File(n[0]+"_copy"+"."+n[1]);
		file.createNewFile();
		FileInputStream fileInputStream = new FileInputStream(name);
		FileOutputStream fileOutputStream = new FileOutputStream(file.getName());
		while ((a = fileInputStream.read()) != -1){
			fileOutputStream.write(a);
		}
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public void copy2(String name) throws IOException {
		String[] n = name.split("\\.");
		File file = new File(n[0]+"_copy"+"."+n[1]);
		file.createNewFile();
		FileInputStream fileInputStream = new FileInputStream(name);
		FileOutputStream fileOutputStream = new FileOutputStream(file.getName());
		byte[] bytes = new byte[1024];
		int a;
		while ((a = fileInputStream.read(bytes)) != -1){
			fileOutputStream.write(bytes,0,a);
		}
	}
}
