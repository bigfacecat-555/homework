package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String regex = "(\\d{3}\\-||\\d{4}\\-)?(\\d{7}||\\d{8})";
        if (str.matches(regex)){
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }
    }
}
