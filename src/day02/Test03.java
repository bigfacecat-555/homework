package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String regex = "\\.";
        String[] strarr = str.split(regex);
        for (int i = 0; i < strarr.length; i++) {
            System.out.println(strarr[i]);
        }
    }

}
